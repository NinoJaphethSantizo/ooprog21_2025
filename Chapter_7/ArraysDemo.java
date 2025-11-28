import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int array[] = {0, 0, 0, 0, 0};

        display("Original array:", array);

        // Fill with 8s
        Arrays.fill(array, 8);
        display("After filling with 8s:", array);

        // Change two values
        array[2] = 6;
        array[4] = 3;
        display("After changing two values:", array);

        // Sort the array
        Arrays.sort(array);
        display("After sorting:", array);
    }

    public static void display(String message, int array[]) {
        System.out.print(message + "    ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
