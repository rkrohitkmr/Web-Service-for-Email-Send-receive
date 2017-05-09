package com.my.proj;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	
	
    public MyServlet() {
        // TODO Auto-generated constructor stub
    	
    }
    	
  /*  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String email=request.getParameter("emailid");
        String password=request.getParameter("pas");
        String Remail=request.getParameter("to");
        String sub=request.getParameter("sub");
        String content=request.getParameter("content");
        
        String port=request.getLocalPort()+"";
       MailClass m=new MailClass();
        m.sendMail(email,password,Remail,sub,content,port);
        }*/

    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		 response.setContentType("text/html;charset=UTF-8");
	        String email=request.getParameter("emailid");
	        String password=request.getParameter("pas");
	        String Remail=request.getParameter("to");
	        String sub=request.getParameter("sub");
	        String content=request.getParameter("content");
	        
	        String port=request.getLocalPort()+"";
	       MailClass m=new MailClass();
	        m.sendMail(email,password,Remail,sub,content,port);
		 
	        RequestDispatcher rd=null;
	        rd=request.getRequestDispatcher("enter.html");
	        rd.forward(request, response);}
		//doGet(request, response);
	

}
