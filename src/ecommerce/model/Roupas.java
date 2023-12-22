package ecommerce.model;

public class Roupas extends Ecommerce {

	private String tamanho;
	public Roupas(String nome, float preco, String tamanho) {
		super(nome, preco);
		this.tamanho = tamanho;
		
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
