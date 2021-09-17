package company;

public class Person {
    private String name;
    private Department department;

    public Person(String name, Department department) {
        setDepartment(department);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name == null)|| (name.trim().equals(""))) {
            throw new NullPointerException("A name needs to be given.");
        }
        this.name = name;
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
}
