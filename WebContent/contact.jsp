<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Main" method="post">
<img scr="SocialNetwork/WebContent/WEB-INF/logo.png">

<form action="Controller/UserControllerServlet" method="get">
          <input type="submit" value="Registration">
              </form>
<a href="About_Site.jsp">About site</a>

    <table>
    <tr>
        <td><form:label path="aboutsite"><spring:message code="label.aboutsite"/></form:label></td>
        <td><form:input path="aboutsite" /></td> 
    </tr>
    <tr>
        <td><form:label path="rules"><spring:message code="label.rules"/></form:label></td>
        <td><form:input path="rules" /></td>
    </tr>
    <tr>
        <td><form:label path="login"><spring:message code="label.login"/></form:label></td>
        <td><form:input path="login" /></td>
    </tr>
   
       <tr>
        <td><form:label path="rus"><spring:message code="label.rus"/></form:label></td>
        <td><form:input path="rus" /></td>
    </tr>
  
</table>  
    
</body>
</html>