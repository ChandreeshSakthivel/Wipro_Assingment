import java.util.*;
import java.util.stream.Collectors;
class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
}

public class StreamsApi {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 25, 50000),
            new Employee("Bob", 35, 60000),
            new Employee("Charlie", 40, 70000),
            new Employee("David", 28, 55000),
            new Employee("Eve", 45, 80000)
        );

        List<Employee> filteredEmployees = employees.stream()
            .filter(e -> e.getAge() > 30)
            .collect(Collectors.toList());
        double averageSalary = filteredEmployees.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0); 
        List<String> employeeNames = filteredEmployees.stream()
            .map(Employee::getName)
            .collect(Collectors.toList());
            
        System.out.println("Employees older than 30: " + employeeNames);
        System.out.println("Average salary of employees older than 30: " + averageSalary);
    }
}

