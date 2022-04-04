package uninter.work;

import java.util.Scanner;

public class Player {
	// Deve controlar a leitura das jogadas do jogador humano

	public static void vezDoJogador(char[][] tabuleiro, Scanner scanner) {
		String movimentoJogador;
		while (true) {
			System.out.println("Escolha onde você quer jogar, digite um número de 1 a 9: ");
			movimentoJogador = scanner.nextLine();
			if (movimentoValido(tabuleiro, movimentoJogador)) {
				break;
			} else {
				System.out.println(movimentoJogador + " não é uma opção válida");
			}
		}
		posicaoMovimento(tabuleiro, movimentoJogador, 'X');
	}

	private static boolean movimentoValido(char[][] tabuleiro, String posicao) {
		switch (posicao) {
			case "1":
				return (tabuleiro[0][0] == ' ');
			case "2":
				return (tabuleiro[0][1] == ' ');
			case "3":
				return (tabuleiro[0][2] == ' ');
			case "4":
				return (tabuleiro[1][0] == ' ');
			case "5":
				return (tabuleiro[1][1] == ' ');
			case "6":
				return (tabuleiro[1][2] == ' ');
			case "7":
				return (tabuleiro[2][0] == ' ');
			case "8":
				return (tabuleiro[2][1] == ' ');
			case "9":
				return (tabuleiro[2][2] == ' ');
			default:
				return false;
		}
	}

	private static void posicaoMovimento(char[][] tabuleiro, String posicao, char simbolo) {
		switch (posicao) {
			case "1":
				tabuleiro[0][0] = simbolo;
				break;
			case "2":
				tabuleiro[0][1] = simbolo;
				break;
			case "3":
				tabuleiro[0][2] = simbolo;
				break;
			case "4":
				tabuleiro[1][0] = simbolo;
				break;
			case "5":
				tabuleiro[1][1] = simbolo;
				break;
			case "6":
				tabuleiro[1][2] = simbolo;
				break;
			case "7":
				tabuleiro[2][0] = simbolo;
				break;
			case "8":
				tabuleiro[2][1] = simbolo;
				break;
			case "9":
				tabuleiro[2][2] = simbolo;
				break;
			default:
				System.out.println(":(");
		}
	}

}
