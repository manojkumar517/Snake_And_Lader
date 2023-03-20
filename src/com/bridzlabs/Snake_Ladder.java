package com.bridzlabs;

public class Snake_Ladder {
        public static void main(String[] args) {
            System.out.println("Welcome to snake and ladder problem");
            SnakeAndLadderGame snakeAndLadderGame1 = new SnakeAndLadderGame("Player 1");
            SnakeAndLadderGame snakeAndLadderGame2 = new SnakeAndLadderGame("Player 2");

            while (true) {
                System.out.println("\n"+snakeAndLadderGame1.playerName+" Turn ");
                if (snakeAndLadderGame1.WON == snakeAndLadderGame1.Turn()) {
                    System.out.println(snakeAndLadderGame1.playerName+" WON the game ");
                    break;
                }
                System.out.println("\n"+snakeAndLadderGame2.playerName+" Turn ");
                if (snakeAndLadderGame2.WON == snakeAndLadderGame2.Turn()) {
                    System.out.println(snakeAndLadderGame2.playerName+" WON the game ");
                    break;
                }
            }

        }
}
