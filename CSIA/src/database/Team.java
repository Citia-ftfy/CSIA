package database;

import java.util.ArrayList;

public class Team {
	private ArrayList<Player> players;
	private String name;
	
	
	public Team() {
		
		
		
	}
	
	public Team(ArrayList<Player> players) {
		this.setPlayers(players);
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	

}
