package fun_stuff;

import javax.swing.JOptionPane;

public class More_fun {



public static void main(String[] args) {
	
	int bad = 0;
	int good = 0;
	JOptionPane.showMessageDialog(null, "hi! this test will determine if you are a good person or a bad person through a series of questions. there is no right or wrong answer, so feel free to pick what suits you best! P.S: this test is best for kids." );
	
	String one = JOptionPane.showInputDialog(null, "what activity do you mostly do after school? put the number of the answer that you picked in the text box.\n" + 
	"1: I like to help my parents with work around the house and keep my siblings busy and I do my homework or do after-school classes. 2: I play video games and eat junk food. I invite my friends over for playdates often.");
	if (one.equals(2)) {
		bad = 1;
	}
	if (one.equals(1)) {
		good = 1;
	}
	
	String two = JOptionPane.showInputDialog(null, "what do you do when someone's mean to you? put the number of the answer that you picked in the text box.\n" + 
			"1: go into rage mode and seriously hurt them. 2: walk away and ignore them.");
			if (one.equals(2)) {
				good = 2;
			}
			if (one.equals(1)) {
				bad = 2;
			}
	
			String three = JOptionPane.showInputDialog(null, "who do you usually make friends with? put the number of the answer that you picked in the text box.\n" + 
					"1: kids who are popular and can be rude, and you are only friends with them to gain popularity. 2: kids who are not included much-- you do have some popular friends, but don't do the sometimes mean things that they do.");
					if (one.equals(2)) {
						good = 3;
					}
					if (one.equals(1)) {
						bad = 3;
					}

					String four = JOptionPane.showInputDialog(null, "if the teacher is not around and your friends dare you to play games on your iPad when you are not supposed to, what do you do? put the number of the answer that you picked in the text box.\n" + 
							"1: not listen to them and tell them to stop the dare. 2: accept the dare and play Roblox with your friends.");
							if (one.equals(2)) {
								bad = 4;
							}
							if (one.equals(1)) {
								good = 4;
							}

							String five = JOptionPane.showInputDialog(null, "if your mom tells you to babysit your siblings and leaves you with them alone, what do you do? put the number of the answer that you picked in the text box.\n" + 
									"1: abandon the siblings and go upstairs to play Minecraft. 2: play fun games with them and never let them out of your sight.");
									if (one.equals(2)) {
										good = 5;
									}
									if (one.equals(1)) {
										bad = 5;
									}

JOptionPane.showMessageDialog(null, "great! thanks for taking this test! here are the results!");
 
if (good>=bad) {
	JOptionPane.showMessageDialog(null, "you are kind and responsible! you are a GOOD PERSON!!!!");
}
if (bad>=good) {
	JOptionPane.showMessageDialog(null,"hmm! you are untrustworthy and irresponsible! you are a BAD PERSON!");
}
	JOptionPane.showMessageDialog(null,"well, hope you are pleased with the results! goodbye now!");

}
}


