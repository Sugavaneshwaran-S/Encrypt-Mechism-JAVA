package servlet;

import imple.Imple;
import inter.Inter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Userbean;

/**
 * Servlet implementation class Datauserreg
 */
@WebServlet("/Datauserreg")
public class Datauserreg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Datauserreg() {
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
		System.out.println("Name: "+name);
		
		String mail=request.getParameter("email");
		System.out.println("Email: "+mail);
		
		String numb=request.getParameter("number");
		System.out.println("Number: "+numb);
		
		String pswd=request.getParameter("password");
		System.out.println("Pass: "+pswd);
		
		String cpswd=request.getParameter("conpassword");
		System.out.println("Cpass: "+cpswd);
		
		String idd=request.getParameter("idd");
		System.out.println("Uid: "+idd);
		
	    Userbean u=new Userbean();
	    u.setName(name);
	    u.setEmail(mail);
	    u.setNumber(numb);
	    u.setPass(pswd);
	    u.setCpass(cpswd);
	    u.setIddd(idd);
	    
	    Inter r=new Imple();
	    int p=r.ureg(u);
	    if(p==1)
	    {
	    	response.sendRedirect("Datauserlogin.jsp");
	    }
	    else
	    {
	    	response.sendRedirect("Error");
	    }
	}

}
