package company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.easymock.EasyMock.*;

class BranchTest {
    @Test
    void shouldReturnDepartments() {
        Department department = createMock(Department.class);

        Branch branch = new Branch();
        branch.addDepartment(department);

        List<Department> departments = new ArrayList<>();
        departments.add(department);
        assertEquals(departments, branch.getDepartments());
    }

    @Test
    void shouldReturnDepartmentDescription() {
        Department department = createMock(Department.class);
        expect(department.getDescription()).andReturn("Automation");
        replay(department);

        Branch branch = new Branch();
        branch.addDepartment(department);

        assertTrue(branch.getDepartmentsDescriptions().contains("Automation"));
    }

    @Test
    void shouldAddDepartment(){
        Department department = createMock(Department.class);

        Branch branch = new Branch();
        branch.addDepartment(department);

        assertTrue(branch.getDepartments().contains(department));
    }

    @Test
    void shouldRemoveDepartment(){
        Department department = createMock(Department.class);

        Branch branch = new Branch();
        branch.addDepartment(department);
        branch.removeDepartment(department);

        assertFalse(branch.getDepartments().contains(department));
    }

}