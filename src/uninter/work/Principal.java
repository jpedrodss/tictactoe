package uninter.work;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {Scanner scanner = new Scanner(System.in);

	// Declarando uma matriz utilizando char
	// para usar dos simbolos X e Y da melhor forma

	char[][] tabuleiro = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	Tabuleiro.mostrarTabuleiro(tabuleiro);
			
			while (true) {
				Jogador.vezDoJogador(tabuleiro, scanner);
				if (Tabuleiro.jogoEncerrado(tabuleiro)){
					break;
				}
				Tabuleiro.mostrarTabuleiro(tabuleiro);
				
				Computador.vezDoComputador(tabuleiro);
				if (Tabuleiro.jogoEncerrado(tabuleiro)){
					break;
				}
				Tabuleiro.mostrarTabuleiro(tabuleiro);
			}
			
			scanner.close();
	
}
  
}