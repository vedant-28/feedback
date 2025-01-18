package feedback;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback-submitted")
public class FeedbackServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// GET request
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String feedback = req.getParameter("feedback-message");
		
		// PROCESS form data
		
		// RESPONSE CREATION
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Feedback submitted</h1>");
		writer.println("<h2>Details:</h2>"
					 + "<h3>Email: %s </h3>".formatted(email)
					 + "<h3>Phone number: %s </h3>".formatted(phone)
					 + "<h3>Feedback message: %s </h3>".formatted(feedback));
		// resp.sendRedirect("/home"); -> Can send redirect to somewhere.
	}
	
}
