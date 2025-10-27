import java.util.Scanner;

public class CodingBankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance;

        // Ask user for initial bank balance
        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();
        System.out.println();

        // Outer loop for interest rates (from 0.02 to 0.05)
        for (double rate = 0.02; rate <= 0.05; rate += 0.01) {
            double currentBalance = balance;

            System.out.printf("With an initial balance of $%.1f at an interest rate of %.2f%n", balance, rate);

            // Inner loop for years (1 to 4)
            for (int year = 1; year <= 4; year++) {
                currentBalance += currentBalance * rate;
                System.out.printf("After year %d balance is $%.4f%n", year, currentBalance);
            }

            System.out.println();
        }

        input.close();
    }
}
