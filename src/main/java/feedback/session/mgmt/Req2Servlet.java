package feedback.session.mgmt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/feedback/servlet2")
public class Req2Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		boolean flag = false;
		
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				String name = c.getName();
				if(name.equals("userName")) {
					writer.println("<h1>Welcome: %s</h1>".formatted(c.getValue()));
					flag = true;
				} else if(name.equals("userId")) {
					System.out.println("userName: " + c.getValue());
					System.out.println("userId: " + c.getValue());
					flag = true;
				}
			}
		}
		
		//// HttpSession method for session mgmt:
		HttpSession session = req.getSession();
		String userId = (String) session.getAttribute("userId");
		writer.println("<h2>UserId: %s</h2>".formatted(userId));
		
		if(!flag) {
			writer.println("<h1>No user logged in...</h1>");
		}
	}
}
