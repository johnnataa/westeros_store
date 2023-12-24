package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Ecommerce;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {

	private ArrayList<Ecommerce> listaProdutos = new ArrayList<Ecommerce>();
	int numero = 0;
	int codigoProduto = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);
		
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO Produto: " + numero + " não foi encontrado!");
	}

	public Ecommerce buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
		}
	}
		return null;
	}
	
	@Override
	public void procurarPorCodigo(int codigoProduto) {
		var produto = buscarNaCollection1(codigoProduto);
		
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO Produto: " + codigoProduto + " não foi encontrado!");
	}
	
	public Ecommerce buscarNaCollection1(int codigoProduto) {
		for (var produto : listaProdutos) {
			if (produto.getCodigoProduto() == codigoProduto) {
				return produto;
		}
	}
		return null;
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
		var buscaProduto = buscarNaCollection(produto.getNumero());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto: " + produto.getNumero() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO produto: " + produto.getNumero() + " não foi encontrado!");
	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto: " + numero + " foi deletado com sucesso!");
		} else
			System.out.println("\nO produto: " + numero + " não foi encontrado!");
	}

	@Override
	public void deletar1(int codigoProduto) {
		var produto = buscarNaCollection1(codigoProduto);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto: " + codigoProduto + " foi deletado com sucesso!");
		} else
			System.out.println("\nO produto: " + codigoProduto + " não foi encontrado!");
	}
	
	public int gerarNumero() {
		return ++ numero;
	}

}
