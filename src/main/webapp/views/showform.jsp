<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
<link type=text/css rel="stylesheet" href="./css/style.css">
<link type=text/css rel="stylesheet" href="./css/add-style.css">
</head>
<body>
<div id="wrapper">
<div id="header">
<h1 >welcome to Student details</h1>
</div>
</div>
<form:form action="studentregister" modelAttribute="details">
<table>
<tr>
<td><form:hidden  path="id"/></td>
</tr>
<tr>
<th>student name</th>
<td><form:input type="text" path="name"/></td>
</tr>
<tr>
<th>student course</th>
<td><form:input type="text" path="course"/></td>
</tr>
<tr>
<th>student place</th>
<td><form:input type="text" path="place"/></td>
</tr>
<tr>
<td><input type="submit" value="register"></td>
</tr>
</table>
</form:form>

</body>
</html>