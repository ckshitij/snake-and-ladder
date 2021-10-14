package com.snake_ladder_game;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		/*
		 * Game Start
		 * Input for this file there in ReadMe.md
		 */
		 GameBoard<Integer, Integer> gameBoard = new GameBoard<Integer, Integer>();
		 Dice dice = new Dice();
		 Scanner scanner = new Scanner(System.in);
		 int totalSnake = scanner.nextInt();
		 for(int i = 0 ; i < totalSnake; i++) {
			 Integer source = scanner.nextInt();
			 Integer destination = scanner.nextInt();
			 gameBoard.getSnakes().put(source, destination);
		 }

		 int totalLadder = scanner.nextInt();
		 for(int i = 0 ; i < totalLadder; i++) {
			 Integer source = scanner.nextInt();
			 Integer destination = scanner.nextInt();
			 gameBoard.getLadders().put(source, destination);
		 }
		 int totalPlayer = scanner.nextInt();
		 for(int i = 0 ; i < totalPlayer; i++) {
			 String name = scanner.next();
			 gameBoard.getPlayers().add(new Player(name));
		 }
		 while(true) {
			 for(Player player: gameBoard.getPlayers()) {
				 int numberGet = dice.rollDice();
				 int newPosition = player.getPlayerCurrentPosition() + numberGet;
				 if(newPosition < 100) {
					 System.out.println(player.getPlayerName() + " rolled a " + numberGet 
							 + " and moved from " + player.getPlayerCurrentPosition() + " to " + newPosition);
					 player.setPlayerCurrentPosition(newPosition);
				 } else if(newPosition == 100) {
					 System.out.println(player.getPlayerName() + " rolled a " + numberGet 
							 + " and moved from " + player.getPlayerCurrentPosition() + " to " + newPosition
							 + " and Win the game");
					 return;
				 } else {
					 System.out.println(player.getPlayerName() + " need to wait till get the 100.......");
				 }
				 if (gameBoard.getSnakes().get(newPosition) != null) {
					 System.out.println(player.getPlayerName() + " got a snake bite and moved from " 
							 + newPosition + " to " + gameBoard.getSnakes().get(newPosition) + " shit ####");
					 player.setPlayerCurrentPosition(gameBoard.getSnakes().get(newPosition));
				 } else if (gameBoard.getLadders().get(newPosition) != null) {
					 System.out.println(player.getPlayerName() + " got a ladder and moved from " 
							 + newPosition + " to " + gameBoard.getLadders().get(newPosition) + " horray !!!");
					 player.setPlayerCurrentPosition(gameBoard.getLadders().get(newPosition));
			     }
			  }
		 }
	}
}
