<%@ page language="java" contentType="text/html; cahrset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, br.com.panvel.gerenciador.modelo.Company, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="entry?action=Login" var="loginAction"/>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<title>Cadastrar Empresa</title>
</head>
<body>



	<form action="${loginAction}&" method="post">
	
		Login: <br/><input type="text" name="login" required>
		<br>
		Password: <br/><input type="password" name="password" required>
		<br>
		<input class="isubmit" type="submit" value="Login">
		
	</form>
	
</body>
</html>