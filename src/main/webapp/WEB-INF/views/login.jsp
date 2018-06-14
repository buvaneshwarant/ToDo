<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo from JSP!!!</title>
</head>
<%
System.out.println(request.getParameter("name"));
Date date = new Date(); 

%>
<div> Current date is <%=date%></div>
<body>
	
	<form action="/login.do" method="post">
	Enter your name <input type="text" name ="name"/>
					<input type="submit" value = "Login"/>
	</form>
</body>
</html>