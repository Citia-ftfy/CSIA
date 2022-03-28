package csia;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                //System.exit(0);// close 
                
                    
            }
        });
		
		WIDTH=w;
		HEIGHT=h;
		setSize(WIDTH,HEIGHT);
		homePanel = new HomeScreen();
		schedulePanel = new CheckSchedule();
		schedulePanel.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                //System.exit(0);// close 
            	schedulePanel.setVisible(false);
            	setVisible(true);
                
                    
            }
        });
		teamsPanel = new TeamsManager();
		tourneyPanel = new TournamentManager();
		tourneyPanel.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                //System.exit(0);// close 
            	tourneyPanel.setVisible(false);
            	setVisible(true);
                
                    
            }
        });
		statsPanel = new StatsScreen();
		teamsPanel.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                //System.exit(0);// close 
            	teamsPanel.setVisible(false);
            	setVisible(true);
                
                    
            }
        });
		
		
		add(homePanel);
		panelon=homePanel;
		new Thread(this).start();
		
		((Component) homePanel).setFocusable(true);
		//((Component) tourneyPanel).setFocusable(true);
		setVisible(true);
		//TODO CHANGE THIS \/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.currentThread();
				Thread.sleep(5);
				if(homePanel.getIsBB()) {
					actionPerformed(homePanel.getBb());
					//System.out.println(homePanel.getBb());
					homePanel.setIsBB(false);
				}
				if(tourneyPanel.getIsBB()) {
					actionPerformed(tourneyPanel.getBb());
					//System.out.println(homePanel.getBb());
					tourneyPanel.setIsBB(false);
				}
				//revalidate();
				
				
				
				
				
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
		
			if(homePanel.getManTourBtn()==e.getSource()) {
				//remove(homePanel);
				setVisible(false);
				tourneyPanel.setVisible(true);
				//add(tourneyPanel);
				//panelon=tourneyPanel;
				revalidate();
			}
			if(homePanel.getManTeamBtn()==e.getSource()) {
				//remove(homePanel);
				setVisible(false);
				teamsPanel.setVisible(true);
				//add(teamsPanel);
				//panelon=teamsPanel;
				revalidate();
			}
			if(homePanel.getChSchBtn()==e.getSource()) {
				//remove(homePanel);
				//add(schedulePanel);
				schedulePanel.setVisible(true);
				setVisible(false);
				//panelon=schedulePanel;
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
		//end of homePanel
		if(true) {
			if(tourneyPanel.getBackBtn()==e.getSource()) {
				//remove(tourneyPanel);
				tourneyPanel.setVisible(false);
				setVisible(true);
				//add(homePanel);
				panelon=homePanel;
				revalidate();
				
				
			}
			
			
		} //end of tourneyPanel
		
	}


	
	

	

	

}
