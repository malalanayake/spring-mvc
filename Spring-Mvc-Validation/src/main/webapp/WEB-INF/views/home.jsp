<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Vehicle Data Validation System!  
</h1>
<form:form action="save_vehicle.do" method="post" commandName="vehicle">
	<p>
	<form:label path="name">Name</form:label>
	<form:input id="name" path="name"/>
	</p>
	
	<p>
	<form:label path="year">Year</form:label>
	<form:input id="year" path="year"/>
	<form:errors id="year" path="year"/>
	</p>
	
	<p>
	<form:label path="model">Model</form:label>
	<form:input id="model" path="model"/>
	<form:errors id="model" path="model"/>
	</p>
	
	<p>
	<form:button value="Submit">Submit</form:button>
	</p>
</form:form>
</body>
</html>
