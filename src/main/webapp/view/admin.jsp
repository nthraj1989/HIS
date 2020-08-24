<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<h1>Registration Page</h1>

	<form:form action="/register" method="POST" modelAttribute="user"
		id="form">
		<table>
			<tr>
				<th>First Name:</th>
				<td><form:input path="firstName" /> <span id="fname"></span></td>
			</tr>
			<tr>
				<th>Last Name:</th>
				<td><form:input path="lastName" /> <span id="lname"></span></td>
			</tr>

			<tr>
				<th>Email:</th>
				<td><form:input path="userEmail" type="email" id="emailId" />
					<font color="red"> <span id="email"></span> <span
						id="errmsg"></span></font></td>
			</tr>


			<tr>
				<th>Gender:</th>
				<td>Male:<form:radiobutton path="gender" value="M" id="gender" />
					Female:<form:radiobutton path="gender" value="F" id="gender" /> <span
					id="gender"></span>
				</td>
			</tr>

			<tr>
				<th>Role:</th>
				<td><form:select path="Role">
						<form:option value="">-Select-</form:option>
						<form:option value="admin">Admin</form:option>
						<form:option value="caseworker">CW</form:option>
					</form:select> <span id="Role"></span></td>
			</tr>

<tr>
				<th></th>
				<td><input type="submit" value="Reset">&nbsp; <input
					type="submit" value="save" id="btnSubmit"></td>
			</tr>
		</table>
	</form:form>



</body>
</html>