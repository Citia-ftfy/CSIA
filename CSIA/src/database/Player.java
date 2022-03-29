package database;

public class Player {
	private String name;
	private String age;
	private int gamesPlayed;
	private int blocks;
	private int goalsAllowed;
	private int saves;
	private int assists;
	private int goals;
	private int attempts;
	private int forces;
	private double shotpercent;
	private double GAA;
	private double blockPercent;
	
	public Player(String n) {
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getBlocks() {
		return blocks;
	}

	public void setBlocks(int blocks) {
		this.blocks = blocks;
	}

	public int getGoalsAllowed() {
		return goalsAllowed;
	}

	public void setGoalsAllowed(int goalsAllowed) {
		this.goalsAllowed = goalsAllowed;
	}

	public int getSaves() {
		return saves;
	}

	public void setSaves(int saves) {
		this.saves = saves;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public int getForces() {
		return forces;
	}

	public void setForces(int forces) {
		this.forces = forces;
	}

	public double getShotpercent() {
		return shotpercent;
	}

	public void setShotpercent(double shotpercent) {
		this.shotpercent = shotpercent;
	}

	public double getGAA() {
		return GAA;
	}

	public void setGAA(double gAA) {
		GAA = gAA;
	}

	public double getBlockPercent() {
		return blockPercent;
	}

	public void setBlockPercent(double blockPercent) {
		this.blockPercent = blockPercent;
	}

}
