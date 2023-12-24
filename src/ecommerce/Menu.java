package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.util.Cores;
import ecommerce.model.Roupas;
import ecommerce.controller.EcommerceController;
import ecommerce.model.Calcados;


public class Menu {
	
	public static Scanner leia = new Scanner(System.in);


	public static void main(String[] args) {
		
		EcommerceController produtos = new EcommerceController();

		int opcao, codigoProduto, tipo, numero, tamanho;
		float preco;
		String nomeProduto, tamanho1;
		
//		PRODUTOS
		Roupas r1 = new Roupas(produtos.gerarNumero(), 123, "Camisa", 50.0f, "M");
		produtos.cadastrar(r1);
		
		Calcados c1 = new Calcados(produtos.gerarNumero(), 321, "Tênis", 100.0f, 40);
		produtos.cadastrar(c1);
		
		produtos.listarTodas();

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("              🛍️🛒  WESTEROS STORE  🛒🛍️               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("       1 - Cadastrar produto                         ");
			System.out.println("       2 - Listar todos os produtos                  ");
			System.out.println("       3 - Buscar produto por número                 ");
			System.out.println("       4 - Buscar produto por código de barras       ");
			System.out.println("       5 - Deletar produto (Por número)              ");
			System.out.println("       6 - Deletar produto (Por código de barras)    ");
			System.out.println("       7 - Sair                                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 7) {
				System.out
						.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "\nWesteros Store - Volte sempre!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastrar produto\n\n");

				System.out.println("Digite o Nome do Produto: ");
				nomeProduto = leia.next();
				System.out.println("Digite o Código do Produto: ");
				codigoProduto = leia.nextInt();
				System.out.println("Digite o Preço do Produto: ");
				leia.skip("\\R?");
				preco = leia.nextInt();
				//produtos.cadastrar(produtos.gerarNumero(), nomeProduto, codigoProduto);
				do {
					System.out.println("Digite o Tipo do produto (1 - Roupas ou 2 - Calçados): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o tamanho: ");
					tamanho1 = leia.next();
					produtos.cadastrar(new Roupas(produtos.gerarNumero(), codigoProduto, nomeProduto, preco, tamanho1));
				}
				
				case 2 -> {
					System.out.println("Digite o tamanho: ");
					tamanho = leia.nextInt();
					produtos.cadastrar(new Calcados(produtos.gerarNumero(), codigoProduto, nomeProduto, preco, tamanho));
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os produtos\n\n");
				produtos.listarTodas();

				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar produto por número\n\n");

				System.out.println("Digite o número do produto: ");
				numero = leia.nextInt();
				produtos.procurarPorNumero(numero);

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar produto por código de barras\n\n");

				System.out.println("Digite o código de barras: ");
				codigoProduto = leia.nextInt();
				produtos.procurarPorCodigo(codigoProduto);

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Deletar produto (Por número)\n\n");

				System.out.println("Digite o número do produto: ");
				numero = leia.nextInt();

				produtos.deletar(numero);

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Deletar produto (Por código de barras)\n\n");

				System.out.println("Digite o código de barras: ");
				codigoProduto = leia.nextInt();

				produtos.deletar(codigoProduto);

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				
				keyPress();
				break;
			}
		}
	}

	private static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("                                                     ");
		System.out.println("      Projeto Desenvolvido por: Johnnata Silva       ");		
		System.out.println("    https://github.com/johnnataa/projeto-java.git    ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");

	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}