<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<form:form modelAttribute="query" action="Update_Query" >
		<table>
			<tr>
				<td>Update Query Id :</td>
				<td><form:input path="id" /></td>
				<td><input type="submit" value="Fetch To Update" /></td>
		</table>
	</form:form>


	<form:form modelAttribute="QueryRes"  action="Update_Persisted_Query">
		<c:if test="${QueryRes.solution_given_by != null}">
		<h1>Gear Technical Forum</h1><br>
				<h1>Answer the query</h1>
	<table border="2">
				<tr>
					<th>query ID</th>
					<td><form:input path="id" /></td>
				</tr>
				<tr>
					<th>Select technology</th>
					<td><form:input path="technology" size="25" /></td>
				</tr>
				<tr>
					<th>Question</th>
					<td><form:input path="question" size="200" /></td>
			</tr>
			 
               
			<tr>
					<th>Question Raised by</th>
					<td><form:input path="question_raised_by" size="20" /></td>
			</tr>
				<tr>
					<th>Solutions</th>
					<td><form:input path="solutions" size="200" /></td>
			</tr>
			<tr>
					<th>Answered by:</th>
					<td><form:input path="solution_given_by" size="20" /></td>
			</tr>
			</table>
		</c:if>

	</form:form>
</body>
</html>