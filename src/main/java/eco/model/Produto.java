package eco.model;

public class Produto {
	private int idProduto;
	private String Tipo;
	private int comprimento;
	private int largura;
	private int quantidade;
	private double preco;
	
	public Produto() {
		
	};
	
	
	public Produto(String tipo, int comprimento, int largura, int quantidade, double preco) {
		super();
		Tipo = tipo;
		this.comprimento = comprimento;
		this.largura = largura;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Produto(int idProduto, String tipo, int comprimento, int largura, int quantidade, double preco) {
		super();
		this.idProduto = idProduto;
		Tipo = tipo;
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
		return Tipo;
	}


	public void setTipo(String tipo) {
		Tipo = tipo;
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
		System.out.println("Produto salvo com sucesso !");
	}
	
	
}
