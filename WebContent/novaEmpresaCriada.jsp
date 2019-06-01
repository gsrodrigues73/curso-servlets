<%
	//String nomeEmpresa = (String) request.getAttribute("empresa");
	String nomeEmpresa = request.getParameter("nome");
	System.out.println(nomeEmpresa);
%>
<html>
	<body>
		Empresa <%= nomeEmpresa %> cadastrada com sucesso!
	</body>
</html>