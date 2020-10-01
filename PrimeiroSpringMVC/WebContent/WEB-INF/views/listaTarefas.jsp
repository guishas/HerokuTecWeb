<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tarefas</title>
</head>
<body>
	<table border="1">
		<tr><td><b>ID</b></td>
		<td><b>Tarefa</b></td></tr>
		<c:forEach var="tarefa" items="${tarefas}" varStatus="id">
		<tr>
		<td>${tarefa.id}</td>
		<td>${tarefa.descricao}</td>
		<td><a href="removeTarefa/${tarefa.id}">Remover</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>