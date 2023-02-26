<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> hello</h1>
<h2>expression try</h2>
<%=1+2 %>
<hr>
<h1>Now</h1>
<%= new Date().toGMTString() %>
<p>END</p>
</body>
</html>