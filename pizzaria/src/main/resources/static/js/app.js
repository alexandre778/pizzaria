// src/main/resources/static/js/app.js

document.addEventListener("DOMContentLoaded", function() {
    const loginForm = document.getElementById("loginForm");
    const loginAlert = document.getElementById("loginAlert");

    if (loginForm) {
        loginForm.addEventListener("submit", function(e) {
            const username = document.getElementById("username").value.trim();
            const password = document.getElementById("password").value.trim();

            if (!username || !password) {
                e.preventDefault();
                loginAlert.textContent = "Por favor, preencha usuário e senha!";
                loginAlert.classList.remove("d-none");
            }
        });
    }
});
