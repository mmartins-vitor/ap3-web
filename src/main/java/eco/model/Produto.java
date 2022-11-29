package eco.model;

import java.util.ArrayList;

import eco.dao.ProdutoDao;

public class Produto {
	private int idProduto;
	private String tipo;
	private int comprimento;
	private int largura;
	private int quantidade;
	private double preco;
	
	public Produto() {
		
	};
	
	
	public Produto(String tipo, int comprimento, int largura, int quantidade, double preco) {
		super();
		this.tipo = tipo;
		this.comprimento = comprimento;
		this.largura = largura;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Produto(int idProduto, String tipo, int comprimento, int largura, int quantidade, double preco) {
		super();
		this.idProduto = idProduto;
		this.tipo = tipo;
		this.comprimento = comprimento;
		this.largura = largura;
		this.quantidade = quantidade;
		this.preco = preco;
	}


	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getComprimento() {
		return comprimento;
	}


	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}


	public int getLargura() {
		return largura;
	}


	public void setLargura(int largura) {
		this.largura = largura;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public void salvar() {
		new ProdutoDao().cadastrarProduto(this);
	}
	
	public Produto buscarProdutoPorId(int idProduto) {
		return new ProdutoDao().BuscarProdutoPorId(idProduto);
	}
	
	public ArrayList<Produto> buscarProdutosPorTipo (String tipo) {
		return new ProdutoDao().buscarProdutosPorTipo(tipo);
		
	}
	
	public void excluir(int idProduto) {
		new ProdutoDao().ExcluirProduto(idProduto);
	}
	
	
}
