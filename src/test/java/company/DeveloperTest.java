package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    @Test
    void shouldReturnDeveloper() {
        Department department = new Department("Automation");
        Developer developer = new Developer("Lucas", department);

        assertTrue(department.getDevelopers().contains(developer));
    }
}