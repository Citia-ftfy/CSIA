package gui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import database.Player;
import database.Team;
import database.Tournament;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class StatsScreen extends JFrame {
	private ArrayList<Team> teams;

	/**
	 * Create the panel.
	 */
	public StatsScreen() {
		setBounds(1000,500,500,200);
		setName("Stats Breakdown");
		
		JScrollPane scrollPane = new JScrollPane();
		
		teams= new Tournament().getTeams();
		JTree tree = new JTree();
		tree = getTree();
		scrollPane.setViewportView(tree);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("STATISTICS BREAKDOWN");
		scrollPane.setColumnHeaderView(lblNewLabel);

	}
	
	
	private JTree getTree() {
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Players") {
			{
				DefaultMutableTreeNode node_1;
				DefaultMutableTreeNode node_player;
				for(Team ii:teams) {
				node_1 = new DefaultMutableTreeNode(ii.getName());
				for (Player i : ii.getPlayers()) {
					node_player = new DefaultMutableTreeNode();
					//node_player.add(new DefaultMutableTreeNode(i.getAge()));
					//node_player.add(new DefaultMutableTreeNode(i.getAssists()));
					//node_player.add(new DefaultMutableTreeNode(i.getAge()));
					//node_player.add(new DefaultMutableTreeNode(i.getAge()));
					//node_player.add(new DefaultMutableTreeNode(i.getAge()));
					//node_player.add(new DefaultMutableTreeNode(i.getAge()));
					//node_player.add(new DefaultMutableTreeNode(i.getAge()));
					node_1.add(node_player);
					node_1.add(new DefaultMutableTreeNode(i.getName()));
				}
				add(node_1);
				}

			}
		}));
		
		
		return null;
	}

}
