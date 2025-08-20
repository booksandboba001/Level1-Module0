package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String KiaAnd3 = "https://preview.redd.it/we-need-more-cap-art-v0-sznpi8l2s5z91.jpg?width=1236&format=pjpg&auto=webp&s=b2f44c93696954d4d7a4f5b8961b4a17c33afd92";
		Component image = createImage(KiaAnd3);
		quizWindow.add(image);
		quizWindow.pack();
		String question = JOptionPane.showInputDialog("What are these characters' names?");
		if (question.equalsIgnoreCase("Captain 3 and Agent 3")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		quizWindow.remove(image);
		String Shiver = "https://i.pinimg.com/736x/eb/ef/8a/ebef8a2985116ab284a353b0175da603.jpg";
		Component picture = createImage(Shiver);
		quizWindow.add(picture);
		quizWindow.pack();
		quizWindow.setVisible(true);
		String ask = JOptionPane.showInputDialog("What group does this idol belong to?");
		if (ask.equalsIgnoreCase("Deep Cut")) {
			JOptionPane.showMessageDialog(null,"CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )

		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
