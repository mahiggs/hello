
import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame extends JFrame{


	protected static final int X_Location = 500;
	protected static final int Y_Location = 150;
	protected JLabel label;
	protected JFrame frame;
	protected ImageIcon image;

	public Frame() {


		frame = new JFrame();



		frame.setSize(500, 500);
		frame.setLocation(X_Location, Y_Location);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Dr.Higgs Frame");

		label = new JLabel();
		label.setText("This is Dr.Higgs");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		
		frame.add(label);

		frame.setVisible(true);
	}
}
