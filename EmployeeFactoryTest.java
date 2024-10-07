import static org.junit.Assert.*;
import org.junit.Test;

public class EmployeeFactoryTest {

    //------------------------------------------------------
    
    // Test case to create a full-time employee
    @Test
    public void testCreateFullTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("fulltime", "A01", "Ted", "Backend", "Developer", 40, 75000);
        
        // Assertions to verify the employee is created successfully and is of the correct type
        assertNotNull(employee); // Ensure employee is not null
        assertTrue(employee instanceof FullTimeEmployee); // Check if employee is an instance of FullTimeEmployee
    }

    //------------------------------------------------------
    
    // Test case to create a part-time employee
    @Test
    public void testCreatePartTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("parttime", "B02", "Lily", "Management", "Assistant", 20, 25000);
        
        // Assertions to verify the employee is created successfully and is of the correct type
        assertNotNull(employee); // Ensure employee is not null
        assertTrue(employee instanceof PartTimeEmployee); // Check if employee is an instance of PartTimeEmployee
    }

    //------------------------------------------------------
    
    // Test case to handle unknown employee type creation
    @Test(expected = IllegalArgumentException.class)
    public void testCreateUnknownEmployeeType() {
        // Attempting to create an employee with an unknown type should throw an IllegalArgumentException
        EmployeeFactory.createEmployee("contract", "B03", "Marshel", "Accounts", "Analyst", 30, 50000);
    }
}
