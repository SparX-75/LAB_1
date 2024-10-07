import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EmployeeDirectorTest {

    private EmployeeDirector director;

    //------------------------------------------------------
    
    // Set up method to initialize the EmployeeDirector before each test
    @Before
    public void setUp() {
        director = new EmployeeDirector(new FullTimeEmployeeBuilder());
    }

    //------------------------------------------------------
    
    // Test case to verify employee construction
    @Test
    public void testEmployeeConstruction() {
        Employee employee = director.construct("A01", "Ted", "Backend", "Developer", 40, 75000);
        
        // Assertions to check the properties of the constructed employee
        assertNotNull(employee); // Ensure employee is not null
        assertEquals("A01", employee.getId()); // Check ID
        assertEquals("Ted", employee.getName()); // Check name
        assertEquals("Backend", employee.getDepartment()); // Check department
        assertEquals("Developer", employee.getRole()); // Check role
        assertEquals(40, employee.getWorkingHoursPerWeek()); // Check working hours
        assertEquals(75000, employee.getSalary(), 0.01); // Check salary with a delta for precision
    }
}
