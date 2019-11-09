<%@page import="com.prac.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	show in Jsp
	<%
		List<Student> ls= (List)request.getAttribute("student");
		String s1=null;
		for(Student s:ls)
		{
			out.println("<h1>"+"Name : "+s.getName()+"</h1>");
			out.println("Email : "+s.getEmail());
			out.println("Pass : "+s.getPass());
			out.println("Country : "+s.getCountry());
			s1=s.getCountry();
		}	
	%>
	<h1> The test Country is : <%= s1 %></h1>
</body>
</html>