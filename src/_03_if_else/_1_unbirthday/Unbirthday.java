package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;
public class Unbirthday{
public static void main(String[] args) {
	

	String input = JOptionPane.showInputDialog(" what is your birthday? (mm/dd), e.g. 06/09");

if (input.equals("Aug, 17")) {
	  JOptionPane.showMessageDialog(null, "Happy Birthday");	
}

else {
	JOptionPane.showMessageDialog(null, "Happy Unbirthday");
	
}






}
}
