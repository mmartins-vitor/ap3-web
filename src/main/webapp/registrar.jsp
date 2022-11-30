<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro</title>
    <link rel="stylesheet" href="css/cadastro_usuario.css">
</head>
<body>
	<main>
            <div class="card-cadastro">

                <h1>Cadastro de Usu�rios</h1>

                <form action="#">

					<div class="textfield">
						<label for="usuario">Email</label>
						<input type="email" name="email" placeholder="Email">
					</div>
					<br>
					<div class="textfield">
						<label for="senha">Senha</label>
						<input type="password" name="senha" placeholder="Senha">
					</div>
					<br>
					<button class="btn-cadastro" onclick="window.location.href = './solicita.jsp'">Cadastrar</button>
				</form>

            </div>
    </main>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>