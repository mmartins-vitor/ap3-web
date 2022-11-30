<%@page import="eco.model.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/alterarProduto.css">

<meta charset="ISO-8859-1">
<title>Ecologic Container</title>
</head>
<body>
	<nav class="containerNav">
		<ul>
			<li><span style="color: yellow">EcoTainer</span></li>
			<li><img src="img/icone-container.png" height="50px" width="50px"></li>
			<li><a href="cadastrarProduto.jsp">Cadastrar Produto</a></li>
			<li><a href="consultarProduto.jsp">Consultar Produto</a></li>
		</ul>
	</nav>
	<main class="containerMain">
		<form action="alterarProduto" method="post" class="containerForm">

			<%
			Produto produto = null;
			if (request.getAttribute("produto") != null) {
				produto = (Produto) request.getAttribute("produto");
			}
			%>
			<input type="hidden" name="id" value="<%out.print(produto.getIdProduto());%>">
			<div class="input">
				<label><strong>Tipo:</strong></label><input type="text" name="tipo"
					value="<%out.print(produto.getTipo());%>">
			</div>
			<div class="input">
				<label><strong>Comprimento:</strong></label><input type="text"
					name="comprimento" value="<%out.print(produto.getComprimento());%>">
			</div>
			<div class="input">
				<label><strong>Largura:</strong></label><input type="text"
					name="largura" value="<%out.print(produto.getLargura());%>">
			</div>
			<div class="input">
				<label><strong>Quantidade:</strong></label><input type="text"
					name="quantidade" value="<%out.print(produto.getQuantidade());%>">
			</div>
			<div class="input">
				<label><strong>Preço:</strong></label><input type="text"
					name="preco" value="<%out.print(produto.getPreco());%>">
			</div>

			<br>
			<div class="btnAltera">
				<input id="containerButton" type="submit" name="alterar"
					value="Alterar Produto">
			</div>
			<div class="input">
				<input type="hidden" name="id">
			</div>
			<div>
				<%
				String mensagem = (String) request.getAttribute("mensagem");
				if (mensagem != null) {
					out.print(mensagem);
				}
				%>
			</div>
		</form>
	</main>
</body>
</html>