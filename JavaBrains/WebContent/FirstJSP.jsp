<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>

<!-- JSP declarations -->
<%! 
public String Add(int x, int y){
	return "Sum of given numbers is = " + (x + y) + ". and current time is " + new Date() ;
}
%>

<!-- JSP Scriptlets -->
<% String k = Add(3,4); %>

<!-- JSP expressions -->
<%=k %>

<%
String userName = request.getParameter("name"); 
if (userName != null){
	session.setAttribute("sessionUserName", userName);
	application.setAttribute("applicationUserName", userName);
	pageContext.setAttribute("pageContextUserName", userName);
	
	//This  line is equivalent to application.setAttribute line above
	pageContext.setAttribute("applicationUserName", userName, PageContext.APPLICATION_SCOPE);
	
}

%>
<br>
User name in the request is : <%= userName %> <br>
User name in the session object is : <%= session.getAttribute("sessionUserName") %> <br>
User name in the appliaction context object is : <%= application.getAttribute("applicationUserName") %> <br>
</body>
</html>