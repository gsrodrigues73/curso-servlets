<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="br.com.alura.gerenciador.modelo.Banco" %>
<%@ page import="br.com.alura.gerenciador.modelo.Empresa" %>

<!-- c:url value="/editaEmpresa" var="linkServletEditaEmpresa"/> -->
<c:url value="/entrada" var="linkEntradaServlet"/>

<%
		String idEmpresa = request.getParameter("id");

		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresaId(Integer.parseInt(idEmpresa));
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editando empresa</title>
</head>
<body>

	<c:import url="logout-parcial.jsp" />
	
	<!-- form action="${linkServletEditaEmpresa}" method="post"> -->
	<form action="${linkEntradaServlet}" method="post">
		<input type="hidden" name="acao" value="EditaEmpresa">
		<input type="hidden" name="id" value="<%=idEmpresa%>">
		Nome: <input type="text" name="nome" value="<%=empresa.getNome() %>" />
		Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="<%=empresa.getDataAbertura() %>" pattern="dd/MM/yyyy"/>" />
		
		<input type="submit" />
	</form>
</body>
</html>