package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("what is the passcode?");
	
	// 1. Set a password in a String variable
		if (input.equals("passcode")) {
			  JOptionPane.showMessageDialog(null, "This is very important seceret message...");
		}			  
			  else {
					JOptionPane.showMessageDialog(null, "INTRUDER!!");
					
				}

	// 5. If the password does not match, pop-up "INTRUDER!!"
		
}}

	
		
	
