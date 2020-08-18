package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.
	String input = JOptionPane.showInputDialog(" Write a name of someone remarkable?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if (input.equals("Bob")) {
		  JOptionPane.showMessageDialog(null, input + " is remarkable for reasons");
	}	
	else if (input.equals("Shorty")) {
		  JOptionPane.showMessageDialog(null, input + " is remarkable for their tallness");
	}	
	else if (input.equals("Albert")) {
		  JOptionPane.showMessageDialog(null, input + " is remarkable for obvious reason");
	}

	  else {
			JOptionPane.showMessageDialog(null, input + " isn't remarkable.");
			
		}




}
}

