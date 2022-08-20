package servlet;

import imple.Imple;
import inter.Inter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Userbean;

/**
 * Servlet implementation class Datauserlog
 */
@WebServlet("/Datauserlog")
public class Datauserlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Datauserlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email=request.getParameter("email");
		
		HttpSession session=request.getSession();
		response.getContentType();
		session.setAttribute("mail", email);
		
		System.out.println("mail:"+email);
		
		String pass=request.getParameter("password");
		System.out.println("Password"+pass);
		
		Userbean l=new Userbean();
		l.setEmail(email);
		l.setPass(pass);
		
		Inter u=new Imple();
		boolean r=u.ulog(l);
		if(r==true)
		{
			response.sendRedirect("Datausermain.jsp");
		}
		else
		{
			response.sendRedirect("Error");
		}
				
	}

}
