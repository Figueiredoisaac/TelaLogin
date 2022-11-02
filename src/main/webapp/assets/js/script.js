window.addEventListener("load", function () {
  var buttonChangeCadastro = document.querySelectorAll(".login-cadastro");
  const fase1 = document.getElementById("login");
  const fase2 = document.getElementById("cadastro");
  buttonChangeCadastro.forEach((element) => {
    element.addEventListener("click", function () {
      fase1.classList.toggle("hidden");
      fase2.classList.toggle("hidden");
    });
  });
});
