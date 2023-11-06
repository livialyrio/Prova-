package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Adress;
// import model.Peessoa;
import model.Pessoa;

import java.io.IOException;
// import java.net.http.HttpRequest;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    @Override //"WebServlet"
    protected void doGet(HttpServletRequest request,
    HttpServletResponse response) throws IOException, ServletException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String rua = request.getParameter("Rua");
        String cep = request.getParameter("cep");
        String tel = request.getParameter("tel");

        

        Pessoa p1 = new Pessoa();
        p1.setName(login);
        p1.setSurname(senha);
        p1.setFiscalNumber(tel);

        Adress a1 = new Adress();
        a1.setStreet(rua);
        // a1.setCity(cep);
        // a1.setNumber(0);
        // a1.setCountry(cep);
        a1.setZipCode(cep);

        System.out.println("ENTREI\n" + login + "\n" + senha);
        System.out.println("MEU CELULAR\n" + tel);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        request.setAttribute("mensagem", "Foi cadastrado com sucesso!");
        request.setAttribute("pessoa", p1);
		dispatcher.forward(request, response);
    }
    }
