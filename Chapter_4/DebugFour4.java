import java.util.Scanner;

// Simple DebugTrip class (combined in one file)
class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    // 1-argument constructor (destination only)
    public DebugTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    // 2-argument constructor (destination + departure)
    public DebugTrip(String destination, String departure) {
        this(destination, departure, DEFAULT_MODE);
    }

    // 3-argument constructor (destination + departure + mode)
    public DebugTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departure;
    }

    public String getMode() {
        return mode;
    }
}

// Main program
public class DebugFour4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter destination city >> ");
        String destinationCity = input.nextLine().trim();

        System.out.print("Enter departure city >> ");
        String departureCity = input.nextLine().trim();

        System.out.print("Enter mode of transportation >> ");
        String mode = input.nextLine().trim();

        // Three trips using different constructors
        DebugTrip trip1 = new DebugTrip(destinationCity); // uses default departure & mode
        DebugTrip trip2 = new DebugTrip(destinationCity, departureCity); // default mode
        DebugTrip trip3 = new DebugTrip(destinationCity, departureCity, mode); // all provided

        System.out.println();
        display(trip1);
        System.out.println();
        display(trip2);
        System.out.println();
        display(trip3);

        input.close();
    }

    public static void display(DebugTrip trip) {
        System.out.println("Going to " + trip.getDestination());
        System.out.println(" Leaving from " + trip.getDepartureCity());
        System.out.println(" Going by " + trip.getMode());
    }
}
