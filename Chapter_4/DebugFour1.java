import java.util.Scanner;

// Circle interface
interface Circle {
    void setRad(int r);
    int getRad();
    int getDiam();
    double getArea();
}

// Implementation of Circle
class DebugCircle implements Circle {
    private int radius;
    private static final double PI = 3.14159;

    // default constructor
    public DebugCircle() {
        this.radius = 1;
    }

    // constructor that accepts a radius
    public DebugCircle(int r) {
        this.radius = r;
    }

    @Override
    public void setRad(int r) {
        this.radius = r;
    }

    @Override
    public int getRad() {
        return radius;
    }

    @Override
    public int getDiam() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}

// Main program
public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius for a circle >> ");
        int radius = input.nextInt();

        Circle c = new DebugCircle(radius);

        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());

        input.close();
    }
}
