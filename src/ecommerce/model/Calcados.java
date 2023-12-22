package ecommerce.model;

public class Calcados extends Ecommerce{

	private int tamanho;
	
	public Calcados(String nome, float preco, int tamanho) {
		super(nome, preco);
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
