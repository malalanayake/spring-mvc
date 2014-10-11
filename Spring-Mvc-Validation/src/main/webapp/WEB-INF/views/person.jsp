<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
	Person details maintaining System!  
</h1>
<form:form action="person_save.do" method="post" commandName="person">
	<p>
	<form:label path="name">Name</form:label>
	<form:input id="name" path="name"/>
	</p>
	
	<p>
	<form:label path="id">ID</form:label>
	<form:input id="id" path="id"/>
	<form:errors id="id" path="id"/>
	</p>
	
	<p>
	<form:label path="birth_date">Birth Date</form:label>
	<form:input id="birth_date" path="birth_date"/>
	<form:errors id="birth_date" path="birth_date"/>
	</p>
	
	<p>
	<form:label path="emp_date">Employement Date</form:label>
	<form:input id="emp_date" path="emp_date"/>
	<form:errors id="emp_date" path="emp_date"/>
	</p>
	
	<p>
	<form:button value="Submit">Submit</form:button>
	</p>
</form:form>
</body>
</html>