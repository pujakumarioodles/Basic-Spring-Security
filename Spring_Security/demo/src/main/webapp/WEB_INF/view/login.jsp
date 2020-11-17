<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags" prefix = "spring"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
.failed
{
color:red;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/authenticateTheUser"  method="post">
<c:if test="${param.error !=null}">
<i class="failed">Sorry u entered wrong username</i></c:if><br>
<c:if test="${param.logout !=null}">
<i class="failed">u logged out</i></c:if><br>
<label>Username</label>
<input type="text" name="username"><br>
<label>password</label>
<input type="password" name="password"><br>
<input type="submit" name=""></form:form>
</body>
</html>