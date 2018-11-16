<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1>
	<tr>
		<th bgcolor="bisque">Query Id</th>
		<th bgcolor="bisque">Technology</th>
		<th bgcolor="bisque">Query Raised By</th>
		<th bgcolor="bisque">Query</th>
		<th bgcolor="bisque">Solutions</th>
		<th bgcolor="bisque">Solutions given By</th>
	</tr>
	<tr>
	<td><c:out value="${QueryList.id}"></c:out></td>
	<td><c:out value="${QueryList.technology}"></c:out></td>
	<td><c:out value="${QueryList.query_raised_by}"></c:out></td>
	<td><c:out value="${QueryList.query}"></c:out></td>
	<td><c:out value="${QueryList.solutions}"></c:out></td>
	<td><c:out value="${QueryList.solution_given_by}"></c:out></td>
	</tr>
	<tr>
		<td colspan="5" align="center"><a href="index.jsp">Click Here To Go to Home</a></td>
	</tr>
</table>
</body>
</html>