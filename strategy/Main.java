package strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String strategy;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Which one do you want? (car/bus/train)");
            strategy = scanner.nextLine();

            BookingStrategy chosenStrategy = null;

            Customer cust = new Customer();

            switch (strategy) {
                case "car":
                    chosenStrategy = new CarBookingStrategy();
                    break;
                case "bus":
                    chosenStrategy = new BusBookingStrategy();
                    break;
                case "train":
                    chosenStrategy = new TrainBookingStrategy();
                    break;
                default:
                    scanner.close();
                    System.exit(0);
            }

            cust.setBookingStrategy(chosenStrategy);

            double fare = cust.calculateFare(5);
            System.out.println(fare);
        }

    }

}
