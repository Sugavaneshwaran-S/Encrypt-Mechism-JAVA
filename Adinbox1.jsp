 <!DOCTYPE html>
<html lang="en">
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="db.Dbcon" %>
<head>
<title>CC08	</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Infirmary Responsive web template, Bootstrap Web Templates, Flat Web Template"/>
</head>
<style>
    body
    {
    background-color: #4e74f2;
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
    }

th, td {
    padding: 10px; 
    font-size: 20px;
    color:white;
    font-family: Philosopher; 
}
button
{
font-size: 15px;
font-family: Vermin Vibes V; 
margin-left: 21%;
}
</style>
<body>
	<table>
 <table border="1" align="center" class="table"  style="color:black; width:90%; text-align:center; font-family: initial; 
 border-color:black; background-color:#ffffff78; border-collapse: unset;">
			<tr>
			<br><br><br><br><br><br><br><br><br>
<th style="text-align:center; color:#00fc0d; font-family: The Devil Net; font-size: 19px;">OWNERNAME</th>
<th style="text-align:center; color:#00fc0d; font-family: The Devil Net; font-size: 19px;">USERNAME</th>
<th style="text-align:center; color:#7600fc; font-family: The Devil Net; font-size: 19px;">FILENAME</th>
<th style="text-align:center; color:#7600fc; font-family: The Devil Net; font-size: 19px;">STATUS</th>
	</tr>
   
   <% 

	Connection con=null;
    con=Dbcon.CreateConnection();
	PreparedStatement ps=con.prepareStatement("SELECT * FROM secure.request");
	ResultSet rs=ps.executeQuery();

	while(rs.next()){	
		
		String owner=rs.getString(1);
		String user=rs.getString(2);
		String filename=rs.getString(3);
		String filekey=rs.getString(4);
	
	%>
				
<tr>
<td style="text-align:center"><%=owner%></td>
<td style="text-align:center"><%=user%></td>
<td style="text-align:center"><%=filename%></td>

<td align="left"><a href="Accept?ownername=<%=owner%>&&filename=<%=rs.getString(3)%>&&username=<%=rs.getString(2)%>
&&filekey=<%=rs.getString(4)%>"><button>ACCEPT</button></a></td>

		</tr>	
	<%} %>
</table>
</table>	   	   
</body>
</html>

