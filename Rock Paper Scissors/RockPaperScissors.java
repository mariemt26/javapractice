import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        System.out.println("Choose your move (rock, paper, scissors): ");
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

    }
}