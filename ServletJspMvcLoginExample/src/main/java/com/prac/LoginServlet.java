package com.prac;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email=request.getParameter("email");
		String pass= request.getParameter("pass");
		System.out.println(email);
		System.out.println(pass);
		
		Student s= new Student();
		s.setEmail(email);
		s.setPass(pass);
		
		
		System.out.println("value stored in pojo"+s);
		if(s.validate())
		{
			RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
			request.setAttribute("student", s);
			rd.forward(request, response);
			System.out.println("login done write");
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("failure.jsp");
			
			rd.forward(request, response);
			System.out.println("login done wrong");
		}
	}

}
