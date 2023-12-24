package ecommerce.model;

public class Calcados extends Ecommerce{

	private int tamanho;
	
	public Calcados(int numero, int codigoProduto, String nome, float preco, int tamanho) {
		super(numero, codigoProduto, nome, preco);
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	 @Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Tamanho: " + this.tamanho);
		}
	
	

}
