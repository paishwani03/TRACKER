import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rm = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int minRange = 1;
            int maxRange = 100;
            int generatedNum = rm.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            int maxAttempts = 5; // Limiting the number of attempts

            System.out.println("Welcome to Guess The Number game!");
            System.out.println("I've picked a number between 1 and 100. Can you guess it?");
            System.out.println("");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = kb.nextInt();
                attempts++;

                if (guess == generatedNum) {
                    System.out.println("Congratulations! You guessed the number " + generatedNum + " correctly in " + attempts + " attempts.");
                    break;
                } else if (guess < generatedNum) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've used all your attempts.");
                System.out.println("The correct number was: " + generatedNum);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = kb.next();
            playAgain = playAgainChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing!");
        kb.close();
    }
}
