package eco.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eco.model.Produto;

/**
 * Servlet implementation class alterarProdutoController
 */
@WebServlet("/alterarProdutoController")
public class alterarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public alterarProdutoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String tipo = request.getParameter("tipo");
		String id = request.getParameter("id");
		String mensagem;
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastrarProduto.jsp");
		if (tipo != null && !tipo.isEmpty() && request.getParameter("comprimento") != null
				&& !request.getParameter("comprimento").isEmpty() && request.getParameter("largura") != null
				&& !request.getParameter("largura").isEmpty() && request.getParameter("quantidade") != null
				&& !request.getParameter("quantidade").isEmpty() && request.getParameter("preco") != null
				&& !request.getParameter("preco").isEmpty()) {

			int comprimento;
			int largura;
			int quantidade;
			double preco;

			comprimento = Integer.parseInt(request.getParameter("comprimento"));
			largura = Integer.parseInt(request.getParameter("largura"));
			quantidade = Integer.parseInt(request.getParameter("quantidade"));
			preco = Double.parseDouble(request.getParameter("preco"));
			
			Produto produto = new Produto(tipo, comprimento, largura, quantidade, preco);
			produto.setIdProduto(Integer.valueOf(id));
			produto.alterar();
			mensagem = "Produto alterado com sucesso!";
		} else
			mensagem = "Os campos precisam ser preenchidos!";
		request.setAttribute("mensagem", mensagem);
		dispatcher.forward(request, response);
	}

}