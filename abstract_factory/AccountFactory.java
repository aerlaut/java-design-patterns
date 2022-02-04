package abstract_factory;

public class AccountFactory extends AbstractAccountFactory {

    String[] serviceTypes = {"savings", "current"};

    @Override
    Account getAccount(String type) {
        Account account = null;

        if (type.equalsIgnoreCase("savings")) {
            account = new SavingsAccount();
        } else if (type.equalsIgnoreCase("current")) {
            account = new CurrentAccount();
        }

        return account;
    }

    @Override
    String getAvailableServiceTypes() {
        return String.join("/", serviceTypes);
    }
}
