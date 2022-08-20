package servlet;

import imple.Imple;
import inter.Inter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Uploadbean;

/**
 * Servlet implementation class Request
 */
@WebServlet("/Request")
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String own=request.getParameter("ownername");
		System.out.println("OwnerName: "+own);	
		
		String user=request.getParameter("username");
		System.out.println("UserName: "+user);
		
		String filename=request.getParameter("filename");
		System.out.println("Filename: "+filename);
		
		String key=request.getParameter("filekey");
		System.out.println("Key: "+key);
		
		Uploadbean rq=new Uploadbean();
		rq.setOwner(own);
		rq.setUser(user);
		rq.setFilename(filename);
		rq.setFilekey(key);
		
		
		Inter jj=new Imple();
		int w=jj.req(rq);
		if(w==1)
		{
			response.sendRedirect("Reqsendsuccess.jsp");
		}
		else
		{
			response.sendRedirect("Fnf.jsp");
		}
		
	}

}
