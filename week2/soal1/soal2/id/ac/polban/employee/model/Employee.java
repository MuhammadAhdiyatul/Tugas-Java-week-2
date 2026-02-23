package id.ac.polban.employee.model;

public class Employee {
    private int id;
    private String name;
    private Department department;
    private EmploymentType type;
    private double salary;
    
    // Static field untuk menghitung total karyawan yang dibuat
    public static int totalEmployees = 0; 

    public Employee(int id, String name, Department department, EmploymentType type, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.type = type;
        this.salary = salary;
        totalEmployees++; // Menambah counter setiap kali object dibuat
    }

    // Getter & Setter (Lengkapi sesuai kebutuhan jobsheet)
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    
    // Static method untuk mendapatkan total karyawan
    public static int getTotalEmployees() {
        return totalEmployees;
    }
}