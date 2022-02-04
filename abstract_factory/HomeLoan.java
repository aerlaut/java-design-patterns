package abstract_factory;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class HomeLoan implements Account {
    @Override
    public void getServiceInfo() {
        System.out.println("Home Loan Interest Rate = 8.5% pa.");
    }
}
