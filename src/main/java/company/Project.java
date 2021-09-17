package company;

public class Project {
    private String description;

    public Project(String description) {
        setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if ((description == null)|| (description.trim().equals(""))) {
            throw new NullPointerException("A description needs to be given.");
        }
        this.description = description;
    }
}
