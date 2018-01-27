package applicationLocation;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Fenetre() {
		setTitle("Application - Location de voiture .");
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setLocation(0, 0);
		setDefaultCloseOperation(3);
		/*add(new Button("North"),BorderLayout.NORTH);
		add(new Button("south"),BorderLayout.SOUTH);
		add(new Button("east"),BorderLayout.EAST);
		add(new Button("weast"),BorderLayout.WEST);*/
		//add(new Authentification(),BorderLayout.CENTER);
		add(new Acceuil(),BorderLayout.CENTER);
		/* FULL SCREEN*/
		/*setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);*/
		
		setVisible(true);
	}
	

}
