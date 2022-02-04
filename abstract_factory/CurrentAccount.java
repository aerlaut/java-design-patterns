package abstract_factory;

public class CurrentAccount implements Account {
    @Override
    public void getServiceInfo() {
        System.out.println("Savings Account Interest Rate = 5.0% pa");
    }
}
