<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/CadastrarUser" var="linkServletCadastro" />
<c:url value="/LoginUser" var="linkServletLogin" />


<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="assets/css/reset.css" />
    <link rel="stylesheet" href="assets/css/style.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
        href="https://fonts.googleapis.com/css2?family=Quicksand:wght@400;500;700&family=Roboto:wght@400;500;700;900&display=swap"
        rel="stylesheet" />

    <title>TelaLogin</title>
</head>

<body>
    <header>
        <h1>SEJA BEM-VINDO</h1>
    </header>
    <section class="container">
        <div class="container-form" id="login">
            <div class="form-nome">
                <div class="nomelogin">LOGIN</div>
                <br>
                <br>
                <form action="${linkServletLogin}" method="post">
                    <h2>Usuario</h2> <input type="text" name="usuario">
                    <h2>Senha</h2> <input type="text" name="senha">
                    <br>
                    <br>
                    <input class="button" type="submit" name="enviar">
                    <button class="button login-cadastro" type="button" name="cadastrar"> Cadastre-se </button>
                </form>
            </div>
        </div>

        <div class="container-form hidden" id="cadastro">
            <div class="form-nome">
                <div class="nomelogin">CADASTRO</div>
                <br>
                <br>
                <form action="${linkServletCadastro}" method="post">
                    <h2>Usuario</h2> <input type="text" name="novo-usuario">
                    <h2>Nova Senha</h2> <input type="text" name="nova-senha">
                    <h2>Repita nova Senha</h2> <input type="text" name="confirmar-senha">
                    <br>
                    <br>
                    <input class="button" type="submit" name="enviar">
                    <button class="button login-cadastro" type="button"  name="Login"> Login </button>
                </form>
            </div>
        </div>


    </section>
    <script src="assets/js/script.js"></script>
</body>
<footer>
    <div class="container-foot">

        <div class="autor">FEITO POR ISAAC FIGUEIREDO
            <div class="contatos">
                <div class="container-rede-social" style="display: none;">
                    <a href="https://www.instagram.com/figueiredoisaac"><img class="icon"
                            src="assets/img/instagram-icon.svg" alt="icone-instragram" /></a>
                </div>
                <div class="container-rede-social">
                    <a href="https://www.linkedin.com/in/figueiredoisaac/"><img class="icon"
                            src="assets/img/linkedin-icon.svg" alt="icone-linkdin" /></a>
                </div>
                <div class="container-rede-social">
                    <a href="https://github.com/Figueiredoisaac"><img class="icon" src="assets/img/github-icon.svg"
                            alt="icone-github" /></a>
                </div>
            </div>
</footer>