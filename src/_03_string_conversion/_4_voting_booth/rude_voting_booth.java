package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class rude_voting_booth {
	public static void main(String[] args) {

String age = JOptionPane.showInputDialog(null, "welcome to the super rude voting booth! how old are you?");

int ageagain = Integer.parseInt(age);

if (ageagain >= 18) {
	JOptionPane.showInputDialog(null, "Good! who should the next president be?");
	JOptionPane.showMessageDialog(null, "Thank you for giving your opinion. we will put your vote into account.");
}
if (ageagain < 18) {
	JOptionPane.showMessageDialog(null, "NO ONE CARES ABOUT YOU! GET OUTTA HERE! WE NEVER WANNA SEE YOUR FACE AGAIN!");
	}















	}
}
