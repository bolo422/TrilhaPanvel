<%@ page language="java" contentType="text/html; cahrset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, br.com.panvel.gerenciador.servlet.Company, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<body> <%-- Expression language - EL --%>
	
		<c:if test="${not empty companyName}">
			Empresa ${companyName} cadastrada com sucesso.
		</c:if>
		
		<c:if test="${empty companyName}">
			Falha, � necess�rio informar uma empresa para cadastrar.
		</c:if>
		
		<p> <a href="/aluraGerenciador/list-companies">Listar</a> </p>
		<p> <a href="/aluraGerenciador/formNewCompany.jsp">Form</a> </p>
	</body>
</html>