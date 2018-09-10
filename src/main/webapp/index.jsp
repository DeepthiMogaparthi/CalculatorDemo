<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {background-color: powderblue;}
h1   {color: green;}
p    {color: red;}
</style>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<h1 style="text_align=center">Calculator</h1>
<form method="get" action="Calculator" align="center">
<label>First number:</label>
<input type="text" name="n1" />
<br />
<label>Second number : </label>
<input type="text" name="n2" />
<br />
<div>
<label>
<input type="radio" name="r1" value="add" />addition
<br />
</label>
<input type="radio" name="r1" value="sub" />subtraction 
<br />
<input type="radio" name="r1" value="mul" />multiplication
<br />
<input type="radio" name="r1" value="div" />division
<br /> 
</div>
<h2>Result : <%= request.getParameter("result") %></h2>
<input type="submit" value="submit" />
</form>
</body>
</html>
