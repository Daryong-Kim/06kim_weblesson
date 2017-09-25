package JspLesson01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SelectServlet extends HttpServlet{
	 protected void service(HttpServletRequest req, HttpServletResponse res)
			 throws ServletException, IOException{
		 	req.setCharacterEncoding("UTF-8");

		 	String id = req.getParameter("id");
		 	String pass = req.getParameter("pass");

		 	HttpSession session = req.getSession(true);
		 	session.setAttribute("id", id);
		 	session.setAttribute("pass", pass);
		 	req.getRequestDispatcher("select.jsp").forward(req,res);

	 }
}