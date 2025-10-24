import java.util.Scanner;

public class SimplejavaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        double rate;
        int year = 1;
        int response;

        System.out.print("Enter initial balance >> ");
        balance = input.nextDouble();

        System.out.print("Enter interest rate (for example, 0.03 for 3%) >> ");
        rate = input.nextDouble();
        System.out.println();

        do {
            balance = balance + (balance * rate);
            System.out.printf("After year %d at %.2f  interest rate, balance is $%.4f%n",
                    year, rate, balance);
            year++;

            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("   or any other number for no >> ");
            response = input.nextInt();
            System.out.println();

        } while (response == 1);

        System.out.println("----jGRASP: Operation complete.");
        input.close();
    }
}
