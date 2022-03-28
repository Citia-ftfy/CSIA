package gui;

import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import database.*;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Action;
import java.awt.BorderLayout;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Color;

public class TournamentManager extends JFrame {
	private final Action action = new SwingAction();
	private ActionEvent bb;
	private boolean isBB;
	private JButton backBtn;

	public JButton getBackBtn() {
		return backBtn;
	}

	/**
	 * Create the panel.
	 */
	public TournamentManager() {
		
		isBB = false;
		Tournament l = new Tournament();
		l.getTournaments();
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		getContentPane().add(panel, BorderLayout.NORTH);
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(255, 0, 0));
		comboBox.setBackground(new Color(0, 0, 128));
		panel.add(comboBox);
		
		comboBox.setModel(new DefaultComboBoxModel(l.getNames()));
		
		backBtn = new JButton("New button");
		backBtn.setForeground(new Color(255, 0, 0));
		backBtn.setBackground(new Color(0, 0, 128));
		panel.add(backBtn);
		backBtn.setAction(action);
		
		
		JTree tree = new JTree();
		tree.setForeground(new Color(0, 0, 128));
		tree.setBackground(new Color(255, 0, 0));
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode(comboBox.getSelectedItem()) {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Teams");
						node_1.add(new DefaultMutableTreeNode("Lamar"));
						node_1.add(new DefaultMutableTreeNode("Jersey Village"));
						node_1.add(new DefaultMutableTreeNode("Cypress Creek"));
						node_1.add(new DefaultMutableTreeNode("Saint Agnes"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Matches");
						for(Match i: l.getMatches(comboBox.getSelectedIndex())){
							node_1.add(new DefaultMutableTreeNode(i.getName()));
						}
					add(node_1);
				}
			}
		));
		getContentPane().add(tree, BorderLayout.CENTER);
		setSize(500,500);
		

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
			putValue(NAME, "Back to Menu");
			putValue(SHORT_DESCRIPTION, "Go Back to Menu");
		}
		public void actionPerformed(ActionEvent e) {
			bb=e;
			isBB=true;
		}
	}
}
