package ecommerce.repository;

import ecommerce.model.Ecommerce;

public interface EcommerceRepository {
	
	// CRUD da Ecommerce
		public void procurarPorNumero(int numero);
		public void procurarPorCodigo(int codigoProduto);
		public void listarTodas();
		public void cadastrar(Ecommerce produto);
		public void atualizar(Ecommerce produto);
		public void deletar(int numero);
		public void deletar1(int codigoProduto);
		

}
