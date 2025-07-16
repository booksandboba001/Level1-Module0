package _01_methods._1_houses;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		Robot rob = new Robot();
		Random rand = new Random();
		rob.setX(100);
		rob.setY(500);
		rob.setSpeed(100);
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(100);
		rob.turn(-90);
		rob.setPenColor(0,255,0);
		rob.move(10);
		rob.turn(-90);
		int num = rand.nextInt(400);
		rob.setPenColor(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
		for (int i =9; i>0; i--) {
			num = rand.nextInt(400);
			rob.move(num);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(num);
			rob.turn(-90);
			rob.setPenColor(0,255,0);
			rob.move(10);
			rob.turn(-90);
			rob.setPenColor(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
		}
		// Check the recipe to find out what code to put here
	}
}
