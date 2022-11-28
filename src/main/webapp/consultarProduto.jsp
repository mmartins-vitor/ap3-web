<%@page import="eco.model.Produto" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bananaStyle.css">

<meta charset="ISO-8859-1">
<title>Banana Bacana</title>
</head>
<body>
	<nav class="bananaNav">
		<ul>
			<li><span style="color: yellow">EcoTainer</span></li>
			<li><img src="img/bacana.png" height="20px"></li>
			<li><a href="cadastrarProduto.jsp">Cadastrar Produto</a></li>
			<li><a href="consultarProduto.jsp">Consultar Produto</a></li>
		</ul>
	</nav>
	<main class="bananaMain">
		<form action="buscarProdutos" method="post" class="bananaForm">
			<div>
				<label><strong>Busca pela Descricao:</strong></label><input
					type="text" name="descricao">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Consultar Produto">
			</div>

			<%
			if (request.getAttribute("produtos") != null) {
				List<?> produtos = (List<?>) request.getAttribute("produtos");
				for (int contador = 0; contador <= (produtos.size() - 1); contador++) {
					Produto produto = (Produto) produtos.get(contador);
			%>

			<div class="bananaDivMother">
				<div class="bananaDivItem">
					<div class="bananaColumn">
						<span style="font-weight: bold">Id</span> <span>Conteudo</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Comprimento</span> <span>Conteudo</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Largura</span> <span>Conteudo</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Quantidade</span> <span>Conteudo</span>
					</div>
					<div class="bananaColumn">
						<span style="font-weight: bold">Preço</span> <span>Conteudo</span>
					</div>
					<div class="bananaColumn">
						<input id="bananaItemButton" type="submit" name="alterar"
							value="Alterar"> <input id="bananaItemButton"
							type="submit" name="apagar" value="Apagar">
					</div>
				</div>
			</div>
			<%
			}
			}
			%>
		</form>
	</main>
</body>
</html>