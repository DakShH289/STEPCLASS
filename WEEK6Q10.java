class Employee {

    // Instance variables
    String empName;
    double salary;

    // Static variables shared by all employees
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    // Constructor
    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    // Static method
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class WEEK6Q10 {

    public static void main(String[] args) {

        // Create three Employee objects
        Employee e1 = new Employee("Ravi", 40000);
        Employee e2 = new Employee("Priya", 50000);
        Employee e3 = new Employee("Arjun", 45000);

        // Call the static method using the class name
        Employee.printCompanyInfo();
    }
}