<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reminders</title>
</head>
<body>

<center>
<h2>Reminders</h2>
<form method="post" action="Upload11" name="form2">
<table>

<tr>
<td>Name</td>
<td><input type="text" name="name"/></td>
</tr>
<tr>
<td>Date</td>
<td><input type="text" name="date"/></td>
</tr>
<tr>
<td>Time</td>
<td><input type="text" name="time"/></td>
</tr>
<tr>
<td>Type</td>
<td><input type="text" name="type"/></td>
</tr>
<tr>
<td>Priority</td>
<td><input type="text" name="priority"/></td>
</tr>


<tr><td>
<input type="submit" name="save" value="Save"/>
</td></tr>
</table>
</form>
</center>


</body>
</html>