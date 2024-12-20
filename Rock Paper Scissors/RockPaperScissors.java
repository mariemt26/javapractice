import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        System.out.print("Choose your move (rock, paper, scissors): ");
        Scanner scanner = new Scanner(System.in);

        String playerMove = scanner.nextLine();

        Random random = new Random();

        int randNum = random.nextInt(3);

        String compMove;
        if (randNum == 0) {
            compMove = "rock";
        } else if (randNum == 1) {
            compMove = "paper";
        } else {
            compMove = "scissors";
        }

        System.out.println("Computer has chosen: " + compMove);

        if (!playerWins(playerMove, compMove)) {
            System.out.println("The computer wins! Better luck next time, loser.");
        } else if (playerMove.equals(compMove)) {
            System.out.println("It's a draw! Try again.");
        } else {
            System.out.println("You win! Congratulations, machinery stood no chance against you.");
        }

    }

    public static boolean playerWins(String playerMove, String compMove) {
        if (playerMove.equals("rock")) {
            return compMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return compMove.equals("rock");
        } else {
            return compMove.equals("paper");
        }

    }
}