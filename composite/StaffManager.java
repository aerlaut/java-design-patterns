package composite;

import java.util.ArrayList;
import java.util.List;

public class StaffManager implements Employee, Manager {

    private String name;
    List<Employee> reportees = new ArrayList<>();

    public StaffManager(String name) {
        this.name = name;
    }

    @Override
    public void addReportee(Employee e) {
        reportees.add(e);
    }

    @Override
    public void remove(Employee e) {
        reportees.remove(e);
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println("Reportees...");
        for (Employee e : reportees) {
            e.print();
        }
    }

}
