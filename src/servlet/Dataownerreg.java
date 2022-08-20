package servlet;


import imple.Imple;
import inter.Inter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Ownerbean;

/**
 * Servlet implementation class Dataownerreg
 */
@WebServlet("/Dataownerreg")
public class Dataownerreg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dataownerreg() {
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
		
		String name=request.getParameter("name");
		System.out.println("Name"+name);
		
		String mail=request.getParameter("email");
		System.out.println("Email"+mail);
		
		String num=request.getParameter("number");
		System.out.println("Mobile"+num);
		
		String pass=request.getParameter("password");
		System.out.println("Pass"+pass);
		
		String cpass=request.getParameter("conpassword");
		System.out.println("Conpass"+cpass);
		
		Ownerbean i=new Ownerbean();
		i.setName(name);
		i.setEmail(mail);
		i.setNumber(num);
		i.setPass(pass);
		i.setConpass(cpass);
		
		Inter ii=new Imple();
        int d=ii.oreg(i);
        if(d==1)
        {
        	response.sendRedirect("Dataownerlogin.jsp");
        }
        else
        {
        	response.sendRedirect("Error");
        }
		
	}

}
