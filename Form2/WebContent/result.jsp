
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.File"%>
<%@page import="com.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

String id="1";
System.out.println(id+"heloo");
String driver="com.mysql.jdbc.Driver";
java.sql.Connection conn=null;
String url = "jdbc:mysql://localhost:3306/";;
String db = "mydb1";
ResultSet rs;

/* final String UPLOAD_DIRECTORY = "C:/uploads";
String dirPath=getServletContext().getRealPath("")+ File.separator + UPLOAD_DIRECTORY; 
String img=null; */
try
{
	Class.forName(driver);

	conn=java.sql.DriverManager.getConnection(url+db,"root","");
	java.sql.Statement s=null;
	
	s = conn.createStatement();

	 rs=s.executeQuery("select * from remainder where id='"+id+"'");

System.out.println("heloo1");
	 while(rs.next()){
	
		 %>
		 <table>
		 <tr>
		 <td><h4>Name</h4></td>
		 <td><h4>date</h4></td>
		 <td><h4>time</h4></td>
		 <td><h4>type</h4></td>
		 <td><h4>priority</h4></td>
		 </tr>
		 <tr>
		 <td><%=rs.getString("name") %></td>
		 <td><%=rs.getString("date") %></td>
		 <td><%=rs.getString("time") %></td>
		 <td><%=rs.getString("type") %></td>
		 <td><%=rs.getString("priority") %></td>
		
		 </table>
		 <%
	 }
	
}
catch(Exception e){out.println(e);}



%>
<%
response.setContentType("text/html");
//PrintWriter pw = response.getWriter();



%>

</body>
</html>