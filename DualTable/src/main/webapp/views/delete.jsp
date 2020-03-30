<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Delete Student Details</h1>
	<h2>${msg }</h2>
	<form:form action="delete" method="post" modelAttribute="student">

		<form:label path="id">Id</form:label>
		<form:input path="id" />
		<br />
		<input type="submit" name="submit" value="DELETE" />

	</form:form>
</body>
</html>