package strategy;

public class TrainBookingStrategy implements BookingStrategy {

    private static double fare = 8;

    @Override
    public double getFare() {
        return TrainBookingStrategy.fare;
    }

    @Override
    public String toString() {
        return "TrainBookingStrategy";
    }
}
