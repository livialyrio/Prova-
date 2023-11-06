<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.Pessoa"%>

<!DOCTYPE html>
<html>
<body>
    <h2 style="font-size:80px;"><B>Seja Bem-vindo</B></h2>
    <br>
    <p style="color:rgb(217,0,224);">
        Faca seu Login Abaixo!!
    </p>
    <form action= "login" method="post">
        <label for="login">Login: </label><input type="text" name="login" id="login">
        <label for="senha">Senha: </label><input type="text" name="senha" id="senha">
        <br>
        <label for="rua">Rua: </label><input type="text" name="rua" id="rua">
        <label for="cidade">Cidade: </label><input type="text" name="cidade" id="cidade">
        <label for="cep">CEP: </label><input type="text" name="cep" id="cep">
        <label for="tel">Telefone: </label><input type="text" name="tel" id="tel">
        <br>
        <input id="myButton" type="submit" name="salvar" value="salvar"> 
        <a href="segunda.jsp">Cadastro de Cliente</a>
    </form>

    <%
    String mensagem = (String) request.getAttribute("mensagem");
    if (mensagem != null)
        out.print(mensagem);
    %>
    <br>
    <%
    Pessoa pessoa = (Pessoa) request.getAttribute("pessoa");
    if (pessoa != null)
        out.print(pessoa.getName());    
    %>

<table>
    <tr>
        <th>PARTICIPANTES</th>
    </tr>
    <tr>
        <td>Felipe Correa</td>
    </tr>
    <tr>    
        <td>Rafael Moura</td>
    </tr>
 <table/>
</body>
</html>
