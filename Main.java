import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGER =====");
            System.out.println("1. Add Employee");
            System.out.println("2. List All Employees");
            System.out.println("3. Search by Department");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    employees.add(new Employee(id, name, department));

                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("\nEmployee List:");

                        for (Employee e : employees) {
                            e.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Department: ");
                    String searchDept = sc.nextLine();

                    boolean found = false;

                    for (Employee e : employees) {
                        if (e.department.equalsIgnoreCase(searchDept)) {
                            e.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No employee found in this department.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
