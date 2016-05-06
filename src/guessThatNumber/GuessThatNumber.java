package guessThatNumber;
import java.util.*;
public class GuessThatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Random rando = new Random ();
		int randomNum = rando.nextInt(100);
		boolean win = false;
		int tryCount=0;
		int guess;
		
		
		System.out.println("Welcome to the NUMBER GUESSING GAME!");
		System.out.println("You must guess what number between 1 and 100 has been randomly selected by the computer.\n");
	
		while (win==false){
			
			System.out.println("Enter a number (1-100):");
			guess=scan.nextInt();
			tryCount++;
				
		if (guess == randomNum){
			win=true;
			System.out.println("YEAH!!! You guessed the right number!!!");
			System.out.println("The number was "+randomNum+"!");
			System.out.println("It only took you "+tryCount+" tries to guess the right number!");
		}
		else if (guess < randomNum){
			System.out.println("Your guess was to low! Please enter a higher number!");
		}
		else if (guess > randomNum){
			System.out.println("Your guess was to high! Please enter a lower number!");
		}

	}
		
}
}
