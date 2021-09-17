package company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.easymock.EasyMock.*;

class DepartmentTest {
    @Test
    void shouldThrowExceptionDescriptionNull(){
        try{
            Department department = new Department(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("A description needs to be given.", e.getMessage());
        }
    }

    @Test
    void shouldThrowExceptionDescriptionEmpty(){
        try{
            Department department = new Department("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("A description needs to be given.", e.getMessage());
        }
    }

    @Test
    void shouldReturnManager(){
        Manager manager = createMock(Manager.class);
        Department department = new Department("Automation");
        department.setManager(manager);

        assertEquals(manager, department.getManager());
    }

    @Test
    void shouldAddDeveloper() {
        Developer developer = createMock(Developer.class);
        Department department = new Department("Automation");
        department.addDeveloper(developer);

        assertTrue(department.getDevelopers().contains(developer));
    }

    @Test
    void shouldReturnDevelopers() {
        Developer developer = createMock(Developer.class);
        Department department = new Department("Automation");
        department.addDeveloper(developer);

        List<Developer> developers = new ArrayList<>();
        developers.add(developer);
        assertEquals(developers, department.getDevelopers());
    }

    @Test
    void shouldReturnDevelopersNames() {
        Developer developer = createMock(Developer.class);
        expect(developer.getName()).andReturn("Lucas");
        replay(developer);

        Department department = new Department("Automation");
        department.addDeveloper(developer);

        assertTrue(department.getDevelopersNames().contains("Lucas"));
    }

    @Test
    void shouldAddProject() {
        Project project = createMock(Project.class);
        Department department = new Department("Automation");
        department.addProject(project);

        assertTrue(department.getProjects().contains(project));
    }

    @Test
    void shouldRemoveProject() {
        Project project = createMock(Project.class);
        Department department = new Department("Automation");
        department.addProject(project);
        department.removeProject(project);

        assertFalse(department.getProjects().contains(project));
    }

    @Test
    void shouldReturnProjects() {
        Project project = createMock(Project.class);
        Department department = new Department("Automation");
        department.addProject(project);

        List<Project> projects = new ArrayList<>();
        projects.add(project);
        assertEquals(projects, department.getProjects());
    }

    @Test
    void shouldReturnProjectsDescriptions() {
        Project project = createMock(Project.class);
        expect(project.getDescription()).andReturn("Integrate customer API");
        replay(project);

        Department department = new Department("Automation");
        department.addProject(project);

        assertTrue(department.getProjectsDescriptions().contains("Integrate customer API"));
    }

    @Test
    void shouldReturnDescription() {
        Department department = new Department("Automation");

        assertEquals("Automation", department.getDescription());
    }

}