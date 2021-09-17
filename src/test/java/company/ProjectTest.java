package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {
    @Test
    void shouldThrowExceptionDescriptionEmpty() {
        try{
            Project project = new Project("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("A description needs to be given.", e.getMessage());
        }
    }

    @Test
    void shouldThrowExceptionDescriptionNull() {
        try{
            Project project = new Project(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("A description needs to be given.", e.getMessage());
        }
    }

    @Test
    void shouldReturnDescription() {
        Project project = new Project("Integrate customer API");

        assertEquals("Integrate customer API", project.getDescription());
    }
}