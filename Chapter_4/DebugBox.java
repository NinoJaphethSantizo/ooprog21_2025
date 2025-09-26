public class DebugBox {
    private int width;
    private int length;
    private int height;

    // Default constructor
    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    // Parameterized constructor
    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;  // Corrected
        this.height = height;  // Corrected
    }

    // Display box data
    public void showData() {
        System.out.println("Width: " + width +
                           " Length: " + length +
                           " Height: " + height);
    }

    // Calculate volume
    public double getVolume() {
        return length * width * height;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Using default constructor
        DebugBox box1 = new DebugBox();
        box1.showData();
        System.out.println("Volume: " + box1.getVolume());

        // Using parameterized constructor
        DebugBox box2 = new DebugBox(5, 3, 2);
        box2.showData();
        System.out.println("Volume: " + box2.getVolume());
    }
}

    
