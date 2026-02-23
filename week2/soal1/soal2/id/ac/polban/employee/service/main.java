package id.ac.polban.employee.service;

import id.ac.polban.employee.model.*;

public class main { 
    public static void main(String[] args) {
       
        Department itDept = new Department("IT Department");

      
        EmploymentType fullTime = new EmploymentType("Full-Time");

     
        Employee emp1 = new Employee(1, "Luis Danang", itDept, fullTime, 5000000);
        Employee emp2 = new Employee(2, "Ahdiyatul", itDept, fullTime, 6000000);

       
        itDept.addEmployee(emp1);
        itDept.addEmployee(emp2);

        
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        System.out.println("--- Daftar Karyawan Sebelum Kenaikan Gaji ---");
        service.displayAllEmployees();

       
        service.raiseSalary(1, 10); // Naik 10%
        System.out.println("\n--- Setelah Kenaikan Gaji (Luis +10%) ---");
        service.displayAllEmployees();

        
        System.out.println("\nTotal Objek Employee yang dibuat (Static): " + Employee.getTotalEmployees());
    }
}