package uninter.work;

import java.util.Random;

public class ComputerHard {

    private static boolean checkMove(char[][] board, String pos) {
        switch (pos) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }

    private static void movePos(char[][] board, String pos, char simbol) {
        switch (pos) {
            case "1":
                board[0][0] = simbol;
                break;
            case "2":
                board[0][1] = simbol;
                break;
            case "3":
                board[0][2] = simbol;
                break;
            case "4":
                board[1][0] = simbol;
                break;
            case "5":
                board[1][1] = simbol;
                break;
            case "6":
                board[1][2] = simbol;
                break;
            case "7":
                board[2][0] = simbol;
                break;
            case "8":
                board[2][1] = simbol;
                break;
            case "9":
                board[2][2] = simbol;
                break;
            default:
                System.out.println(":(");
        }
    }

    public static void play(char[][] board) {
        Random random = new Random();

        int computerMove;

        while (true) {
            computerMove = random.nextInt(9) + 1;

            if (checkMove(board, Integer.toString(computerMove))) {
                System.out.println("O computador jogou " + computerMove);

                movePos(board, Integer.toString(computerMove), 'O');

                break;
            }
        }

    }
}
