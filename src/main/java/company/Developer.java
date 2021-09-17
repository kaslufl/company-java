package company;

public class Developer extends Person{
    public Developer(String name, Department department) {
        super(name, department);
        department.addDeveloper(this);
    }
}
