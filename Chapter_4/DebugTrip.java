public class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    // 1-argument constructor: destination only
    public DebugTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    // 2-argument constructor: destination + departure
    public DebugTrip(String destination, String departure) {
        this(destination, departure, DEFAULT_MODE); // chain to 3-arg with default mode
    }

    // 3-argument constructor: destination + departure + mode
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

    public void showData() {
        System.out.println("Trip from " + departure + " to " + destination + " by " + mode);
    }

    // test main
    public static void main(String[] args) {
        DebugTrip trip1 = new DebugTrip("New York");                     // only destination
        DebugTrip trip2 = new DebugTrip("Los Angeles", "Miami");         // destination + departure
        DebugTrip trip3 = new DebugTrip("Chicago", "Dallas", "train");   // destination + departure + mode

        trip1.showData();
        trip2.showData();
        trip3.showData();
    }
}
