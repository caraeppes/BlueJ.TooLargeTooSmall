
/**
 * Generates a random number between 1 and 10.
 * Asks the user to guess the number.
 * Provides user with feedback on guesses.
 *
 * @author Cara Eppes
 * @version 2/5/19
 */

import java.util.Scanner;
import java.util.Random;

public class Main
{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        boolean guessed = false;
        int guesses = 0;
        
        System.out.println("Guess a number between 1 and 10.");
        while (guessed == false){
            
            int guess = scanner.nextInt();
            
            if (guess > num){
                System.out.println("Too high! Guess again.");
                guesses++;
            }
            
            else if (guess < num){
                System.out.println("Too low! Guess again.");
                guesses++;
            }
            
            else {
                System.out.println("You guessed it!");
                guesses++;
                System.out.println("It took you " + guesses + " guesses!");
                guessed = true;
            }
        }
                
    }
}
