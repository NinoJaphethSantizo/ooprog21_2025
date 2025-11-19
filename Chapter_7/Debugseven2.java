import java.util.*;

class DebugSeven2 {
    public static void main(String[] args) {
        String str;
        int x;
        int length;
        int num;
        int lastSpace = -1;
        int sum = 0;
        String partStr;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");
        str = in.nextLine().trim();   // Trim leading/trailing spaces

        length = str.length();

        for (x = 0; x < length; ++x) {
            if (str.charAt(x) == ' ') {

                // Skip multiple spaces
                if (x == lastSpace + 1) {
                    lastSpace = x;
                    continue;
                }

                partStr = str.substring(lastSpace + 1, x);
                num = Integer.parseInt(partStr);
                System.out.println("                " + num);
                sum += num;
                lastSpace = x;
            }
        }

        // Handle last number
        partStr = str.substring(lastSpace + 1, length);
        num = Integer.parseInt(partStr);
        System.out.println("                " + num);
        sum += num;

        System.out.println("         -------------------");
        System.out.println("The sum of the integers is " + sum);
    }
}
