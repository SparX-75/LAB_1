public class PartTimeEmployeeBuilder implements EmployeeBuilder {
    // Instance variables for building a part-time employee
    private String id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    //------------------------------------------------------
    
    // Method to set the employee ID
    @Override
    public EmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    //------------------------------------------------------
    
    // Method to set the employee name
    @Override
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    //------------------------------------------------------
    
    // Method to set the employee department
    @Override
    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    //------------------------------------------------------
    
    // Method to set the employee role
    @Override
    public EmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    //------------------------------------------------------
    
    // Method to set the employee's working hours per week
    @Override
    public EmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    //------------------------------------------------------
    
    // Method to set the employee's salary
    @Override
    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    //------------------------------------------------------
    
    // Method to build and return a PartTimeEmployee object
    @Override
    public Employee build() {
        return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}

    