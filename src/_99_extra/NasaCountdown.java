
package _99_extra;

import java.util.Random;

import javax.swing.JOptionPane;

import game_tools.Sound;

/* NASA wants to shoot a rocket into orbit.
 * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0.
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
    public static void main(String[] args) throws InterruptedException {
        // 2. Use a pop-up to ask the user where to start counting from
   String num = JOptionPane.showInputDialog(null,"where do you want to start counting from to launch the NASA rocket?"); 
   int nummy = Integer.parseInt(num);
        // 3. Change the countdown to use the new starting point
        int countdown= nummy;
        // 1. Print a countdown from 10 to 0 on the console
           while(countdown > 0) {
        	   System.out.println(countdown);
        	   Thread.sleep(1000);
        	   countdown= countdown-1;
        	  }
            if (countdown==0) {
            	Sound.speak("blastoff!");
            } 
        		 
        	
            // 4. Use the  method to hear the countdown.
            
            // 6. Use the following code to make the program wait one second for each number: Thread.sleep(1000);
            
        // 5. when the counting is done, speak "blastoff!"
    }
}


