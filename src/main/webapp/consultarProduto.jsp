<%@page import="eco.model.Produto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/consultarProduto.css">

<meta charset="ISO-8859-1">
<title>EcoTainer</title>
</head>
<body>
	<nav class="containerNav">
		<ul>
			<li><span style="color: yellow">EcoTainer</span></li>
			<li><img src="img/icone-container.png" height="50px"></li>
			<li><a href="cadastrarProduto.jsp">Cadastrar Produto</a></li>
			<li><a href="solicita.jsp">Solicitar</a></li>
			<li><a href="index.jsp">Sair</a></li>
		</ul>
	</nav>
	<main class="containerMain">
		<div class="containerForm">
			<form action="buscarProdutos" method="post" class="containerForm">
				<div class="input">
					<label><strong>Busca pela Descricao:</strong></label><input
						type="text" name="descricao" size="40" maxlength="100">
				</div>
				<br>
				<div class="btnConsulta">
					<input id="containerButton" type="submit" name="salvar"
						value="Consultar Produto">
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

			<%
			if (request.getAttribute("produtos") != null) {
				List<?> produtos = (List<?>) request.getAttribute("produtos");
				for (int contador = 0; contador <= (produtos.size() - 1); contador++) {
					Produto produto = (Produto) produtos.get(contador);
			%>
			<form action="modificarProduto" method="post" class="containerForm">
				<div class="containerDivMother">
					<div class="containerDivItem">
						<div class="containerColumn">
							<span style="font-weight: bold">Id</span> <span> <%
 out.print(produto.getIdProduto());
 %>
							</span> <input type="hidden" name="id"
								value="<%out.print(produto.getIdProduto());%>">
						</div>
						<div class="containerColumn">
							<span style="font-weight: bold">Tipo</span> <span> <%
 out.print(produto.getTipo());
 %>
							</span>
						</div>
						<div class="containerColumn">
							<span style="font-weight: bold">Comprimento</span> <span>
								<%
								out.print(produto.getComprimento());
								%>
							</span>
						</div>
						<div class="containerColumn">
							<span style="font-weight: bold">Largura</span> <span> <%
 out.print(produto.getLargura());
 %>
							</span>
						</div>
						<div class="containerColumn">
							<span style="font-weight: bold">Quantidade</span> <span> <%
 out.print(produto.getQuantidade());
 %>
							</span>
						</div>
						<div class="containerColumn">
							<span style="font-weight: bold">Preço</span> <span> <%
 out.print(produto.getPreco());
 %>
							</span>
						</div>
						<div class="containerColumn">
							<input id="containerItemButton" type="submit" name="alterar"
								value="Alterar"> <input id="containerItemButton"
								type="submit" name="apagar" value="Apagar">
						</div>
					</div>
				</div>
			</form>
			<%
			}
			}
			%>
		</div>
	</main>
</body>
</html>