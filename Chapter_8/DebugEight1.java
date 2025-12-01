

import java.util.*;

public class DebugEight1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char userCode;
        String entry;
        boolean found = false;
        char[] okayCodes = {'A', 'C', 'T', 'H'};

        System.out.println("Enter shipping code for this delivery.");
        System.out.print("Valid codes are: ");

        // Display all valid codes
        for (int x = 0; x < okayCodes.length; ++x) {
            System.out.print(okayCodes[x]);
            if (x != okayCodes.length - 1)
                System.out.print(", ");
        }

        System.out.print(" >> ");
        entry = input.nextLine();

        // Get first character of input
        userCode = entry.charAt(0);

        // Check if code is valid
        for (int i = 0; i < okayCodes.length; ++i) {
            if (userCode == okayCodes[i]) {
                found = true;
                break;
            }
        }

        // Output result
        if (found)
            System.out.println("Good code");
        else
            System.out.println("Sorry code not found");
    }
}

