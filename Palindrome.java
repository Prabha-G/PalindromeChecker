package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Palindrome")
public class Palindrome extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		int n=Integer.parseInt(req.getParameter("num"));
		boolean palindrome=Pack.ispalindrome(n);
		req.setAttribute("booleanvalue",palindrome);
		req.getRequestDispatcher("palindrome.jsp").forward(req,res);
	}
}
