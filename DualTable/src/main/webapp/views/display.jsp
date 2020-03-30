<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>DISPLAY STUDENT INFORMATION</h1>
   <table border="2" height="50%" width="50%">
   <tr>
       <th>ID</th>
       <th>NAME</th>
       <th>COURSE</th>
       <th>HOUSE NO</th>
       <th>CITY</th>
   </tr>
   <c:forEach items="${list}" var="st">
   <tr>
     <td>${st.id}</td>
     <td>${st.name}</td>
     <td>${st.course}</td>
     <td>${st.address.houseno}</td>
     <td>${st.address.city}</td>
     </tr>
     </c:forEach>
     </table>
</body>
</html>