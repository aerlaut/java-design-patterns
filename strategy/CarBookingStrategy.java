package strategy;

public class CarBookingStrategy implements BookingStrategy {

    private static double fare = 10;

    @Override
    public double getFare() {
        return CarBookingStrategy.fare;
    }

    @Override
    public String toString() {
        return "CarBookingStrategy";
    }
}
