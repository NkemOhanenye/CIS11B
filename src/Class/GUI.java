package Class;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI extends JFrame implements ActionListener{
	private JButton button;
	private JPanel panel;
	private int inc = 0;
	GUI(){
		button = new JButton("Red");
		panel = new JPanel();
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		inc++;
		if(e.getSource() == button){
			inc++;	
			if(inc == 1){
				button.setText("Blue");
				panel.setBackground(Color.red);
			}
			if (inc == 2){
				button.setText("Green");
				panel.setBackground(Color.blue);
			}
		}
		
		
	}
	public static void main(String args[]){
		new GUI();
	}
}
