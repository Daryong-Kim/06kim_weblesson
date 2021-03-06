package JspLesson01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResistServlet extends HttpServlet{
	 protected void service(HttpServletRequest req, HttpServletResponse res)
			 throws ServletException, IOException{
		 	req.setCharacterEncoding("UTF-8");

		 	Word wd = new Word(req.getParameter("English"), req.getParameter("Japanese")); //Wordクラスのインスタンス
			WordDAO wordDAO = new WordDAO(); //WordDAOクラスのインスタンス

			int recordNum = wordDAO.resistWords(wd);
			req.setAttribute("recordNum", recordNum);

		 	HttpSession session = req.getSession(true);
		 	 session.setAttribute("English", req.getParameter("English"));
		 	 session.setAttribute("Japanese", req.getParameter("Japanese"));

		 	req.getRequestDispatcher("result.jsp").forward(req,res);

		 	//セッションの情報を破棄
		 	/*session.removeAttribute("id");
		 	session.removeAttribute("pass");

		 	//セッションそのものを破棄
		 	session.invalidate();*/
	 }
}