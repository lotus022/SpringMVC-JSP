<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>My Details</h1>
<%String name=(String)request.getAttribute("name");
LocalDate date=(LocalDate)request.getAttribute("date");%>
<h3>My Name is: <%=name %></h3>
<h3>Date: <%=date %></h3>
<h3>My Name using Expression Language: ${name}</h3>
<h3>My Name using Expression Language: ${date}</h3>

</body>
</html>