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

import bean.Ownerbean;

/**
 * Servlet implementation class Dataownerlog
 */
@WebServlet("/Dataownerlog")
public class Dataownerlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dataownerlog() {
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

		String email1=request.getParameter("email");
		HttpSession session=request.getSession();
		response.getContentType();
		session.setAttribute("email1", email1);
		
		System.out.println("Email:"+email1);
		
		String pass=request.getParameter("password");
		System.out.println("Password"+pass);
		
		Ownerbean l=new Ownerbean();
		l.setEmail(email1);
		l.setPass(pass);
		
		Inter u=new Imple();
		boolean r=u.olog(l);
		if(r==true)
		{
			response.sendRedirect("Dataownermain.jsp");
		}
		else
		{
			response.sendRedirect("Error");
		}
	}

}
