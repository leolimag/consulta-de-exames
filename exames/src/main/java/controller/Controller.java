package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

@WebServlet (urlPatterns = {"/Controller", "/main", "/insert", "/select", "/update", "/delete"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans exame = new JavaBeans();
	
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/main")) {
			exames(request,response);
		} 
		else if (action.equals("/insert")) {
			adicionarExame(request,response);
		}
		else if (action.equals("/select")){
			selecionarExame(request,response);
		}
		else if (action.equals("/update")) {
			editarExame(request,response);
		}
		else if (action.equals("/delete")) {
			removerExame(request,response);
		}
		else {
			response.sendRedirect("index.html");
		}
	}
	
	protected void exames(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<JavaBeans> lista = dao.listarExames();
		request.setAttribute("exames", lista);
		RequestDispatcher rd = request.getRequestDispatcher("exames.jsp");
		rd.forward(request, response);
	} 
	
	protected void adicionarExame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		exame.setNomePaciente(request.getParameter("nomePac"));
		exame.setNomeExame(request.getParameter("nomeEx"));
		exame.setData(request.getParameter("data"));
		exame.setResultado(request.getParameter("resultado"));
		dao.criarExame(exame);
		response.sendRedirect("main");
	}

	protected void selecionarExame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		exame.setId(request.getParameter("id"));
		dao.selecionarExame(exame);
		request.setAttribute("id", exame.getId());
		request.setAttribute("nomePaciente", exame.getNomePaciente());
		request.setAttribute("nomeExame", exame.getNomeExame());
		request.setAttribute("data", exame.getData());
		request.setAttribute("resultado", exame.getResultado());
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}
	
	protected void editarExame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		exame.setId(request.getParameter("id"));
		exame.setNomePaciente(request.getParameter("nomePaciente"));
		exame.setNomeExame(request.getParameter("nomeExame"));
		exame.setData(request.getParameter("data"));
		exame.setResultado(request.getParameter("resultado"));
		dao.atualizarExame(exame);
		response.sendRedirect("main");
	}
	
	protected void removerExame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		exame.setId(request.getParameter("id"));
		dao.deletarExame(exame);
		response.sendRedirect("main");
	}

}
