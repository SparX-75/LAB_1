public abstract class Employee {
    // Instance variables for employee details
    protected String id;
    protected String name;
    protected String department;
    protected String role;
    protected int workingHoursPerWeek;
    protected double salary;

    //------------------------------------------------------
    
    // Constructor to initialize employee details
    public Employee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    //------------------------------------------------------
    
    // Abstract methods to be implemented by subclasses
    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();

    //------------------------------------------------------
    
    // Getters and setters for employee properties
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //------------------------------------------------------
    
    // Override toString method to provide employee details
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department +
               ", role=" + role + ", workingHoursPerWeek=" + workingHoursPerWeek + ", salary=" + salary + "]";
    }
}

