package com.prac;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("reached display Servlet");
		StudentDao d= new StudentDao();
		
		List<Student> ls=d.getStudent();
		RequestDispatcher rd = request.getRequestDispatcher("showStudent.jsp");
		request.setAttribute("student",ls);
		rd.forward(request, response);
	}



}
