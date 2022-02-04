package abstract_factory;

public class EducationLoan implements Account {
    @Override
    public void getServiceInfo() {
        System.out.println("Education loan interest rate = 11.5% pa.");
    }
}
