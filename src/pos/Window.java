package pos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
	
	/* Startup Screen */
	private JButton startPOS;
	private JButton shutdown;
	
	/* Order Screen */
	private JTextField orderList;
	
	private JButton whataburger;
	private JButton dblWhataburger;
	private JButton trplWhataburger;
	
	public Window() {
		super("Whataburger POS");
		setLayout(new FlowLayout());
		startPOS = new JButton("Start POS");
		add(startPOS);
		
		shutdown = new JButton("Shutdown");
		add(shutdown);
		
		listener buttonListener = new listener();
		startPOS.addActionListener(buttonListener);
	}
	
	private class listener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == startPOS || event.getSource() == whataburger) {
				remove(startPOS);
				remove(shutdown);
				revalidate();
				repaint();
				setUpOrderScreen();
			}
			
			if(event.getSource() == shutdown) {
				orderList.setText(whataburger.getText());
				System.out.println(whataburger.getText());
			}
			
		}
	}
		
	public void setUpOrderScreen() {
		
		JTextField orderList = new JTextField("test");
			
		JButton whataburger = new JButton("Whataburger");
		JButton dblWhataburger = new JButton("Double Meat Whataburger");
		JButton trplWhataburger = new JButton("Triple Meat Whataburger");
		
		add (orderList);
		
		add(whataburger);
		add(dblWhataburger);
		add(trplWhataburger);
		
		listener orderListener = new listener();
		whataburger.addActionListener(orderListener);
		
	}
}
