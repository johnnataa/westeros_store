package ecommerce.model;

public abstract class Ecommerce {

	private int numero;
	private String nome;
	private float preco;
	private int codigoProduto;
	
	public Ecommerce(int numero, float preco, String nome, int codigoProduto) {
		this.nome = nome;
		this.preco = preco;
		this.numero = numero;
		this.codigoProduto = codigoProduto;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getCodigoProduto() {
		return codigoProduto;
	}



	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}



	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Preço do produto: " + this.preco);
	}

}
