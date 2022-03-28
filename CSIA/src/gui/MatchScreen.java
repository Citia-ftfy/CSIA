package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JPanel;

import csia.GuiH;

public class MatchScreen extends JPanel {
	private BufferedImage back;
	private Graphics g2d;
	private JButton gb;
	private GuiH guiH;

	public MatchScreen(GuiH gH) {
		back = null;
		guiH=gH;
		
		gb=new JButton("Go Back");
		add(gb);
		gb.addActionListener(guiH);
		
		repaint();
		revalidate();
	}
	
	public void paint(Graphics g) {
		Graphics2D twoDgraph = (Graphics2D) g;
		if (back == null) {
			back = (BufferedImage) (createImage(getWidth(), getHeight()));
		}
		g2d = back.createGraphics();
		g2d.clearRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(Color.black);
		g2d.drawString("ur gay fr", 250, 200);

		twoDgraph.drawImage(back, 0, 0, null);
	}

	public Graphics getG2d() {
		return g2d;
	}

}
