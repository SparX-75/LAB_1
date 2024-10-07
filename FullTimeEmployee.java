public class FullTimeEmployee extends Employee {
    // Constructor to initialize a full-time employee
    public FullTimeEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    //------------------------------------------------------
    
    // Implementation of clockIn for full-time employee
    @Override
    public void clockIn() {
        System.out.println(name + " (Full-Time) clocked in.");
    }

    //------------------------------------------------------
    
    // Implementation of clockOut for full-time employee
    @Override
    public void clockOut() {
        System.out.println(name + " (Full-Time) clocked out.");
    }

    //------------------------------------------------------
    
    // Implementation of trackWorkHours for full-time employee
    @Override
    public void trackWorkHours() {
        System.out.println(name + " (Full-Time) worked for " + workingHoursPerWeek + " hours.");
    }
}
