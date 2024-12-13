import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        System.out.println("Choose your move (rock, paper, scissors): ");
        Scanner scanner = new Scanner(System.in);

        String playerMove = scanner.nextLine();

        System.out.println(playerMove);

    }
}