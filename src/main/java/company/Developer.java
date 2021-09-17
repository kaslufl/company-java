package company;

public class Developer extends Employee{
    private Department department;

    public Developer(String name, Department department) {
        super(name);
        setDepartment(department);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (department == null) {
            throw new NullPointerException("A department needs to be given.");
        }
        this.department = department;
    }

    public String getDepartmentDescription() {
        return department.getDescription();
    }
}
