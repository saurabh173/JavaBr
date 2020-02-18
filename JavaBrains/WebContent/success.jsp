<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.servletnjsp.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Login Successful
<%
User user = (User) request.getAttribute("user");
%>

<br>
Hello <%=user.getUserName()  %>

</body>
</html>