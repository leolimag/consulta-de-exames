<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Editar Exame</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div id="formEditar">
		<h1 id ="editar">Editar</h1>
		<form name="fExame" action="update">
			<p><label id="idEx">Id:</label><input type="text" name="id" id="idEx"  readonly value="<%out.print(request.getAttribute("id"));%>"></p>
			<p><label id="nomePac">Paciente:</label><input type="text" name="nomePaciente" id="nomePac"  value="<%out.print(request.getAttribute("nomePaciente"));%>"></p>
			<p><label id="nomeEx">Exame:</label><input type="text" name="nomeExame" id="nomeEx" value="<%out.print(request.getAttribute("nomeExame"));%>"></p>
			<p><label id="data">Data:</label><input type="date" name="data" id="data"  value="<%out.print(request.getAttribute("data"));%>"></p>
			<p><label id="rst">Resultado:</label><input type="text" name="resultado" id="rst"  value="<%out.print(request.getAttribute("resultado"));%>"></p>
			<p><input type="button" value="Salvar" onclick="validar()" class="botaoEdit"></p>
		</form>
		<p><a href="main" class="link">Voltar</a></p>
	</div>
	<script src="scripts/validador.js"></script>
</body>
</html>