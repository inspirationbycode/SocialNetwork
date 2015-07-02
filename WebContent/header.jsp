<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 
<h3><spring:message code="label.title"/></h3>
 
<span style="float: right">
    <a href="?lang=en">en</a> 
    | 
    <a href="?lang=de">ru</a>
</span>
</body>
</html>