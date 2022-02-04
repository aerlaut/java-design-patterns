package abstract_factory;

public class LoanFactory extends AbstractAccountFactory {

    static String[] serviceTypes = {"home", "education"};

    @Override
    Account getAccount(String type) {

        Account account = null;

        if (type.equalsIgnoreCase("home")) {
            account = new HomeLoan();
        } else if (type.equalsIgnoreCase("education")) {
            account = new EducationLoan();
        }

        return account;
    }

    @Override
    String getAvailableServiceTypes() {
        return String.join("/", serviceTypes);
    }
}
