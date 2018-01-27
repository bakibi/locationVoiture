package applicationLocation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Authentification extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel userL,mdpL;
	private JTextField userT;
	private JPasswordField mdpT;
	private JButton validerB;
	public Authentification() {
		JPanel pan = new JPanel(new GridLayout(3, 2,0,0));
		initialization();
		pan.add(userL);		pan.add(userT);
		pan.add(mdpL);		pan.add(mdpT);
		pan.add(new JLabel(" "));pan.add(validerB);
		pan.setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		add(pan,gc);
		pan.setBorder(BorderFactory.createTitledBorder("Se Connecter :"));
		
		
	}
	
	private void initialization() {
		userL = new JLabel("Nom d'utilisateur");
		mdpL = new JLabel("le mot de passe");
		userT = new JTextField(20);
		mdpT = new JPasswordField(20);
		validerB = new JButton("Se connecter");
		userL.setFont(new Font("Garamond", Font.BOLD  , 15));
		mdpL.setFont(new Font("Garamond", Font.BOLD  , 15));
		userT.setFont(new Font("courrier", Font.BOLD  , 15));
		validerB.setFont(new Font("courrier", Font.BOLD  , 14));
		validerB.setBackground(Color.WHITE);;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Image background;
		try {
			background = ImageIO.read(new File("src/image/acc.jpg"));
			
			 g.drawImage(background, 0, 0,getWidth(),getHeight(), null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}	
	}
	
	
	
	
	
}
