package pos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
	
	private listener buttonListener;
	
	/* Startup Screen */
	private JButton startPOS;
	private JButton shutdown;
	
	/* Order Screen */
	public JTextField orderList;
	
	public JButton whataburger;
	public JButton dblWhataburger;
	public JButton trplWhataburger;
	
	public Window() {
		super("Whataburger POS");
		setLayout(new FlowLayout());
		startPOS = new JButton("Start POS");
		add(startPOS);
		
		shutdown = new JButton("Shutdown");
		add(shutdown);
		
		listener buttonListener = new listener();
		startPOS.addActionListener(buttonListener);
		
		JTextField orderList = new JTextField("test");
		
		JButton whataburger = new JButton("Whataburger");
		JButton dblWhataburger = new JButton("Double Meat Whataburger");
		JButton trplWhataburger = new JButton("Triple Meat Whataburger");
		
		add(whataburger);
		
		whataburger.addActionListener(buttonListener);
	}
	
	public class listener<Jbutton> implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			if((JButton)event.getSource() == startPOS || (JButton)event.getSource() == whataburger) {
				remove(shutdown);
				revalidate();
				repaint();
				JTextField orderList = new JTextField("test");
				
				JButton whataburger = new JButton("Whataburger");
				JButton dblWhataburger = new JButton("Double Meat Whataburger");
				JButton trplWhataburger = new JButton("Triple Meat Whataburger");
				
				add (orderList);
				
				add(whataburger);
				add(dblWhataburger);
				add(trplWhataburger);
			}
			
			if(event.getSource() == shutdown) {
				orderList.setText(whataburger.getText());
				System.out.println(whataburger.getText());
			}
			
		}
	}
		
	public void loadOrderScreen() {
		
		
	}
}
