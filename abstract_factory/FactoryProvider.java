package abstract_factory;

public class FactoryProvider {

    static String[] availableServices = {"loan", "account"};

    public static AbstractAccountFactory getFactory(String choice) {
        AbstractAccountFactory af = null;

        if ("Loan".equalsIgnoreCase(choice)) {
            af = new LoanFactory();
        } else if ("Account".equalsIgnoreCase(choice)) {
            af = new AccountFactory();
        }

        return af;
    }

    public static String[] getAvailableServices() {
        return availableServices;
    }
}
