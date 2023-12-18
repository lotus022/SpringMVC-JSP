<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>
	<h3>Your Registrtaion is successful...</h3>
	
	<h4>User Details:</h4>
	${student }<br><br>
	Name: ${student.name }<br>
	Id:${student.id }<br>
	Courses: ${student.courses }
	
</body>
</html>