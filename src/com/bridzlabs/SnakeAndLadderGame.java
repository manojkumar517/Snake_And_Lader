package com.bridzlabs;

public class SnakeAndLadderGame {
        public static final int LADDER = 1;
        public static final int SNAKE = 2;
        public static final String WON = "WON";
        public static final String NOT_WON = "NOT WON";
        public static int WIN_POSITION = 100;

        public int playerPosition;
        public int dicePlayed;
        public String playerName;

        SnakeAndLadderGame(String playerName) {
            this.playerPosition = 0;
            this.dicePlayed = 0;
            this.playerName = playerName;
            System.out.println("Snake and Ladder game starts player position is "+this.playerPosition);
        }

        public int dice() {
            dicePlayed++;
            return (int) Math.floor(Math.random() * 10) % 6 + 1;
        }

        public String Turn() {
            int ThrowDice = this.dice();
            int playOption = (int) Math.floor(Math.random() * 10) % 3;
            boolean gotLadder = false;
            switch (playOption) {
                case LADDER:
                    System.out.println("\t Play option is Ladder the player moves ahead by the "+ThrowDice+" number of position");
                    playerPosition = (playerPosition + ThrowDice) <= 100 ? (playerPosition + ThrowDice) : playerPosition;
                    gotLadder = true;
                    break;
                case SNAKE:
                    System.out.println("\t Play option is Snake the player moves behind by the "+ThrowDice+" number of position");
                    playerPosition -= ThrowDice;
                    playerPosition = playerPosition < 0 ? 0 : playerPosition;
                    break;
                default:
                    System.out.println("\t Play option is No Play the player stays in the same position");
            }
            if (this.playerPosition == this.WIN_POSITION) {
                return this.WON;
            } else {
                if (gotLadder) {
                    return this.Turn();
                } else {
                    System.out.println("\t "+this.playerName+" current position is "+playerPosition);
                    return this.NOT_WON;
                }
            }
        }

        public void play() {
            while (this.playerPosition < this.WIN_POSITION ) {
                this.Turn();
            }
            System.out.println(this.dicePlayed+" time dice played to win the game");
        }
}
