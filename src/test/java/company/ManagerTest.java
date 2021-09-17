package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    void shouldReturnManager() {
        Department department = new Department("Automation");
        Manager manager = new Manager("Lucas", department);

        assertEquals(manager, department.getManager());
    }
}