package pos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
	
	/* Startup Screen */
	private JButton startPOS;
	
	/* Order Screen */
	private JButton whataburger;
	private JButton dblWhataburger;
	private JButton trplWhataburger;
	
	public Window() {
		super("Whataburger POS");
		setLayout(new FlowLayout());
		startPOS = new JButton("Start POS");
		add(startPOS);
		
		listener buttonListener = new listener();
		startPOS.addActionListener(buttonListener);
	}
	
	private class listener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == startPOS) {
				remove(startPOS);
				revalidate();
				repaint();
				setUpOrderScreen();
			}
			
		}
	}
		
	public void setUpOrderScreen() {
			
		JButton whataburger = new JButton("Whataburger");
		JButton dblWhataburger = new JButton("Double Meat Whataburger");
		JButton trplWhataburger = new JButton("Triple Meat Whataburger");
			
		add(whataburger);
		add(dblWhataburger);
		add(trplWhataburger);
	}
}
