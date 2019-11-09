package com.prac;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String name=req.getParameter("name");
		String email= req.getParameter("email");
		String pass=req.getParameter("pass");
		String country=req.getParameter("country");
		
//		PrintWriter out= res.getWriter();
//		out.println("reched register   \n");
//		out.println("name : "+name);
//		out.println("email : "+email);
//		out.println("pass : "+pass);
//		out.println("country : "+country);
//			
		Student s=new Student();
//		
		s.setName(name);
		s.setEmail(email);
		s.setPass(pass);
		s.setCountry(country);
		System.out.println(s);
		StudentDao sd = new StudentDao();
		int res1=sd.save(s);
		System.out.println("status : "+res1);
//		sd.connection();
//		
		//System.out.println(s);
		
	}   
    	

}
