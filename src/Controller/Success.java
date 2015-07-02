package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Success
 */
//@WebServlet("/Success")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("" + "" + "<center>"
				+ "You've been successfully registered." + "</center>" + ""
				+ "");
		writer.println(""
				+ ""
				+ "<center>"
				+ "Please click on link in your activation message in Email to get full registration"
				+ "</center>" + "" + "");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		}

}
