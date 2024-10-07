import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    // Singleton instance of EmployeeManager
    private static EmployeeManager instance;
    
    // Map to store employees with their IDs as keys
    private Map<String, Employee> employeeMap;

    //------------------------------------------------------
    
    // Private constructor to initialize the employee map
    private EmployeeManager() {
        employeeMap = new HashMap<>();
    }

    //------------------------------------------------------
    
    // Method to get the singleton instance of EmployeeManager
    public static synchronized EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    //------------------------------------------------------
    
    // Method to add an employee to the manager
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    //------------------------------------------------------
    
    // Method to remove an employee by their ID
    public void removeEmployee(String employeeId) {
        employeeMap.remove(employeeId);
    }

    //------------------------------------------------------
    
    // Method to retrieve an employee by their ID
    public Employee getEmployee(String employeeId) {
        return employeeMap.get(employeeId);
    }

    //------------------------------------------------------
    
    // Method to print all employees managed
    public void printAllEmployees() {
        employeeMap.values().forEach(System.out::println);
    }
}

    