package company;

public class Employee {
    private String name;

    public Employee(String name) {
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
}
