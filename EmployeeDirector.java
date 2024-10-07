public class EmployeeDirector {
    // Instance variable for the EmployeeBuilder
    private EmployeeBuilder builder;

    //------------------------------------------------------
    
    // Constructor that initializes the EmployeeBuilder
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    //------------------------------------------------------
    
    // Method to construct an Employee object using the builder
    public Employee construct(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        return builder.setId(id)
                      .setName(name)
                      .setDepartment(department)
                      .setRole(role)
                      .setWorkingHoursPerWeek(workingHoursPerWeek)
                      .setSalary(salary)
                      .build();
    }
}

    