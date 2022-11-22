<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bananaStyle.css">

<meta charset="ISO-8859-1">
<title>Eco Container</title>
</head>
<body>
	
	<main class="bananaMain">
		<form action="cadastrarProduto" method="post" class="containerForm">
			<div>
				<label><strong>Tipo:</strong></label><input type="text"
					name="tipo">
			</div>
			<div>
				<label><strong>Comprimento:</strong></label><input type="text"
					name="comprimento">
			</div>
			<div>
				<label><strong>Largura:</strong></label><input type="text"
					name="largura">
			</div>
			<div>
				<label><strong>Quantidade:</strong></label><input type="text"
					name="quantidade">
			</div>
			<div>
				<label><strong>Preço:</strong></label><input type="text"
					name="preco">
			</div>

			<br>
			<div>
				<input id="containerButton" type="submit" name="salvar"
					value="Cadastrar Produto">
			</div>
		</form>
	</main>
</body>
</html>