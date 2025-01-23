<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String msg=(String)request.getAttribute("msg");
if(msg!=null)
{
%>
<p class="text-center text-danger"><%=msg %></p>
<%} %>

<div class="container w-75">
	
	<h1 class="text-center text-dark">Admin login</h1>
	
	<form action="adminlogin" method="post">
	
	<label class="form-label" for="uname">Enter UserName</label>
	<input type="text" name="uname" class="form-control mb-3" id="uname">
	
	<label class="form-label" for="upass">Enter Password</label>
	<input type="text" name="upass" class="form-control mb-3" id="upass">
	
	
	
	<button class="btn btn-success">Login</button>
	
	</form>
	
</div>
</body>
</html>