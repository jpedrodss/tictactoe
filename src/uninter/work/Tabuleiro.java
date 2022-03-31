package uninter.work;

public class Tabuleiro {

	// Deve armazenar e controlar a condição do tabuleiro, saber responder
	// se o jogo está empatado, vitória, derrota ou inacabado

	// 1 - O - Player
	// 2 - X - Computer
	// 0 - null

	

public static boolean jogoEncerrado(char[][] tabuleiro) {
	
	if (Vitoria(tabuleiro, 'X')) {	
		mostrarTabuleiro(tabuleiro);
		System.out.println("Você venceu! Parabéns");
		return true;
	}
	
	if (Vitoria(tabuleiro, 'O')) {	
		mostrarTabuleiro(tabuleiro);
		System.out.println("O computador venceu e você perdeu :( Mais sorte na pŕoxima vez");
		return true;
	}
	
	for (int i = 0; i < tabuleiro.length; i++) {
		for (int j = 0; j < tabuleiro[i].length; j++) {
			if (tabuleiro[i][j] == ' ') {
				return false;
			}
		}
	}
	mostrarTabuleiro(tabuleiro);
	System.out.println("Empatou!");
	return true;
}

private static boolean Vitoria(char[][] tabuleiro, char simbolo) {
	if ((tabuleiro[0][0] == simbolo && tabuleiro [0][1] == simbolo && tabuleiro [0][2] == simbolo) ||
		(tabuleiro[1][0] == simbolo && tabuleiro [1][1] == simbolo && tabuleiro [1][2] == simbolo) ||
		(tabuleiro[2][0] == simbolo && tabuleiro [2][1] == simbolo && tabuleiro [2][2] == simbolo) ||
		
		(tabuleiro[0][0] == simbolo && tabuleiro [1][0] == simbolo && tabuleiro [2][0] == simbolo) ||
		(tabuleiro[0][1] == simbolo && tabuleiro [1][1] == simbolo && tabuleiro [2][1] == simbolo) ||
		(tabuleiro[0][2] == simbolo && tabuleiro [1][2] == simbolo && tabuleiro [2][2] == simbolo) ||
		
		(tabuleiro[0][0] == simbolo && tabuleiro [1][1] == simbolo && tabuleiro [2][2] == simbolo) ||
		(tabuleiro[0][2] == simbolo && tabuleiro [1][1] == simbolo && tabuleiro [2][0] == simbolo) ) {
		return true;
	}
	return false;
}

public static void mostrarTabuleiro(char[][] tabuleiro) {
	System.out.println(tabuleiro[0][0] + "|" +  tabuleiro[0][1] + "|" +  tabuleiro[0][2] );
	System.out.println("-+-+-");
	System.out.println(tabuleiro[1][0] + "|" +  tabuleiro[1][1] + "|" +  tabuleiro[1][2] );
	System.out.println("-+-+-");
	System.out.println(tabuleiro[2][0] + "|" +  tabuleiro[2][1] + "|" +  tabuleiro[2][2] );
}


}