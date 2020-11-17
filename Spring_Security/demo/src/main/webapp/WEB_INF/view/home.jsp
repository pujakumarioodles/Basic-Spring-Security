<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri = "http://www.springframework.org/tags" prefix = "spring"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>  
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Users:<security:authentication property="principal.username"/>
Roles:<security:authentication property="principal.authorities"/>
<security:authorize access="hasRole('manager')">
<a href="${pageContext.request.contextPath}/leader">FoR manager</a>
</security:authorize>
<h1>I am puja kumari<h1>
<form:form  action="${pageContext.request.contextPath}/logout" method="post"> 

<input type="submit" value="logout">
</form:form>
</body>
</html>