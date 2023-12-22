package ecommerce.model;

public class Calcados extends Ecommerce{

	private int tamanho;
	
	public Calcados(int numero, float preco, String nomeProduto, int codigoProduto) {
		super(numero, preco, nomeProduto, codigoProduto);
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
