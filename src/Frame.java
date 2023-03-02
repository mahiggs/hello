import javax.swing.JFrame;

public class Frame extends JFrame{

	
	protected static final int X_Location = 500;
	protected static final int Y_Location = 150;
	
	
	public Frame() {
		
		
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setLocation(X_Location, Y_Location);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Dr.Higgs Frame");
		frame.setVisible(true);
	}
}
