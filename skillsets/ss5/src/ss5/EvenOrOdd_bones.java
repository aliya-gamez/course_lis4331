package ss5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EvenOrOdd_bones {
	// panel > frame > BorderFactory > GridLayout > BorderLayoutCENTER > JFrameClose > pack > setVisible > setTitle
	
	private JPanel panel;
	private JFrame frame;
	
	public EvenOrOdd_bones() {
		//PANEL (Layout)
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 200, 100, 200));
		panel.setLayout(new GridLayout(3, 0));
		
		//FRAME (Window)
		frame = new JFrame();
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Even or Odd");
	}
	
	public static void main(String[] args) {
		new EvenOrOdd_bones();
	}

}
