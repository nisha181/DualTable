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
    <h1>Insert Student Details</h1>
    <h2>${msg }</h2>
    <form:form action="insert" method="post" modelAttribute="student">

		<form:label path="id">Id</form:label>
		<form:input path="id" />
		<br/>
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<br/>
		
		<form:label path="course">Course</form:label>
		<form:input path="course" />
		<br/>
		
		<form:label path="address.houseno">House No</form:label>
		<form:input path="address.houseno" />
		<br/>
		<form:label path="address.city">City</form:label>
		<form:input path="address.city" />
		<br/>
		<input type="submit" name="submit" value="SUBMIT" />

	</form:form>


</body>
</html>