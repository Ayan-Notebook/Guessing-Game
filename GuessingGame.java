import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            int randomNumber = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            
            System.out.println("Welcome to the Guessing Game!");
            System.out.println("I have generated a random number between 1 and 100. Can you guess it?");
            
            while (guess != randomNumber) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;
                
                if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("It took you " + attempts + " attempts.");
                }
            }
        }
    }
}