<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adiconar</title>
</head>
<body>
	<h3>Adicionar Tarefas</h3>
	<form action="adicionaTarefa" method="post">
		Descrição: <br />
		<textarea name="descricao" rows="6" cols="80"></textarea><br>
		<input type="submit" value="Adicionar">
	</form>
</body>
</html>