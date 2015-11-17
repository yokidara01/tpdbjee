<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form name="f" method="POST" action="Save">
<center><h3>Saisie Etudiant</h3></center>

<br>
<br>

<label>NCE </label> <input type="text" name="nce"/><label>Nom</label><input type="text" name="nom"><br>

<label>Date Naissance </label> <input type="text" name="date"/><label>Sexe</label> <input type="radio" name="sexe" value="homme"/><label>Masculin</label> <input type="radio" name="sexe" value="femme"/><label>Féminin</label><bR>
 <label>Adresse</label> <input type="text" name="ads"/> 
 
 <label>Ville</label>
 <select name="ville">
 <option value="Sousse">
 Sousse
 </option> 
 
  <option value="Monastir">
Monastir
 </option> 
 
 
 </select><br>
  <label>Code Classe</label>
  <select name="code">
 <option value="01">
 MDW
 </option> 
 
  <option value="03">
DSI
 </option> 
 
   <option value="02">
RSI
 </option> 
 
    <option value="04">
SEM
 </option> 
 
 </select>
 <br>
<button type="submit">Enregistrer</button><button type="reset">Annuler</button><br>

<a href="Afficher" >Afficher les etudiants</a>

</form>
</body>
</html>

