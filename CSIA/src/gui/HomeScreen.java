package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class HomeScreen extends JPanel {
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private ActionEvent bb;
	private Boolean isBB=false;
	public JButton getManTourBtn() {
		return manTourBtn;
	}

	public JButton getManTeamBtn() {
		return manTeamBtn;
	}

	public JButton getChSchBtn() {
		return chSchBtn;
	}

	public JButton getChPreMatch() {
		return chPreMatch;
	}

	public JButton getQuickStart() {
		return quickStart;
	}

	public JButton getChStats() {
		return chStats;
	}
	private JButton manTourBtn;
	private JButton manTeamBtn;
	private JButton chSchBtn;
	private JButton chPreMatch;
	private JButton quickStart;
	private JButton chStats;

	/**
	 * Create the panel.
	 */
	public HomeScreen() {
		setBackground(new Color(255, 0, 0));
		setLayout(new BorderLayout(0, 0));
		System.out.println(this.getParent());
		
		JLabel lblNewLabel = new JLabel("Lamar Texans Water Polo Manager");
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Autumn", Font.ITALIC, 40));
		add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		add(panel, BorderLayout.CENTER);
		
		manTourBtn = new JButton("Manage Tournaments");
		manTourBtn.setForeground(new Color(255, 0, 0));
		manTourBtn.setBackground(new Color(0, 0, 128));
		manTourBtn.setAction(action);
		panel.add(manTourBtn);
		
		manTeamBtn = new JButton("Manage Teams");
		manTeamBtn.setForeground(new Color(255, 0, 0));
		manTeamBtn.setBackground(new Color(0, 0, 128));
		manTeamBtn.setAction(action_1);
		panel.add(manTeamBtn);
		
		chSchBtn = new JButton("Check Schedule");
		chSchBtn.setForeground(new Color(255, 0, 0));
		chSchBtn.setBackground(new Color(0, 0, 128));
		chSchBtn.setAction(action_2);
		panel.add(chSchBtn);
		
		chPreMatch = new JButton("Check Previous Matches");
		chPreMatch.setForeground(new Color(255, 0, 0));
		chPreMatch.setBackground(new Color(0, 0, 128));
		chPreMatch.setAction(action_3);
		panel.add(chPreMatch);
		
		quickStart = new JButton("Quick Start");
		quickStart.setForeground(new Color(255, 0, 0));
		quickStart.setBackground(new Color(0, 0, 128));
		quickStart.setAction(action_4);
		panel.add(quickStart);
		
		chStats = new JButton("Statistics Breakdown");
		chStats.setForeground(new Color(255, 0, 0));
		chStats.setBackground(new Color(0, 0, 128));
		chStats.setAction(action_5);
		panel.add(chStats);

	}
	
	public ActionEvent getBb() {
		return bb;
	}
	

	public Boolean getIsBB() {
		return isBB;
	}

	public void setIsBB(Boolean isBB) {
		this.isBB = isBB;
	}


	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Manage Tournaments");
			putValue(SHORT_DESCRIPTION, "Go to Tournament Manager");
			
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("THIS WORKS IG");
			bb=e;
			isBB=true;
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Manage Teams");
			putValue(SHORT_DESCRIPTION, "Go to Team Manager");
			
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("Does IT");
			bb=e;
			isBB=true;
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Check Schedule");
			putValue(SHORT_DESCRIPTION, "Look at Upcoming matches and Tournaments");
		}
		public void actionPerformed(ActionEvent e) {
			bb=e;
			isBB=true;
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Check Previous Matches");
			putValue(SHORT_DESCRIPTION, "Look at old Matches that just happened and their immediate breakdowns");
		}
		public void actionPerformed(ActionEvent e) {
			bb=e;
			isBB=true;
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Quick Match");
			putValue(SHORT_DESCRIPTION, "Start a new match now!");
		}
		public void actionPerformed(ActionEvent e) {
			bb=e;
			isBB=true;
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Statistics Breakdown");
			putValue(SHORT_DESCRIPTION, "Look at the stats recorded by this application");
		}
		public void actionPerformed(ActionEvent e) {
			bb=e;
			isBB=true;
		}
	}
}
