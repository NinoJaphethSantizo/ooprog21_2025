public class DebugCircle {
    private int radius;
    private int diameter;
    private static final double PI = 3.14159;
    private double area;

    
    public DebugCircle(int r) {
        if (r < 0) {
            throw new IllegalArgumentException("Radius cannot be negative: " + r);
        }
        this.radius = r;
        this.diameter = 2 * r;
        this.area = PI * r * r;
    }

        public int getRadius() {
        return this.radius;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public double getArea() {
        return this.area;
    }

    
    public void setRadius(int r) {
        if (r < 0) {
            throw new IllegalArgumentException("Radius cannot be negative: " + r);
        }
        this.radius = r;
        this.diameter = 2 * r;
        this.area = PI * r * r;
    }

    @Override
    public String toString() {
        return String.format("DebugCircle(radius=%d, diameter=%d, area=%.5f)",
                             radius, diameter, area);
    }

    
    public static void main(String[] args) {
        DebugCircle c = new DebugCircle(5);
        System.out.println(c);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Diameter: " + c.getDiameter());
        System.out.println("Area: " + c.getArea());
    }
}