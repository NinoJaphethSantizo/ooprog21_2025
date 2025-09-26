public class DebugPen {
    private String color;
    private String point;

    // Default constructor
    public DebugPen() {
        color = "black";
        point = "fine";
    }

    // Parameterized constructor
    public DebugPen(String color, String point) {
        this.color = color;  // FIXED
        this.point = point;  // FIXED
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for point
    public String getPoint() {
        return point;
    }

    // Show pen details
    public void showData() {
        System.out.println("Color: " + color + ", Point: " + point);
    }

    // Main method to test
    public static void main(String[] args) {
        DebugPen pen1 = new DebugPen();  // Default
        pen1.showData();

        DebugPen pen2 = new DebugPen("blue", "medium"); // Custom
        pen2.showData();
    }
}
