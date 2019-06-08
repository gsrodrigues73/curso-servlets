<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<c:if test="${not empty empresa}">
			Empresa ${empresa} cadastrada com sucesso!<br/><br/>
		</c:if>
		Lista de empresas: <a href="formNovaEmpresa.jsp">Incluir nova</a><br>
		
		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> 
				<a href="formEditaEmpresa.jsp?id=${empresa.id}">Editar</a> 
				<a href="excluirEmpresa?id=${empresa.id}">Excluir</a></li>
			</c:forEach>
		</ul>

<!-- 		
		<ul>
<%
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
		for (Empresa empresa : lista) {
%>
			<li><%=empresa.getNome() %></li>
<%
		}
%>
		</ul>
 -->
 
	</body>
</html>