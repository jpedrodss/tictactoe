package uninter.work;

import java.util.Scanner;

public class Board {

	// Deve armazenar e controlar a condição do board, saber responder
	// se o jogo está empatado, vitória, derrota ou inacabado

	// 1 - O - Player
	// 2 - X - Computer
	// 0 - null

	public static boolean jogoEncerrado(char[][] board) {

		if (Vitoria(board, 'X')) {
			showBoard(board);
			System.out.println("Você venceu! Parabéns");
			return true;
		}

		if (Vitoria(board, 'O')) {
			showBoard(board);
			System.out.println("O computador venceu e você perdeu :( Mais sorte na pŕoxima vez");
			return true;
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		showBoard(board);
		System.out.println("Empatou!");
		return true;
	}

	private static boolean Vitoria(char[][] board, char simbolo) {
		if ((board[0][0] == simbolo && board[0][1] == simbolo && board[0][2] == simbolo) ||
				(board[1][0] == simbolo && board[1][1] == simbolo && board[1][2] == simbolo) ||
				(board[2][0] == simbolo && board[2][1] == simbolo && board[2][2] == simbolo) ||

				(board[0][0] == simbolo && board[1][0] == simbolo && board[2][0] == simbolo) ||
				(board[0][1] == simbolo && board[1][1] == simbolo && board[2][1] == simbolo) ||
				(board[0][2] == simbolo && board[1][2] == simbolo && board[2][2] == simbolo) ||

				(board[0][0] == simbolo && board[1][1] == simbolo && board[2][2] == simbolo) ||
				(board[0][2] == simbolo && board[1][1] == simbolo && board[2][0] == simbolo)) {
			return true;
		}
		return false;
	}

	public static void showBoard(char[][] board) {
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
	}

	public static void chooseDifficulty(String[] chosenDifficulty, Scanner scanner) {
		System.out.println("Escolha uma dificuldade:\n 1 - Fácil\n 2 - Médio\n 3 - Difícil");

		switch (scanner.nextLine()) {
			case "1":
				chosenDifficulty[0] = "easy";
				break;
			case "2":
				chosenDifficulty[0] = "medium";
				break;
			case "3":
				chosenDifficulty[0] = "hard";
				break;
			default:
				System.out.println("deu ruim!");

		}
	}

}