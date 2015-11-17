<%@page import="model.etudiant"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
	<tr> <th>NCE  </th> <th>Nom  </th> <th>Ville  </th> <th>Date</th> <th>Sexe</th> <th> Adresse</th> <th> Classe</th></tr>
	<%
	ArrayList<etudiant> l =(ArrayList<etudiant>)  session.getAttribute("list") ;
	 for(int i=0;i<l.size();i++)
     {  
	out.print("<tr><td>"+l.get(i).nce+"</td><td>"+l.get(i).nom+"</td><td>"+l.get(i).ville+"</td><td>"+l.get(i).daten+"</td><td>"+l.get(i).sexe+"</td><td>"+l.get(i).adresse+"</td><td>"+l.get(i).code+"</td></tr>"); 
     }

	%>
	</table>
	
</body>
</html>