import java.util.Scanner;

public class Fizzbuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");

        int userNum = scanner.nextInt();

        if (userNum % 5 == 0) {
            System.out.println("Fizz");
        }

        else if (userNum % 3 == 0) {
            System.out.println("Buzz");
        }

        else if (userNum % 5 == 0 && userNum % 3 == 0) {
            System.out.println("Fizzbuzz");
        }

        else {
            System.out.println(userNum);
        }

        scanner.close();

    }

}
