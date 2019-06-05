<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	//String nomeEmpresa = (String) request.getAttribute("empresa");
	String nomeEmpresa = request.getParameter("nome");
	System.out.println(nomeEmpresa);
%>
<html>
	<body>
<!--		Empresa <%= nomeEmpresa %> cadastrada com sucesso! !-->
		<c:if test="${not empty empresa}">
			Empresa ${empresa} cadastrada com sucesso!
		</c:if>
		
		<c:if test="${empty empresa}">
			Nenhuma empresa cadastrada.
		</c:if>
	</body>
</html>