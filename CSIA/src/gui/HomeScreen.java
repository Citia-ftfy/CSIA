package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

import javax.swing.*;

import csia.GuiH;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;

public class HomeScreen extends JPanel {
	private BufferedImage back;
	private Graphics g2d;
	private GuiH guiH;
	private JButton Tour; //B1
	private JButton Teams; //B2
	private JButton Schedule; //B3
	private JButton Old; //B4
	private JButton Quick; //B5
	private JPanel Screen;

	public HomeScreen(GuiH guiH) {
		setBackground(Color.GREEN);
		this.guiH=guiH;
		back = null;
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		Tour = new JButton("Manage Tournaments");
		Teams = new JButton("Manage Teams");
		Schedule = new JButton("Check Schedule");
		Old = new JButton("Check Previous Matches");
		Quick = new JButton("Quick Start");
		JPanel Bpanel = new JPanel();
		Bpanel.setBackground(Color.RED);
		springLayout.putConstraint(SpringLayout.NORTH, Bpanel, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, Bpanel, 33, SpringLayout.NORTH, this);
		Bpanel.setSize(getPreferredSize());
		this.add(Bpanel);
		GroupLayout gl_Bpanel = new GroupLayout(Bpanel);
		gl_Bpanel.setHorizontalGroup(
			gl_Bpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Bpanel.createSequentialGroup()
					.addGap(5)
					.addComponent(Tour)
					.addGap(5)
					.addComponent(Teams)
					.addGap(5)
					.addComponent(Schedule)
					.addGap(5)
					.addComponent(Old)
					.addGap(5)
					.addComponent(Quick))
		);
		gl_Bpanel.setVerticalGroup(
			gl_Bpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Bpanel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_Bpanel.createParallelGroup(Alignment.LEADING)
						.addComponent(Tour)
						.addComponent(Teams)
						.addComponent(Schedule)
						.addComponent(Old)
						.addComponent(Quick)))
		);
		Bpanel.setLayout(gl_Bpanel);
		Screen = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, Screen, 6, SpringLayout.SOUTH, Bpanel);
		springLayout.putConstraint(SpringLayout.SOUTH, Screen, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, Bpanel, 0, SpringLayout.EAST, Screen);
		springLayout.putConstraint(SpringLayout.WEST, Bpanel, 0, SpringLayout.WEST, Screen);
		springLayout.putConstraint(SpringLayout.WEST, Screen, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, Screen, -10, SpringLayout.EAST, this);
		this.add(Screen);
		Screen.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		Tour.addActionListener(guiH);
		Teams.addActionListener(guiH);
		Schedule.addActionListener(guiH);
		Old.addActionListener(guiH);
		Quick.addActionListener(guiH);
		
		
		//revalidate();
		//repaint();
	}

	public void pain(Graphics g) {
		Graphics2D twoDgraph = (Graphics2D) g;
		if (back == null) {
			back = (BufferedImage) (createImage(Screen.getWidth(), Screen.getHeight()));
		}
		g2d = back.createGraphics();
		g2d.clearRect(getX(), getY(), Screen.getSize().width, Screen.getSize().height);
		g2d.setColor(Color.black);
		g2d.fill3DRect(0, 0, Screen.getSize().width, Screen.getSize().height,false);
		g2d.drawString("ur gay dumb", 200, 200);

		twoDgraph.drawImage(back, 0, 0, null);
	}

	public Graphics getG2d() {
		return g2d;
	}
	
	public void screen(Object O) {
		//TODO Figure out how to change screens
		//new Painter(O);
		
		
	}

	public JButton getTour() {
		return Tour;
	}

	public JButton getTeams() {
		return Teams;
	}

	public JButton getSchedule() {
		return Schedule;
	}

	public JButton getOldMatch() {
		return Old;
	}

	public JButton getQuick() {
		return Quick;
	}

}
