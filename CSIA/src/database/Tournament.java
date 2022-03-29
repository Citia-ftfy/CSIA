package database;


import java.util.*;

public class Tournament {
	private ArrayList<Tourney> tournaments;
	private Team lamar,cyCreek,stAg,jV;
	private ArrayList<Team> teams;
	
	public ArrayList<Team> getTeams() {
		return teams;
	}

	public Tournament() {
		tournaments = new ArrayList<Tourney>();
		teams=teamsetting();
		java.util.Date date = new java.util.Date();   
		tournaments.add(new Tourney(date,teams,new ArrayList<Match>(),"Maeve the Brave"));
		
		
	}
	
	public ArrayList<Team> teamsetting() {
		ArrayList<Team> temp = new ArrayList<Team>();
		lamar = new Team(new ArrayList<Player>() {
			{
				add(new Player("Isaac"));
				add(new Player("John"));
				add(new Player("Oliver"));
				add(new Player("Jack"));
				add(new Player("Iban"));
				add(new Player("Matias"));
				add(new Player("Jake"));
				add(new Player("Kevin"));

			}
		});
		lamar.setName("Lamar");
		cyCreek = new Team(new ArrayList<Player>() {
			{
				add(new Player("Isaac"));
				add(new Player("John"));
				add(new Player("Oliver"));
				add(new Player("Jack"));
				add(new Player("Iban"));
				add(new Player("Matias"));
				add(new Player("Jake"));
				add(new Player("Kevin"));

			}
		});
		cyCreek.setName("Cypress Creek");
		stAg = new Team(new ArrayList<Player>() {
			{
				add(new Player("Isaac"));
				add(new Player("John"));
				add(new Player("Oliver"));
				add(new Player("Jack"));
				add(new Player("Iban"));
				add(new Player("Matias"));
				add(new Player("Jake"));
				add(new Player("Kevin"));

			}
		});
		stAg.setName("Saint Agnes");
		jV = new Team(new ArrayList<Player>() {
			{
				add(new Player("Isaac"));
				add(new Player("John"));
				add(new Player("Oliver"));
				add(new Player("Jack"));
				add(new Player("Iban"));
				add(new Player("Matias"));
				add(new Player("Jake"));
				add(new Player("Kevin"));

			}
		});
		jV.setName("Jersey Village");
		temp.add(lamar);
		temp.add(stAg);
		temp.add(cyCreek);
		temp.add(jV);
		return temp;
	}
	
	
	public ArrayList<Tourney> getTournaments() {
		return tournaments;
	}
	
	public String[] getNames() {
		String temp[]= new String[tournaments.size()];
		int x=0;
		for(Tourney i:tournaments) {
			temp[x]=i.getName();
			
			x++;
		}
		return temp;
	}
	
//	public String[] getNames() {
//		String temp[]= new String[tournaments.size()];
//		int x=0;
//		for(Tourney i:tournaments) {
//			temp[x]=i.getName();
//			
//			x++;
//		}
//		return temp;
//	}
//	
//	public String[] getNames() {
//		String temp[]= new String[tournaments.size()];
//		int x=0;
//		for(Tourney i:tournaments) {
//			temp[x]=i.getName();
//			
//			x++;
//		}
//		return temp;
//	}
	
	
	public Match[] getMatches(int i) {
		Match temp[]= new Match[tournaments.get(i).getMatches().size()];
		
		
		int y=0;
		for(Match x:tournaments.get(i).getMatches()) {
			temp[y]=x;
			y++;
		}
				
			
		
		return temp;
	}





	protected class Tourney {
		private Date date;
		private ArrayList<Team> teams;
		private ArrayList<Match> matches;
		private String name;
		
		public Tourney() {
			
			
			
			
		}
		
		public Tourney(Date date,ArrayList<Team> teams,ArrayList<Match> matches,String n) {
			setDate(date);
			setTeams(teams);
			for(int i=0;i<5;i++) {
				matches.add(new Match(teams.get((int)(Math.random()*4)),teams.get((int)(Math.random()*4))));
				
				
			}
			setMatches(matches);
			setName(n);
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<Match> getMatches() {
			return matches;
		}

		public void setMatches(ArrayList<Match> matches) {
			this.matches = matches;
		}

		public ArrayList<Team> getTeams() {
			return teams;
		}

		public void setTeams(ArrayList<Team> teams) {
			this.teams = teams;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
		
		
		
		
		
	}
	
	
	

}
