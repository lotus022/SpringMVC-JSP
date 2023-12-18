<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<html>
<body>
<h2>Hello World!</h2>
Path Id: ${userid }
<% String a=(String)request.getAttribute("userid");
if(a.equals("1"))
	out.println("Green");
else
	out.println("yellow");%>
</body>
</html>
