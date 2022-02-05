package composite;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Developer 1");
        Developer dev2 = new Developer("Developer 2");
        Developer dev3 = new Developer("Developer 3");
        Developer dev4 = new Developer("Developer 4");

        StaffManager manager1 = new StaffManager("Manager 1");
        StaffManager manager2 = new StaffManager("Manager 2");

        GeneralManager genManager = new GeneralManager("General Manager");

        genManager.addReportee(manager1);
        genManager.addReportee(manager2);

        genManager.addReportee(dev3);

        manager1.addReportee(dev1);
        manager1.addReportee(dev4);

        manager2.addReportee(dev2);

        genManager.print();

    }
}
