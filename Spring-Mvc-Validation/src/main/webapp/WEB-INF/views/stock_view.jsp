<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stock View</title>
</head>
<body>
<h3>Stock is successfully saved!</h3>
<p>Stock Quantity : ${stock.quantity}</p>
<p>Stock Max Storage : ${stock.max_storage}</p>

<c:url var="urlBack" value="/"></c:url>
<a href="${urlBack}">Back to Home</a>
</body>
</html>