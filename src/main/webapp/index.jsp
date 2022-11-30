<!DOCTYPE html>
<html lang="pt-br">
<head>
    <link rel="stylesheet" href="css/login/login_large_screen.css">
    <link rel="stylesheet" href="css/login/login_small_screen.css" media="(max-width: 600px)">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <div class="main-login">
        <div class="left-login">
            <h1>Fa�a login <br> ou solicite um container</h1>
            <img src="img/container.svg" class="left-login-image" alt="container animacao">
        </div>
        <div class="right-login">
            <div class="card-login">
                <h1>LOGIN</h1>
                <div class="textfield">
                    <label for="usuario">Usu�rio</label>
                    <input type="text" name="usuario" placeholder="usu�rio">
                </div>
                <div class="textfield">
                    <label for="senha">Senha</label>
                    <input type="password" name="senha" placeholder="senha">
                </div>
                <button class="btn-login" onclick="window.location.href = './solicita.jsp'">Login</button>

                <nav>
                    <a href="registrar.jsp">Cadastre-se</a>
                    <!-- <a href="solicita.html">Solicite</a> -->
                </div>

            </div>
        </div>
    </div>
    <div class="faixa">
        <ul>
            <l1>
                <a href="equipe.jsp" target="_blank">Equipe</a>
            </l1>
            <l1><a href="sobre.jsp">Sobre</a></l1>
            <l1>
                <a href="#">Contatos</a>
            </l1>
        </ul>
    </div>
</body>
</html>