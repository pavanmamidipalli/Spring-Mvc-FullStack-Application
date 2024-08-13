<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details</title>
<link type=text/css rel="stylesheet" href="./css/style.css">
</head>
<body>
<div id="wrapper">
<div id="header">
<h1 id="pav">welcome to Student details</h1>
</div>
</div>
<div id="container">
<div id="context">
<table border="1">
<tr>
<th>Student Name</th>
<th>Student Course</th>
<th>Student Place</th>
<th>update Data</th>
<th>Delete Data</th>
</tr>
<c:forEach var="students" items="${details}">
<c:url var="updatedata" value="/update"> 
<c:param name="studentid" value="${students.id}"></c:param>
</c:url>
<c:url var="deletedata" value="/delete"> 
<c:param name="studentid" value="${students.id}"></c:param>
</c:url>
<tr>
<td>${students.name}</td>
<td>${students.course}</td>
<td>${students.place}</td>
<td><a href="${updatedata}">update</a></td>
<td><a href="${deletedata}">delete</a></td>
</tr>
</c:forEach>
</table>
<input type="button" value="click here to Register" class="add-button" onClick="window.location.href='/showform';return false;"/>
</div>
</div>

</body>
</html>