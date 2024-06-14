import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomnumber;
    private int noOfguesses;

    // Constructor to generate the random number
    public Game() {
        Random rand = new Random();
        randomnumber = rand.nextInt(100) + 1;
        noOfguesses = 0;
    }

    // Method to take user input
    public int userinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let us play the GUESS THE NUMBER GAME. ALL THE BEST!");
        System.out.print("Guess the number: ");
        int userguess = sc.nextInt();
        noOfguesses++;
        return userguess;
    }

    // Check if the user guess is correct or not
    public boolean iscorrectno(int userguess) {
        if (userguess == randomnumber) {
            System.out.println("Congratulations! You guessed the right number.");
            return true;
        } else if (userguess < randomnumber) {
            System.out.println("The number is greater than " + userguess);
        } else {
            System.out.println("The number is lesser than " + userguess);
        }
        return false;
    }

    public int getnoOfguesses() {
        return noOfguesses;
    }

    public void setnoOfguesses(int noOfguesses) {
        this.noOfguesses = noOfguesses;
    }
}

class GuessTheNumberGame {
    public static void main(String[] args) {
        Game game = new Game();
        boolean hasGuessedCorrectly = false;
        while (!hasGuessedCorrectly) {
            int userguess = game.userinput();
            hasGuessedCorrectly = game.iscorrectno(userguess);
        }
        System.out.println("You guessed the number in " + game.getnoOfguesses() + " tries.");
    }
}
