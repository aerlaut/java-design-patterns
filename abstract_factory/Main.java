package abstract_factory;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a service type (loan/account):");
        choice = scanner.nextLine();

        AbstractAccountFactory serviceFactory = FactoryProvider.getFactory(choice);
        String availableServiceTypes = serviceFactory.getAvailableServiceTypes();

        System.out.println("Choose an available type (" + availableServiceTypes + "):");

        String nextChoice = scanner.nextLine();

        Account service = serviceFactory.getAccount(nextChoice);
        service.getServiceInfo();

        scanner.close();
    }

}
