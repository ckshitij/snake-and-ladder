package com.snake_ladder_game;

public class Player {
	private String playerName;
	private int playerCurrentPosition;
	
	public String getPlayerName() {
		return playerName;
	}

	public int getPlayerCurrentPosition() {
		return playerCurrentPosition;
	}

	public void setPlayerCurrentPosition(int playerCurrentPosition) {
		this.playerCurrentPosition = playerCurrentPosition;
	}

	public Player(String playerName) {
		this.playerName = playerName;
		this.playerCurrentPosition = 0;
	}
}
