package pos;

import javax.swing.*;
import java.awt.FlowLayout;

public class Window extends JFrame {
	private JButton startPOS;
	
	public Window() {
		super("Whataburger POS");
		setLayout(new FlowLayout());
		startPOS = new JButton("Start POS");
		add(startPOS);
	}
}
