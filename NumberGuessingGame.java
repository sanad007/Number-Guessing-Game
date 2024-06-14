import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        int minNumber = 1;  // Minimum number in the range
        int maxNumber = 100;  // Maximum number in the range
        int attempts = 10;  // Number of attempts allowed
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("You need to guess a number between %d and %d.%n", minNumber, maxNumber);
        System.out.printf("You have %d attempts to guess the correct number.%n", attempts);
        
        // Generate a random number between minNumber and maxNumber 
        int randomNumber = (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber);
        
        boolean hasGuessedCorrectly = false;
        
        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts--;
            
            if (guess == randomNumber) {
                hasGuessedCorrectly = true;
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            
            System.out.printf("You have %d attempts left.%n", attempts);
        }
        
        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You've guessed the correct number.");
        } else {
            System.out.println("Sorry, you've run out of attempts.");
            System.out.printf("The correct number was: %d%n", randomNumber);
        }
        scanner.close();
    }
}
