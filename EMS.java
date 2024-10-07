public class EMS {
    public static void main(String[] args) {
        // Create an instance of EmployeeManager
        EmployeeManager manager = EmployeeManager.getInstance();
        
        //------------------------------------------------------
        
        // Create full-time and part-time employees using the EmployeeFactory
        Employee emp1 = EmployeeFactory.createEmployee("fulltime", "A01", "Ted", "Backend", "Developer", 40, 75000);
        Employee emp2 = EmployeeFactory.createEmployee("parttime", "B02", "Lily", "Management", "Assistant", 20, 25000);
        
        //------------------------------------------------------
        
        // Add employees to the manager
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        
        //------------------------------------------------------
        
        // Employee 1 clocking in, tracking work hours, and clocking out
        emp1.clockIn();
        emp1.trackWorkHours();
        emp1.clockOut();
        
        //------------------------------------------------------
        
        // Employee 2 clocking in, tracking work hours, and clocking out
        emp2.clockIn();
        emp2.trackWorkHours();
        emp2.clockOut();
        
        //------------------------------------------------------
        
        // Print all employees managed by the manager
        manager.printAllEmployees();
    }
}

    