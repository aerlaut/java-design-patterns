package abstract_factory;

public class SavingsAccount implements Account {
    @Override
    public void getServiceInfo() {
        System.out.println("Savings Account Interest Rate = 4.0% pa");
    }
}
