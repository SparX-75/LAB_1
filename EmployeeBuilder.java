public interface EmployeeBuilder {
    //------------------------------------------------------
    
    // Method to set the employee ID
    EmployeeBuilder setId(String id);
    
    //------------------------------------------------------
    
    // Method to set the employee name
    EmployeeBuilder setName(String name);
    
    //------------------------------------------------------
    
    // Method to set the employee department
    EmployeeBuilder setDepartment(String department);
    
    //------------------------------------------------------
    
    // Method to set the employee role
    EmployeeBuilder setRole(String role);
    
    //------------------------------------------------------
    
    // Method to set the employee's working hours per week
    EmployeeBuilder setWorkingHoursPerWeek(int hours);
    
    //------------------------------------------------------
    
    // Method to set the employee's salary
    EmployeeBuilder setSalary(double salary);
    
    //------------------------------------------------------
    
    // Method to build and return an Employee object
    Employee build();
}
  