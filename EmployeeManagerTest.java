import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EmployeeManagerTest {

    private EmployeeManager manager;

    //------------------------------------------------------
    
    // Set up method to initialize the EmployeeManager before each test
    @Before
    public void setUp() {
        manager = EmployeeManager.getInstance();
    }

    //------------------------------------------------------
    
    // Test case to check the singleton behavior of EmployeeManager
    @Test
    public void testSingletonBehavior() {
        EmployeeManager manager2 = EmployeeManager.getInstance();
        
        // Assertion to verify both instances point to the same object
        assertSame(manager, manager2); // Check if both manager instances are the same
    }

    //------------------------------------------------------
    
    // Test case to add an employee and retrieve them from the manager
    @Test
    public void testAddAndRetrieveEmployee() {
        Employee employee = new FullTimeEmployee("A01", "Ted", "Backend", "Developer", 40, 75000);
        manager.addEmployee(employee);
        
        // Assertion to verify the added employee can be retrieved
        assertEquals(employee, manager.getEmployee("A01")); // Check if the retrieved employee matches the added one
    }

    //------------------------------------------------------
    
    // Test case to remove an employee from the manager
    @Test
    public void testRemoveEmployee() {
        Employee employee = new FullTimeEmployee("A01", "Ted", "Backend", "Developer", 40, 75000);
        manager.addEmployee(employee);
        manager.removeEmployee("001");
        
        // Assertion to verify the employee is removed successfully
        assertNull(manager.getEmployee("001")); // Check if the employee retrieval returns null after removal
    }
}

