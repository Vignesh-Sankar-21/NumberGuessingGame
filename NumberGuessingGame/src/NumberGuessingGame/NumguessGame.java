
package NumberGuessingGame;
import java.util.Scanner;

import java.util.Random;


public class NumguessGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String play ="yes";
		while(play.equals("yes")) {
			Random ran = new Random();
			int rand = ran.nextInt(100);
			int guess = -3;
			int tries = 0;
			
		    while(guess!=rand) {

		    	System.out.println("get ready for thr game");
		    	System.out.println("guess the number between 1 and 100");
		    	guess = input.nextInt();
		    	tries++;
		   if(guess==rand) {
			   System.out.println("wow!!! you guessed the number");
		    	System.out.println("you won the game and you took only" +  tries + "tries");
		    	System.out.println("you want to play again? enter yes or no ");
		    	play = input.next().toLowerCase();
			     }
		   else if(guess > rand) {
			   System.out.println("you guess is high,please try again");
		   }
			   
		   else {
			   System.out.println("you guess is low,please try again");
		   }
			   
		    	
		   
		    	
		    }
		}
	}

}
