import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principalNumber = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualRate = scanner.nextDouble();
        double monthlyRate = (annualRate / 100) / 12;

        System.out.print("Period (years): ");
        int years = scanner.nextInt();

        int numPayments = years * 12;

        double monthlyPayment = principalNumber * (monthlyRate * Math.pow(monthlyRate + 1, numPayments))
                / (Math.pow(1 + monthlyRate, numPayments) - 1);

        System.out.printf("Mortgage: $%.2f\n", monthlyPayment);

        scanner.close();
    }
}
