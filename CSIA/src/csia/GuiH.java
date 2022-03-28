package csia;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import gui.*;
import gui.HomeScreen;

public class GuiH extends JFrame implements ActionListener,WindowListener,MouseListener,MouseMotionListener,Runnable{
	//THIS CLASS ACTS LIKE THE MAIN() CLASS
	private static int WIDTH;
	private static int HEIGHT;
	private JPanel panel;
	private JPanel lastp;
	
	public GuiH(int w,int h){
		super("CSIA");
		new Thread(this).start();
		WIDTH=w;
		HEIGHT=h;
		setSize(WIDTH,HEIGHT);
		
		panel = new HomeScreen(this);
		add(panel);
		((Component) panel).setFocusable(true);
		setVisible(true);
		//TODO CHANGE THIS \/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.currentThread().sleep(5);
				//repaint();
			}
		}
		catch(Exception e) {}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString().contains("text=Quick Start"));
		if(e.toString().contains("text=Quick Start")) {
			remove(panel);
			lastp=panel;
			panel= null;
			panel= new MatchScreen(this);
			add(panel);
			revalidate();
			
		}
		if(e.toString().contains("text=Go Back")) {
			remove(panel);
			JPanel temp = panel;
			panel=lastp;
			lastp=temp;
			add(panel);
			revalidate();
			repaint();
		}
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	

}
