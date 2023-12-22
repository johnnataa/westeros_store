package ecommerce.model;

public class Roupas extends Ecommerce {

	private String tamanho;
	
	public Roupas(int numero, float preco, String nome, int codigoProduto) {
		super(numero, preco, nome, codigoProduto);
		
		
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho: " + this.tamanho);
	}

}
