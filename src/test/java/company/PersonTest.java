package company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.easymock.EasyMock.*;

class PersonTest {
    @Test
    void shouldThrowExceptionNameNull(){
        try{
            Department department = createMock(Department.class);
            Person person = new Person(null, department);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("A name needs to be given.", e.getMessage());
        }
    }

    @Test
    void shouldThrowExceptionNameEmpty(){
        try{
            Department department = createMock(Department.class);
            Person person = new Person("", department);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("A name needs to be given.", e.getMessage());
        }
    }

    @Test
    void shouldThrowExceptionDepartmentNull(){
        try{
            Person person = new Person("Lucas", null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("A department needs to be given.", e.getMessage());
        }
    }

    @Test
    void shouldReturnDepartment(){
        Department department = createMock(Department.class);
        Person person = new Person("Lucas", department);

        assertEquals(department, person.getDepartment());
    }

    @Test
    void shouldReturnName(){
        Department department = createMock(Department.class);
        Person person = new Person("Lucas", department);

        assertEquals("Lucas", person.getName());
    }

}