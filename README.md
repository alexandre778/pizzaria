# 🍕 Pizzaria Sabor da Itália

Sistema web da **Pizzaria Sabor da Itália**, desenvolvido com **Spring Boot**, **Thymeleaf** e **Bootstrap 5**, oferecendo um ambiente simples e elegante para gerenciamento de clientes e pedidos.

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Thymeleaf** (templates HTML dinâmicos)
- **Bootstrap 5**
- **Maven**
- **MySQL** (persistência de dados)
## 💻 Páginas Principais

### 🏠 **Home (`index.html`)**
Página inicial da aplicação, com boas-vindas e menu de navegação.

- Exibe o nome e logo da pizzaria.
- Links para Clientes, Pedidos e Login.

### 🔐 **Login (`login.html`)**
Formulário de autenticação com campos de usuário e senha.

- Exibe mensagem de erro (quando configurado com Thymeleaf `${loginError}`).
- Redireciona para a página inicial após login bem-sucedido.

### 👤 **Clientes (`clientes.html`)**
Tela de cadastro de clientes, com os campos:
- Nome
- Telefone
- Endereço

### 📦 **Pedidos (`pedidos.html`)**
Tela para registro de novos pedidos, contendo:
- Nome do cliente
- Produto (ex: Pizza Calabresa)
- Forma de pagamento (Dinheiro, Cartão, Pix)

---

## 🧩 Navegação Entre Páginas

A navegação é feita através do menu fixo no topo de todas as páginas:

```html
<nav class="navbar navbar-expand-lg navbar-dark bg-danger">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">🍕 Pizzaria Sabor da Itália</a>
        <ul class="navbar-nav me-auto">
            <li class="nav-item"><a class="nav-link" href="/">Home</a></li>
            <li class="nav-item"><a class="nav-link" href="/clientes">Clientes</a></li>
            <li class="nav-item"><a class="nav-link" href="/pedidos">Pedidos</a></li>
            <li class="nav-item"><a class="nav-link" href="/login">Sair</a></li>
        </ul>
    </div>
</nav>
