import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double balance;     // bank balance
        double rate = 0.03; // fixed interest rate (3%)
        int year = 0;       // year counter
        int response;       // user’s response to continue or stop

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        System.out.println("Do you want to see next year's balance?");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        response = input.nextInt();

        while (response == 1) {
            year++;
            balance = balance + balance * rate;

            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", 
                               year, rate, balance);

            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            response = input.nextInt();
        }

        System.out.println();
        System.out.println("-----jGRASP: Operation complete.");
        input.close();
    }
}
