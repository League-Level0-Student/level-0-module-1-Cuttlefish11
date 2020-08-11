package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		
String input = JOptionPane.showInputDialog("what is more dangerous to steel than stone"); 
		if (input.equals("lava")) {
		score += 1;	 
		JOptionPane.showMessageDialog(null, "correct!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		JOptionPane.showMessageDialog(null, "your score is " + score);
		}
	else{
		JOptionPane.showMessageDialog(null, "wrong, the awnser is lava!");
		JOptionPane.showMessageDialog(null, "your score is " + score);	
			}
		String input2 = JOptionPane.showInputDialog("what is are the animals that create sweet goo that bears love"); 
		if (input2.equals("honeybees")) {
		score += 1;	 
		JOptionPane.showMessageDialog(null, "correct!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		JOptionPane.showMessageDialog(null, "your score is " + score);
		}
	else{
		JOptionPane.showMessageDialog(null, "wrong, the awnser is honeybees!");
		JOptionPane.showMessageDialog(null, "your score is " + score);	
			}		
		String input3 = JOptionPane.showInputDialog("what is the bird that that swims noy flies"); 
		if (input3.equals("peinguins")) {
		score += 1;	 
		JOptionPane.showMessageDialog(null, "correct!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		JOptionPane.showMessageDialog(null, "your score is " + score);
		}
	else{
		JOptionPane.showMessageDialog(null, "wrong, the awnser is peinguins!");
		JOptionPane.showMessageDialog(null, "your score is " + score);	
			}	 
}
}
