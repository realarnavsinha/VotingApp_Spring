<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>


<%
String check=(String)request.getAttribute("check");
if(check!=null)
{
%>
<h1 class="text-center">Admin add Your Candidate</h1>
<a href="adminlogout" class="btn btn-outline-danger mb-4">Logout</a>

<a href="deletecandidate" class="btn btn-outline-danger mb-4">Delete Candidates</a>


<div class="fluid-container w-50">

<form action="addc" method="post">

<label class="form-label" for="c1">Enter c1:</label>
<input type="text" name="c1" class="form-control mb-3" id="c1">

<label class="form-label" for="c1">Enter c2:</label>
<input type="text" name="c2" class="form-control mb-3" id="c2">

<label class="form-label" for="c1">Enter c3:</label>
<input type="text" name="c3" class="form-control mb-3" id="c3">

<label class="form-label" for="c1">Enter c4:</label>
<input type="text" name="c4" class="form-control mb-3" id="c4">

<button class="btn btn-success">Add</button>

</form>

</div>


<%
}
else
{
	response.sendRedirect("adminlogin.jsp");
}
%>


</body>
</html>