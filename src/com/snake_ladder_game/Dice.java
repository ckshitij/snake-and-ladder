package com.snake_ladder_game;

import java.util.Random;

public class Dice {
	
	private int minVal;
	private int maxVal;
	
	public Dice() {
		this.minVal = 1;
		this.maxVal = 7;
	}
	
	public void setMinVal(int minVal) {
		this.minVal = minVal;
	}

	public void setMaxVal(int maxVal) {
		this.maxVal = maxVal;
	}

	public int rollDice() {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(maxVal - minVal) + minVal;
	} 
}
