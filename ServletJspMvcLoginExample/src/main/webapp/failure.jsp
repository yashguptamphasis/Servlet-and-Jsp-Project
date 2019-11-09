<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.prac.Student"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1> You have failed to login </h1>
	<%
	RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
	rd.include(request, response);
	%>
	
</body>
</html>