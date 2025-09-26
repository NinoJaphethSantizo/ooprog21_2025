import java.util.Scanner;

// Simple DebugBox class (combined in one file)
class DebugBox {
    private int width;
    private int length;
    private int height;

    // Default constructor
    public DebugBox() {
        this.width = 1;
        this.length = 1;
        this.height = 1;
    }

    // Parameterized constructor
    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    // Display box dimensions
    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    // Calculate volume
    public double getVolume() {
        return (double) width * length * height;
    }
}

// Main program
public class DebugFour3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read integer dimensions from user
        System.out.print("Enter width of box >> ");
        int w = input.nextInt();

        System.out.print("Enter length of box >> ");
        int l = input.nextInt();

        System.out.print("Enter height of box >> ");
        int h = input.nextInt();

        // First box: default values
        DebugBox box1 = new DebugBox();

        // Second box: user-supplied dimensions
        DebugBox box2 = new DebugBox(w, l, h);

        System.out.println("\nThe dimensions of the first box are:");
        box1.showData();
        System.out.print("The volume of the first box is ");
        showVolume(box1);

        System.out.println("\nThe dimensions of the second box are:");
        box2.showData();
        System.out.print("The volume of the second box is ");
        showVolume(box2);

        input.close();
    }

    // Helper to print volume
    public static void showVolume(DebugBox aBox) {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }
}

