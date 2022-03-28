package csia;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.*;
import gui.*;

public class GuiH extends JFrame implements Runnable,ActionListener{
	//THIS CLASS ACTS LIKE THE MAIN() CLASS
	private static int WIDTH;
	private static int HEIGHT;
	private HomeScreen homePanel;
	private CheckSchedule schedulePanel;
	private MatchScreen matchPanel; //TODO see if i should put this as a normal panel
	private TeamsManager teamsPanel;
	private TournamentManager tourneyPanel;
	private StatsScreen statsPanel;
	private OldMatches oldPanel;
	private JPanel panelon;
	//private JPanel lastPanel;
	
	public GuiH(int w,int h){
		super("CSIA");
		
		WIDTH=w;
		HEIGHT=h;
		setSize(WIDTH,HEIGHT);
		homePanel = new HomeScreen();
		schedulePanel = new CheckSchedule();
		teamsPanel = new TeamsManager();
		tourneyPanel = new TournamentManager();
		statsPanel = new StatsScreen();
		
		
		add(homePanel);
		panelon=homePanel;
		new Thread(this).start();
		
		((Component) homePanel).setFocusable(true);
		setVisible(true);
		//TODO CHANGE THIS \/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.currentThread().sleep(5);
				if(homePanel.getIsBB()) {
					actionPerformed(homePanel.getBb());
					//System.out.println(homePanel.getBb());
					homePanel.setIsBB(false);
				}
				
				
				
				
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e);
		if(panelon==homePanel) {
			if(homePanel.getManTourBtn()==e.getSource()) {
				remove(homePanel);
				add(tourneyPanel);
				panelon=tourneyPanel;
				revalidate();
			}
			if(homePanel.getManTeamBtn()==e.getSource()) {
				remove(homePanel);
				add(teamsPanel);
				panelon=teamsPanel;
				revalidate();
			}
			if(homePanel.getChSchBtn()==e.getSource()) {
				remove(homePanel);
				add(schedulePanel);
				panelon=schedulePanel;
				revalidate();
			}
			if(homePanel.getChPreMatch()==e.getSource()) {
				remove(homePanel);
				add(oldPanel);
				panelon=oldPanel;
				revalidate();
			}
			if(homePanel.getQuickStart()==e.getSource()) {
				remove(homePanel);
				matchPanel = new MatchScreen(); //TODO MAKE IT QUICK
				add(matchPanel);
				panelon=matchPanel;
				revalidate();
			}
			if(homePanel.getChStats()==e.getSource()) {
				remove(homePanel);
				add(statsPanel);
				panelon=statsPanel;
				revalidate();
			}
		}
		
	}


	
	

	

	

}
