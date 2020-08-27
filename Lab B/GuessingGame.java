import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Guesstron 4000EX+!!!!!");
        int secret = (new Random()).nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (inclusive).");
        System.out.println("Try to guess it, and I'll say higher or lower."); 
        int numGuesses = 0;
        int guess = -1;
        while (guess != secret) {
            System.out.print("Enter a number: ");
            guess = sc.nextInt();
            numGuesses++;
            if (guess < secret)
                System.out.println("Higher!");
            else if (guess > secret)
                System.out.println("Lower!");
            else
                System.out.println("You got it!");
        }
        System.out.println("It took you " + numGuesses + " guesses.");
    }
    
    
}