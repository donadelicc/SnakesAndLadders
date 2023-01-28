package ferdigLagd;

import java.util.*;
import java.io.*;
 
public class SnakesAndLadders {
    void snakeGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO SNAKES AND LADDERS");
        System.out.println("===================================================================================");
        System.out.println("Please excuse me, I still haven't learnt graphics :(");
        System.out.println("There are snakes on squares 17, 54, 62, 64, 87, 93, 95 and 98. Tread with care!");
        System.out.println("There are ladders on squares 4, 16, 35, 50, 57, 67, 68 and 86. Good Luck!");
        System.out.println("Press an key to start the game...");
        br.readLine();
        Random r = new Random();
        int player1Index = 1, player2Index = 1;
        int playerIndex;
        int playerNum = 1; // 1 for player1; 2 for player2
        while ((player1Index != 100) || (player2Index != 100)) {
            System.out.println("Player " + playerNum+ ", press any key to shuffle the die...");
            br.readLine();
            int dThrow = r.nextInt(6);
            if (dThrow == 0) {
                dThrow++;
            }
            System.out.println("The number on the die is " + dThrow);
            if (playerNum == 1) {
                playerIndex = player1Index;
            } else {
                playerIndex = player2Index;
            }
            if ((playerIndex + dThrow) > 100) {
                System.out.println("You will have to wait for the next turn, you have exceeded 100.");
            } else if ((playerIndex + dThrow) == 100) {
                System.out.println("Congratulations player "+ playerNum+ ", you have won the game! Better luck next time, Player "
                                + (playerNum == 1 ? 2 : 1) + ".");
                break;
            } else {
                playerIndex += dThrow;
                System.out.println("You have progressed by " + dThrow+ " square(s), and your new position is " + playerIndex+ ".");
                System.out.println("Press any key to see whether you encountered a snake or a ladder.");
                br.readLine();
                System.out.println();
                if (playerNum == 1) {
                    player1Index = stepMove(playerIndex);
                    playerNum = 2;
                } else {
                    player2Index = stepMove(playerIndex);
                    playerNum = 1;
                }
            }
        }
    }
    private int stepMove(int playerIndex) {
        switch (playerIndex) {
        case 4:System.out.println("Awright! You got the ladder on square 4! Your new position is 14. Your nearest ladder is at 16, hope you get a two XD.");
            playerIndex = 14;
            break;
        case 16:System.out.println("Awright! You got the ladder on square 16! Your new position is 82.That's a big jump!");
            playerIndex = 82;
            break;
        case 17:System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
            playerIndex = 8;
            break;
        case 35:System.out.println("Awright! You got the ladder at square 35! Your new position is 78.");
            playerIndex = 78;
            break;
        case 50:System.out.println("Awright! You got the ladder at square 50! Your new position is 60.");
            playerIndex = 60;
            break;
        case 54:System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
        playerIndex = 28;
            break;
        case 57:System.out.println("Awright! You got the ladder on square 57! Your new position is 79.");
            playerIndex = 79;
            break;
        case 62:System.out.println("Whoops! You were caught by the snake at square 62! You're now down to square 13. :(");
            playerIndex = 13;
            break;
        case 64:System.out.println("Whoops! You were caught by the snake at square 64! You're now down to square 20. :(");
            playerIndex = 20;
            break;
        case 68:System.out.println("Awright! You got the ladder on square 68! Your new position is 85.");
            playerIndex = 85;
            break;
        case 77:System.out.println("Awright! You got the ladder on square 77! Your new position is 96!! Getting close, but watch for the snake on 98!");
            playerIndex = 96;
            break;
        case 86:System.out.println("Awright! You got the ladder on square 86! Your new position is 92.");
            playerIndex = 92;
            break;
        case 87:System.out.println("Whoops! You were caught by the snake at square 87! You're now down to square 75. :(");
            playerIndex = 75;
            break;
        case 93:System.out.println("Whoops! You were caught by the snake at square 93! You're now down to square 83. :(");
            playerIndex = 83;
            break;
        case 95:System.out.println("Whoops! You were caught by the snake at square 95! You're now down to square 64. :(");
            playerIndex = 64;
            break;
        case 98:System.out.println("The higher they fly the harder they fall! You have been caught by the biggest snake in the game and are now down to square 8. Good day sir!");
            playerIndex = 8;
            break;
        default:
            System.out.println("No snakes or ladders here.");
        }
        return playerIndex;
    }
 
    public static void main(String[] args) throws IOException {
        SnakesAndLadders s = new SnakesAndLadders();
        s.snakeGame();
    }
}