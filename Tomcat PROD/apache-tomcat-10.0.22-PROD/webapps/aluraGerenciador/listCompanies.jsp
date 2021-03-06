<%@ page language="java" contentType="text/html; cahrset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, br.com.panvel.gerenciador.servlet.Company, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="remove-company" var="delCompany"/>
<c:url value="update-ids" var="update"/>
<c:url value="change-order" var="order"/>
<c:url value="company-editor" var="edit"/>

<!DOCTYPE html>
<html>
<body>
	<h1>Lista de Empresas:</h1>
	<ul>
		<c:forEach items="${comList}" var="com"> <%-- JSTL - EL --%>
			<li> ${com.id} : ${com.name} - <fmt:formatDate value="${com.openingDate}" pattern="dd/MM/yyyy"/>
			<a href="${edit}?id=${com.id}" > | ✍️</a>
			<a href="${delCompany}?id=${com.id}" > | ❌</a>
			<a href="${order}?id=${com.id}&up=true" > | ⬆️</a>
			<a href="${order}?id=${com.id}&up=false" > | ⬇️</a>
			</li>
		</c:forEach>
	</ul>
	<p> <a href="${update}">Update IDs</a> </p>
	<p> <a href="/aluraGerenciador/formNewCompany.jsp">Form</a> </p>

</body>
</html>