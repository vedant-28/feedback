package feedback.session.mgmt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Req1Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = "ABC";
		Cookie cookie = new Cookie("userName", userName);
		cookie.setMaxAge(10 * 60);
		resp.addCookie(cookie);
		
		
		//// HttpSession method for session mgmt:
		// session creation
		String userId = "1001";
		HttpSession session = req.getSession();
		session.setAttribute("userId", userId);
		session.setMaxInactiveInterval(10 * 60);
		
		// response creation
		resp.setContentType("text/html");
		resp.getWriter().println("<h2>Cookie with session id is set...</h2>");
	}
}
