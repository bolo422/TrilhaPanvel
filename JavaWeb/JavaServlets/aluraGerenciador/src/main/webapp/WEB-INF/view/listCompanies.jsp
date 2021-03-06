<%@ page language="java" contentType="text/html; cahrset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, br.com.panvel.gerenciador.modelo.Company, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="entry?action=RemoveCompany" var="delCompany"/>
<c:url value="entry?action=UpdateIndex" var="update"/>
<c:url value="entry?action=ChangeOrder" var="order"/>
<c:url value="entry?action=CompanyEditor" var="editor"/>

<!DOCTYPE html>
<html>
<link rel="stylesheet" href="styles.css">
<body>
<c:import url="logout.jsp"/>

	<br/>
	<h3>Lista de Empresas:</h3>
	<ul>
		<c:forEach items="${comList}" var="com"> <%-- JSTL - EL --%>
			<li class="listCompanyElement"> ${com.id} : ${com.name} - <fmt:formatDate value="${com.openingDate}" pattern="dd/MM/yyyy"/>
			<a href="${editor}&id=${com.id}" > ✍️ </a>
			<a href="${delCompany}&id=${com.id}" > ❌ </a>
			<a href="${order}&id=${com.id}&up=true" > ⬆️ </a>
			<a href="${order}&id=${com.id}&up=false" > ⬇️ </a>
			</li>
		</c:forEach>
	</ul>
	<p> <a href="${update}">Update IDs</a> </p>
	<p> <a href="entry?action=NewCompanyForm">Form</a> </p>

</body>
</html>