package com.snake_ladder_game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameBoard<K, V> {
	private int board[];
	private Map<K,V> snakes;
	private Map<K,V> ladders;
	private List<Player> players;

	public Map<K, V> getSnakes() {
		return snakes;
	}

	public Map<K, V> getLadders() {
		return ladders;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public GameBoard(int n) {
		board = new int[n];
		initBoard(n);
	}
	
	public GameBoard() {
		board = new int[101];
		initBoard(101);
	}
	
	private void initBoard(int n) {
		this.snakes = new HashMap<K, V>();
		this.ladders = new HashMap<K, V>();
		this.players = new ArrayList<>(); 
		for(int i = 1; i < n; i++) {
			board[i] = i;
		}
	}
}
