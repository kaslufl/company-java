package company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.easymock.EasyMock.*;

class EmployeeTest {
    @Test
    void shouldThrowExceptionNameNull() {
        try {
            Employee employee = new Employee(null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("A name needs to be given.", e.getMessage());
        }
    }

    @Test
    void shouldThrowExceptionNameEmpty() {
        try {
            Employee employee = new Employee("");
            fail();
        } catch (NullPointerException e) {
            assertEquals("A name needs to be given.", e.getMessage());
        }
    }


    @Test
    void shouldReturnName() {
        Employee employee = new Employee("Lucas");

        assertEquals("Lucas", employee.getName());
    }

}