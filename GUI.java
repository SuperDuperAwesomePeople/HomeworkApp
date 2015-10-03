import javax.swing.*;
import java.awt.*;
import java.util.*;


public class GUI extends JFrame {
	
	JFrame vis = new JFrame();
	JPanel eventList = new JPanel();
	JPanel calendar = new JPanel();
	
	public GUI() {
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		propFrame(vis, new Dimension(500, 500), new String("Homework App"), eventList, calendar);
		propPanel(eventList, Color.RED, new Dimension(250, 500));
		propPanel(calendar, Color.BLUE, new Dimension(250, 500));
		
	}
	
	public void propFrame(JFrame frame, Dimension d, String title, JPanel panel1, JPanel panel2) {
		frame.setSize(d);
		frame.setTitle("Homework Organizeshun");
		frame.add(eventList);
		frame.add(calendar);
		frame.setVisible(true);
	}
	
	public void propPanel(JPanel panel, Color c, Dimension d) {
		panel.setBackground(c);
		panel.setSize(d);
	}
	
}
