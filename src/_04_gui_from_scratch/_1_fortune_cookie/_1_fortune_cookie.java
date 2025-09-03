package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _1_fortune_cookie implements ActionListener {
	public void showButton() { 
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		button.setText("Click me!");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		if ()
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}