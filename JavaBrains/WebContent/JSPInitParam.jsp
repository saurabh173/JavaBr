<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Init Param Test</title>
</head>
<body>
<%!
public void jspInit(){
	String defaltUser = getServletConfig().getInitParameter("defaultUser");
	ServletContext ctx = getServletContext();
	ctx.setAttribute("servCtxDefaultUser", defaltUser);
}
%>
The default user from servlet config is <%= getServletConfig().getInitParameter("defaultUser") %> <br>
The value in Servlet context is <%= getServletContext().getAttribute("servCtxDefaultUser") %> <br>
</body>
</html>