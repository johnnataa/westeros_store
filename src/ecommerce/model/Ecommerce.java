package ecommerce.model;

public abstract class Ecommerce {

	private String nome;
	private float preco;

	public Ecommerce(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
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
	
	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Preço do produto: " + this.preco);
	}

}
