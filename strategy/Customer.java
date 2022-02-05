package strategy;

public class Customer {

    private BookingStrategy bookingStrategy;

    public double calculateFare(int numOfPassengers) {
        double fare = numOfPassengers * getBookingStrategy().getFare();
        System.out.println("Calculating fares using " + getBookingStrategy());
        return fare;
    }

    public BookingStrategy getBookingStrategy() {
        return bookingStrategy;
    }

    public void setBookingStrategy(BookingStrategy bookingStrategy) {
        this.bookingStrategy = bookingStrategy;
    }

}
