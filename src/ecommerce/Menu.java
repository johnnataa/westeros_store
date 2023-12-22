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


//		Scanner leia = new Scanner(System.in);
		
		int opcao, codigoProduto, tipo;
		float preco;
		String nomeProduto;
		
//		Teste Roupas
//		Roupas r1 = new Roupas("Camisa", 50.0f, "M");
//		r1.visualizar();
		
//		Teste Calçados
//		Calcados c1 = new Calcados("Calçado", 100.0f, 20);
//		c1.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("              🛍️🛒  WESTEROS STORE  🛒🛍️               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar produto por código de barras  ");
			System.out.println("            4 - Editar dados do produto              ");
			System.out.println("            5 - Deletar produto                      ");
			System.out.println("            6 - Repor produto                        ");
			System.out.println("            7 - Sair                                 ");
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
				System.out.println("Digite o Preço do Produto: ");
				preco = leia.nextInt();
				System.out.println("Digite o Código do Produto: ");
				leia.skip("\\R?");
				codigoProduto = leia.nextInt();
				//produtos.cadastrar(produtos.gerarNumero(), nomeProduto, codigoProduto);
				do {
					System.out.println("Digite o Tipo do produto (1-Roupas ou 2-Calçados): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {
					produtos.cadastrar(new Roupas(produtos.gerarNumero(), preco, nomeProduto, codigoProduto));
				}
				case 2 -> {
					produtos.cadastrar(new Calcados(produtos.gerarNumero(), preco, nomeProduto, codigoProduto));
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
				System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar produto por código de barras\n\n");

				System.out.println("Digite o código de barras: ");
				codigoProduto = leia.nextInt();

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Editar dados do produto\n\n");

				System.out.println("Digite o código de barras: ");
				codigoProduto = leia.nextInt();

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Deletar produto\n\n");

				System.out.println("Digite o código de barras: ");
				codigoProduto = leia.nextInt();

				// produtos.deletar(codigoProduto);

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Repor produto\n\n");

				System.out.println("Digite o código de barras: ");
				codigoProduto = leia.nextInt();

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
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Johnnata Silva");
		System.out.println("https://github.com/johnnataa/contabancaria.git");
		System.out.println("*********************************************************");

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