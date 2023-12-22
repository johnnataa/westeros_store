package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Ecommerce;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {

	private ArrayList<Ecommerce> listaProdutos = new ArrayList<Ecommerce>();
	int numero = 0;

	@Override
	public void procurarPorCodigo(int codigoProduto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void cadastrar(Ecommerce produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto: " + produto.getNome() + " foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Ecommerce produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int codigoProduto) {
		// TODO Auto-generated method stub

	}
	
	public int gerarNumero() {
		return ++ numero;
	}

}
