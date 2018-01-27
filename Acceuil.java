package applicationLocation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Acceuil extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JPanel hautP,milieuP;
	private JButton gaucheB,droiteB,chercherB;
	private JTextField chercherT;
	public Acceuil() {
		setLayout(new BorderLayout());
		setBackground(Color.white);
		setting_haut();
		add(hautP,BorderLayout.NORTH);
	}
	
	
	private void setting_haut() {
		hautP = new JPanel(new BorderLayout());
		System.out.println();
		gaucheB = new JButton(new ImageIcon("src/image/gauche.png"));
		droiteB = new JButton(new ImageIcon("src/image/droite.png"));
		chercherB = new JButton(new ImageIcon("src/image/search.png"));
		chercherT = new JTextField(20);
		JPanel p1 = new JPanel();
		p1.add(gaucheB);
		p1.add(droiteB);
		hautP.add(p1, BorderLayout.WEST);
		hautP.add(chercherT,BorderLayout.CENTER);
		hautP.add(chercherB,BorderLayout.EAST);
		
		// colors etc...
		gaucheB.setBackground(Color.white);
		droiteB.setBackground(Color.white);
		chercherB.setBackground(Color.white);
		chercherT.setFont(new Font("serif",Font.BOLD,35));
		p1.setBackground(Color.white);
		hautP.setBackground(Color.WHITE);
	}

}
