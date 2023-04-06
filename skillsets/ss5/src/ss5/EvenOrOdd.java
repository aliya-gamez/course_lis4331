package ss5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EvenOrOdd {
	// panel > frame > BorderFactory > GridLayout > BorderLayoutCENTER > JFrameClose > pack > setVisible > setTitle
	
	private JPanel panel;
	private JFrame frame;
	private JLabel label;
	private JTextField field;
	private JButton button;
	public String num = "0";
	
	public EvenOrOdd() {
		//PANEL CONTENTS
		label = new JLabel("Enter:");
		field = new JTextField(num);
		button = new JButton("Evaluate");
		
		//PANEL (Layout)
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(35, 50, 35, 50));
		panel.setLayout(new GridLayout(0, 3, 30, 0));
		panel.add(label);
		panel.add(field);
		panel.add(button);
		
		//FRAME (Window)
		frame = new JFrame();
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Even or Odd");
	}
	
	public static void main(String[] args) {
		new EvenOrOdd();
	}

}
