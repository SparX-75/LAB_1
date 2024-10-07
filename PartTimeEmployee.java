public class PartTimeEmployee extends Employee {
    // Constructor to initialize a part-time employee
    public PartTimeEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    //------------------------------------------------------
    
    // Implementation of clockIn for part-time employee
    @Override
    public void clockIn() {
        System.out.println(name + " (Part-Time) clocked in.");
    }

    //------------------------------------------------------
    
    // Implementation of clockOut for part-time employee
    @Override
    public void clockOut() {
        System.out.println(name + " (Part-Time) clocked out.");
    }

    //------------------------------------------------------
    
    // Implementation of trackWorkHours for part-time employee
    @Override
    public void trackWorkHours() {
        System.out.println(name + " (Part-Time) worked for " + workingHoursPerWeek + " hours.");
    }
}
