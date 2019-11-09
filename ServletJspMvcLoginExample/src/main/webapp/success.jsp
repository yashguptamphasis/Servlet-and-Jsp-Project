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
	<hi>You have loged in </hi>
	<%
	Student student=(Student)request.getAttribute("student");
	String email=student.getEmail();
	%>
	<h1> You are logged in <%=email%></h1>
</body>
</html>