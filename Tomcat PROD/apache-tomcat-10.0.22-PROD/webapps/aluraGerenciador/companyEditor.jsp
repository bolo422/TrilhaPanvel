<%@ page language="java" contentType="text/html; cahrset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, br.com.panvel.gerenciador.servlet.Company, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/edit-company" var="editServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Empresa</title>
</head>
<body>
	<form action="${editServlet}?id=${company.id}" method="post">
		<b>${company.name} | <fmt:formatDate value="${company.openingDate}" pattern="dd/MM/yyyy"/></b>
		<br>
		Preencha os dados que deseja editar.
		<br>
		Nome: <input type="text" name="newName" value="${company.name}"/>
		<br>
		<fmt:formatDate value="${company.openingDate}" pattern="yyyy-MM-dd" var="englihFormatedDate"/>
		Data de Abertura: <input type="date" name="newOpenDate" value="${englihFormatedDate}"/>
		<br>
		<input type="submit"/>	
	</form>
	<p><a href="/aluraGerenciador/list-companies">Listar</a></p>
</body>
</html>