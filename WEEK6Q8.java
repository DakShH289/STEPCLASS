class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    // Constructor for permanent employees
    public Employee(String empId, String empName, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Constructor for interns
    public Employee(String empId, String empName) {

        this(empId, empName, 0);
        this.isIntern = true;
    }

    // Print employee details
    public void printProfile() {

        System.out.println(empId + " | " + empName
                + " | Rs " + salary
                + " | Intern: " + isIntern);
    }
}

public class WEEK6Q8 {

    public static void main(String[] args) {

        // Create a permanent employee
        Employee e1 = new Employee("E-101", "Divya", 65000);

        // Create an intern
        Employee e2 = new Employee("E-102", "Arjun");

        // Print employee profiles
        e1.printProfile();
        e2.printProfile();
    }
}