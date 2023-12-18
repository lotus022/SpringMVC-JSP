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
<h2>List of Friends......</h2>
<% List<String> li=(List<String>)request.getAttribute("listKey");
 for(String fr: li){ %>
<h3><%= fr %></h3>
<%} %>

</body>
</html>