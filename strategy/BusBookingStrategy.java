package strategy;

public class BusBookingStrategy implements BookingStrategy {

    private static double fare = 5.0;

    @Override
    public double getFare() {
        return BusBookingStrategy.fare;
    }

    @Override
    public String toString() {
        return "BusBookingStrategy";
    }
}
