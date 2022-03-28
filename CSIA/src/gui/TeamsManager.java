package gui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import database.*;
import javax.swing.JTree;
import java.awt.BorderLayout;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JScrollPane;
import java.awt.Color;

public class TeamsManager extends JFrame {
	private ArrayList<Team> teams;

	/**
	 * Create the panel.
	 */
	public TeamsManager() {
		getContentPane().setForeground(new Color(0, 0, 128));
		setBounds(500, 300, 500, 500);
		teams = new Tournament().getTeams();

		JTree tree = new JTree();
		tree.setForeground(new Color(0, 0, 128));
		tree.setBackground(new Color(255, 0, 0));
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Teams") {
			{
				DefaultMutableTreeNode node_1;
				for(Team ii:teams) {
				node_1 = new DefaultMutableTreeNode(ii.getName());
				for (Player i : ii.getPlayers()) {
					node_1.add(new DefaultMutableTreeNode(i.getName()));
				}
				add(node_1);
				}

			}
		}));
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(tree);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		

	}

	

}
