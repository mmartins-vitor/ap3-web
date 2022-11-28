package eco.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eco.model.Produto;


@WebServlet("/cadastrarProdutoController")
public class cadastrarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public cadastrarProdutoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset-UTF-8");
		
		String tipo = request.getParameter("tipo");
		String mensagem;
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastrarProduto.jsp");
		
		if (tipo!= null && !tipo.isEmpty() && request.getParameter("comprimento") != null && !request.getParameter("comprimento").isEmpty()
				&& request.getParameter("largura") != null && !request.getParameter("largura").isEmpty()
				&& request.getParameter("quantidade") != null && !request.getParameter("quantidade").isEmpty()
				&& request.getParameter("preco") != null && !request.getParameter("preco").isEmpty()
				) {
			
			int comprimento;
			int largura;
			int quantidade;
			double preco;
			
			comprimento = Integer.parseInt(request.getParameter("comprimento"));
			largura = Integer.parseInt(request.getParameter("largura"));
			quantidade = Integer.parseInt(request.getParameter("quantidade"));
			preco = Double.parseDouble(request.getParameter("preco"));
			
			Produto produto = new Produto(tipo, comprimento, largura, quantidade, preco);
			produto.salvar();
			
			mensagem = "produto cadastrado com sucesso !";
			request.setAttribute("mensagem", mensagem);
			
			//dispatcher.forward(request, response);
		} else {
			mensagem = "Falha ao cadastrar produto !";
			request.setAttribute("mensagem", mensagem);
			//RequestDispatcher dispatcher = request.getRequestDispatcher("cadastrarProduto.jsp");
			dispatcher.forward(request, response);
		}

	}

}
