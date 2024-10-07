public class EmployeeFactory {
    // Method to create an Employee based on the type
    public static Employee createEmployee(String type, String id, String name, String department, String role, int hours, double salary) {
        // Determine employee type and create accordingly
        switch (type.toLowerCase()) {
            case "fulltime":
                // Create a builder for a full-time employee
                EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
                return new EmployeeDirector(fullTimeBuilder).construct(id, name, department, role, hours, salary);
                
            //------------------------------------------------------
                
            case "parttime":
                // Create a builder for a part-time employee
                EmployeeBuilder partTimeBuilder = new PartTimeEmployeeBuilder();
                return new EmployeeDirector(partTimeBuilder).construct(id, name, department, role, hours, salary);
                
            //------------------------------------------------------
                
            default:
                // Throw exception for unknown employee types
                throw new IllegalArgumentException("Unknown employee type: " + type);
        }
    }
}

    