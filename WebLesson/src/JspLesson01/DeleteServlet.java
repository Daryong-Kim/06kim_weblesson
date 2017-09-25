package JspLesson01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet{
	 protected void service(HttpServletRequest req, HttpServletResponse res)
			 throws ServletException, IOException{
		 	req.setCharacterEncoding("UTF-8");

		 	String delword = new String(req.getParameter("delword")); //Stringクラスのインスタンス
			WordDAO wordDAO = new WordDAO(); //WordDAOクラスのインスタンス

			wordDAO.deleteWords(delword);
			req.setAttribute("delword", delword);

		 	req.getRequestDispatcher("result2.jsp").forward(req,res);
	 }
}