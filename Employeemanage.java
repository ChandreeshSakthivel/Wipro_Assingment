interface Employee {
    double calculateSalary();
    void displayDetails();
}
class FullTimeEmployee implements Employee {
    private String name;
    private int id;
    private double monthlySalary;
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }
    public double calculateSalary() {
        return monthlySalary;
    }
    public void displayDetails() {
        System.out.println("Full-Time Employee: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: $" + calculateSalary());
    }
}
class PartTimeEmployee implements Employee {
    private String name;
    private int id;
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    public void displayDetails() {
        System.out.println("Part-Time Employee: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
public class Employeemanage {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 20, 100);
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
