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
	Stock maintaining System!  
</h1>
<form:form action="stock_save.do" method="post" commandName="stock">
<form:errors path="*"/>
	<p>
	<form:label path="quantity">Quantity</form:label>
	<form:input id="quantity" path="quantity"/>
	<form:errors id="quantity" path="quantity"/>
	</p>
	
	<p>
	<form:label path="max_storage">Max Storage</form:label>
	<form:input id="max_storage" path="max_storage"/>
	<form:errors id="max_storage" path="max_storage"/>
	</p>
	
	<p>
	<form:button value="Submit">Submit</form:button>
	</p>
</form:form>
</body>
</html>