package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _1_fortune_cookie implements ActionListener {
	public void showButton() { 
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		button.setText("Click me!");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand==1) {
			JOptionPane.showMessageDialog(null,"You will find your day takes an unexpected turn");
		}
		if (rand==2) {
			JOptionPane.showMessageDialog(null,"You will meet an old friend where you least expect it");
		}
		if (rand==3) {
			JOptionPane.showMessageDialog(null,"You will find your luck boosted");
		}
		if (rand==4) {
			JOptionPane.showMessageDialog(null,"You are going to get a treat");
		}
		if (rand==5) {
			JOptionPane.showMessageDialog(null,"You have good tides before you");
		}
		
	}
}