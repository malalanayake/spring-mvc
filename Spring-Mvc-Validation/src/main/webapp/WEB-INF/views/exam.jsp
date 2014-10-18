<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exam</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<h3>This is Employee form</h3>

	<form:form action="save_employee.do" method="post"
		commandName="employee">
		<form:errors path="*" cssClass="error"></form:errors>
		<br />
		<form:label path="empName">
			<spring:message code="employee.name" />
		</form:label>
		<form:input id="empName" path="empName" />
		<form:errors id="empName" path="empName" cssClass="error"></form:errors>
		<br />
		<form:label path="birthDay">
			<spring:message code="employee.birth" />
		</form:label>
		<form:input id="birthDay" path="birthDay" />
		<form:errors id="birthDay" path="birthDay" cssClass="error"></form:errors>
		<br />

		<form:label path="user.userName">
			<spring:message code="employee.username" />
		</form:label>
		<form:input id="user.userName" path="user.userName" />
		<form:errors id="user.userName" path="user.userName" cssClass="error"></form:errors>
		<br />

		<form:label path="user.passWord">
			<spring:message code="employee.password" />
		</form:label>
		<form:password id="user.passWord" path="user.passWord" />
		<form:errors id="user.passWord" path="user.passWord" cssClass="error"></form:errors>
		<br />
		<form:button name="submit">
			<spring:message code="employee.save" />
		</form:button>
	</form:form>
	<br />

	<a href="<c:url value="language/en"/>">English</a>|
	<a href="<c:url value="language/zh"/>">chinese</a>


</body>
</html>