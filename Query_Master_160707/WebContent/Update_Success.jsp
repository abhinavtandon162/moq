<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successfully Added Trainee Details</title>
</head>

<body>

Hi,Updated Values are:
<form:form> 
		<c:if test="${ QueryRes.Solution_given_by != null}">
Trainee Info
<c:out value="${QueryRes.Solution_given_by}"></c:out>
			<table border="3">
		
					<tr>
						<th bgcolor="bisque">Query Id</th>
						<th bgcolor="bisque">Select technology</th>
						<th bgcolor="bisque">Question</th>
						<th bgcolor="bisque">Question Raised by</th>
						<th bgcolor="bisque">Solution</th>
						<th bgcolor="bisque">Answered by</th>
					</tr>
					<tr>
						<td><c:out value="${QueryRes.id}"></c:out></td>
						<td><c:out value="${QueryRes.technology}"></c:out></td>
						<td><c:out value="${QueryRes.query_raised_by}"></c:out></td>
						<td><c:out value="${QueryRes.query}"></c:out></td>
						<td><c:out value="${QueryRes.solutions}"></c:out></td>
						<td><c:out value="${QueryRes.solution_given_by}"></c:out></td>
					</tr>

					<tr>
						<td colspan="5" align="center">
						<a href="index.jsp">Click Here To Go to Home</a>
						</td>
					</tr>
				</table>
		</c:if>
	</form:form>
<a href="Welcome.jsp">Click here to go to Main Menu</a>

</body>
</html>