
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("all")
public class Frame extends JFrame{


	protected static final int X_Location = 500;
	protected static final int Y_Location = 150;
	protected JLabel label;

	
	
	public Frame() {
	
		this.setSize(500, 500);
		this.setLocation(X_Location, Y_Location);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Dr.Higgs Frame");
		
		
		
		label = new JLabel();

		label.setText("Hello");
		label.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(label);


		this.getContentPane().setBackground(Color.YELLOW);
	
		
		this.setVisible(true);
		
		
		
	}
}
