package company;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Project> projects;
    private String description;
    private Manager manager;

    public Department(String description) {
        setDescription(description);
        this.projects = new ArrayList<Project>();
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

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void removeProject(Project project) {
        this.projects.remove(project);
    }

    public List<String> getProjectsDescriptions() {
        List<String> descriptions = new ArrayList<String>();
        for (Project project : this.projects) {
            descriptions.add(project.getDescription());
        }
        return descriptions;
    }
}
