package company;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private List<Department> departments;

    public Branch() {
        this.departments = new ArrayList<Department>();
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void removeDepartment(Department department) {
        this.departments.remove(department);
    }

    public List<String> getDepartmentsDescriptions() {
        List<String> descriptions = new ArrayList<String>();
        for (Department department : this.departments) {
            descriptions.add(department.getDescription());
        }
        return descriptions;
    }
}
