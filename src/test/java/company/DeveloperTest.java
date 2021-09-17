package company;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    @Test
    void shouldReturnDepartmentDescription() {
        Department department = createMock(Department.class);
        expect(department.getDescription()).andReturn("Automation");
        replay(department);

        Developer developer = new Developer("Lucas",department);

        assertEquals("Automation", developer.getDepartmentDescription());
    }

    @Test
    void shouldThrowExceptionDepartmentNull() {
        try{
            Department department = createMock(Department.class);
            Developer developer = new Developer("Lucas", department);
            developer.setDepartment(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("A department needs to be given.", e.getMessage());
        }

    }
}