<%@page import="com.maitq2.web.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	show User:
	<%
		User user = (User)request.getAttribute("objUser");
		out.println(user);
	
	%>
</body>
</html>