package company;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private List<Department> departments;
    private List<Employee> employees;

    public Branch() {
        this.departments = new ArrayList<Department>();
        this.employees = new ArrayList<Employee>();
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public List<String> getEmployeesNames() {
        List<String> names = new ArrayList<String>();
        for (Employee employee : this.employees) {
            names.add(employee.getName());
        }
        return names;
    }
}
