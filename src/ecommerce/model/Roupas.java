package ecommerce.model;

public class Roupas extends Ecommerce {

	private String tamanho1;

	public Roupas(int numero, int codigoProduto, String nome, float preco, String tamanho) {
		super(numero, codigoProduto, nome, preco);
		this.tamanho1 = tamanho;

	}

	public String getTamanho() {
		return tamanho1;
	}

	public void setTamanho(String tamanho) {
		this.tamanho1 = tamanho;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho: " + this.tamanho1);
	}

}
