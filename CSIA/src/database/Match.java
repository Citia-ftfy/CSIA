package database;

public class Match {
	private String name;
	private Team t1;
	private Team t2;
	
	Match(Team t1,Team t2){
		this.t1=t1;
		this.t2=t2;
		name=t1.getName()+" Vs "+t2.getName();
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getT1() {
		return t1;
	}

	public void setT1(Team t1) {
		this.t1 = t1;
	}

	public Team getT2() {
		return t2;
	}

	public void setT2(Team t2) {
		this.t2 = t2;
	}

}
