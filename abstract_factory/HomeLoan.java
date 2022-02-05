package abstract_factory;

public class HomeLoan implements Account {
    @Override
    public void getServiceInfo() {
        System.out.println("Home Loan Interest Rate = 8.5% pa.");
    }
}
