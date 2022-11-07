<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ page import="model.JavaBeans" %>
 <%@ page import="java.util.ArrayList" %>
 <% 
 	@SuppressWarnings("unchecked")
 	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("exames"); 
 %>
 
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Lista de Exames</title>
<script src="scripts/confirmador.js"></script>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Lista de Exames</h1>
	<a href="novo.html" class="botaoNovo">Novo Exame</a>
	<table class="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Paciente</th>
				<th>Exame</th>
				<th>Data</th>
				<th>Resultado</th>
			</tr>
		</thead>
		<tbody>
			<% for (int i = 0; i < lista.size(); i++) {%>
				<tr>
					<td><%=lista.get(i).getId()%></td>
					<td><%=lista.get(i).getNomePaciente()%></td>
					<td><%=lista.get(i).getNomeExame() %></td>
					<td><%=lista.get(i).getData() %></td>
					<td><%=lista.get(i).getResultado() %></td>
					<td class="botao"><a href="select?id=<%=lista.get(i).getId()%>">Editar</a></td> 
					<td class="botao"><a href="javascript:confirmar(<%=lista.get(i).getId()%>)">Excluir</a></td>
				</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>