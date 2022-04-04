package uninter.work;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declarando uma matriz utilizando char
		// para usar dos simbolos X e Y da melhor forma

		String[] chosenDifficulty = { "" };

		char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		Board.chooseDifficulty(chosenDifficulty, scanner);

		Board.showBoard(board);

		while (true) {
			Player.vezDoJogador(board, scanner);
			if (Board.jogoEncerrado(board)) {
				break;
			}
			Board.showBoard(board);

			switch (chosenDifficulty[0]) {
				case "easy":
					ComputerEasy.play(board);
				case "medium":
					ComputerMedium.play(board);
				case "hard":
					ComputerHard.play(board);
				default:
					System.out.println(":(");

			}

			if (Board.jogoEncerrado(board)) {
				break;
			}
			Board.showBoard(board);
		}

		scanner.close();

	}

}