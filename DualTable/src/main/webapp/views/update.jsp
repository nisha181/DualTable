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
    <h1>Update Student Details</h1>
    <h2>${msg }</h2>
    <form:form action="update" method="post" modelAttribute="student">

		<form:label path="id">Id</form:label>
		<form:input path="id" />
		<br/>
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<br/>
		
		<form:label path="address.houseno">House No</form:label>
		<form:input path="address.houseno" />
		<br/>
		<input type="submit" name="submit" value="UPDATE" />

	</form:form>


</body>
</html>