<%@page import="com.Model.Candidate"%>
<%@page import="java.util.List"%>
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
String check = (String) request.getAttribute("check");
if(check!=null){
%>

<h1 class="text-center"><%=check %>Vote For Your Candidate</h1>
<a href="logout" class="btn btn-outline-danger">Logout</a> 

<!-- reading candidates -->
<form action="#">
<%
List<Candidate> l=(List<Candidate>) session.getAttribute("l");
if(l!=null){
	for(Candidate c:l){
%>

	<label class="form-label"><%=c.getCname() %></label>
	<input type="radio" name="candidatename" value="<%=c.getCname()%>" class="form-check mb-3">
<%} %>
<button class="btn btn-info">Vote</button>
<%
}
else{
%>
<h1 class="text-center">No Candidates</h1>
<%} %>
</form>
<%
}
else{
	response.sendRedirect("login.jsp");
}
%>

</body>
</html>