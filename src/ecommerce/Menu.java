package ecommerce;

import java.io.IOException;
import java.util.Scanner;

//import ecommerce.controller.ContaController;
import ecommerce.util.Cores;
import ecommerce.model.Ecommerce;
import ecommerce.model.Roupas;
import ecommerce.model.Calcados;

import java.util.InputMismatchException;

public class Menu {

	public static void main(String[] args) {

		
		// Teste da Classe Ecommerce
//			Ecommerce p1 = new Ecommerce("Arroz", 10.0f);
//			p1.visualizar();

				Scanner leia = new Scanner(System.in);
		
		int opcao, codigoProduto;
		String nomeProduto;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("              🛍️🛡️  WESTEROS STORE  🛡️🛍️             ");
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
				System.out.println("Digite o Código do Produto: ");
				leia.skip("\\R?");
				codigoProduto = leia.nextInt();

				keyPress();
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os produtos\n\n");

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