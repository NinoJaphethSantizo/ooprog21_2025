import java.util.Scanner;

// Pen interface
interface Pen {
    void setColor(String color);
    void setPoint(String point);
    String getColor();
    String getPoint();
}

// Implementation of Pen
class DebugPen implements Pen {
    private String color;
    private String point;

    // default constructor
    public DebugPen() {
        this.color = "black";
        this.point = "fine";
    }

    // parameterized constructor
    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getPoint() {
        return point;
    }
}

// Main program
public class DebugFour2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a color ink for the pen >> ");
        String color = input.nextLine().trim();

        System.out.print("Enter a point size - fine, medium, or thick >> ");
        String point = input.nextLine().trim();

        // Default pen
        DebugPen pen1 = new DebugPen();

        // User-specified pen (use correct parameter order: color, point)
        DebugPen pen2 = new DebugPen(color, point);

        System.out.println("\nDefault value pen:");
        display(pen1);

        System.out.println("\nUser value pen:");
        display(pen2);

        input.close();
    }

    // Display method accepts the Pen interface so any implementation can be used
    public static void display(Pen p) {
        System.out.println(" The pen has ink color " + p.getColor());
        System.out.println(" and a " + p.getPoint() + " point.");
    }
}
