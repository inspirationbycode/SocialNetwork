package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.UserDAO;

/**
 * Servlet implementation class UserControllerServlet
 */
@WebServlet("/UserControllerServlet")
public class UserControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String phone_number = request.getParameter("phone_number");
		String password = request.getParameter("password");
		//SecureRandom
	
		HttpSession session = request.getSession(true);
		
		try {
			UserDAO userDAO = new UserDAO();
			userDAO.addUserDetails(first_name, last_name, email, phone_number,
					password);
			response.sendRedirect("Success");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 response.sendRedirect("register.jsp");

		//request.setAttribute("servletName", "UserControllerServlet");

	// try {
	    //  getServletConfig().getServletContext().getRequestDispatcher(
	        //"/register.jsp").forward(request,response);

	    
	 //response.sendRedirect("/register.jsp");
	// }
	// catch (ServletException e) {
	      // TODO Auto-generated catch block
	    //  e.printStackTrace();
	    //} catch (IOException e) {
	      // TODO Auto-generated catch block
	   //   e.printStackTrace();
	 //  }
	  }
	
}
