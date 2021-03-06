<%@ page language="java" contentType="text/html; cahrset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, br.com.panvel.gerenciador.modelo.Company, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entry?action=EditCompany" var="editServlet"/>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<title>Editar Empresa</title>
</head>
<body>
<c:import url="logout.jsp"/>
	<form action="${editServlet}&id=${company.id}" method="post">
		<b>${company.name} | <fmt:formatDate value="${company.openingDate}" pattern="dd/MM/yyyy"/></b>
		<br>
		<br>
		Nome: <br/><input type="text" name="newName" value="${company.name}" required>
		<br>
		<fmt:formatDate value="${company.openingDate}" pattern="yyyy-MM-dd" var="englihFormatedDate"/>
		Data de Abertura: <br/><input type="date" name="newOpenDate" value="${englihFormatedDate}" required>
		<br>
		<input class="isubmit" type="submit" value="Submit">
	</form>
	<p><a href="entry?action=ListCompanies">Listar</a></p>
</body>
</html>