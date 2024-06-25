package Human_Resources;

import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;
import java.time.LocalDate;

public class Hıman_Resources {

    public static void main(String[] args) {
        //Creating a Department
        Department Shipping = new Department("Shipping", "John Doe");
        Shipping.addTask(new Task("Receive goods", "Accept goods from warehouse"));
        Shipping.addTask(new Task("Send goods", "Send goods to warehouse"));
        Shipping.changeTeamLeader("Micheal Doe");
        // Adding employee
        Employee employee1 = new Male_Employee("Male");
        employee1.Name = "John";
        employee1.Surname = "Done";
        employee1.BirthDate = LocalDate.of(1999, 1, 1);
        employee1.Departmant = "Shipping";
        Shipping.addEmployee(employee1);
        employee1.calculate_years_to_retire();
        // Adding employee
        Employee employee2 = new Female_Employee("Female");
        employee2.Name = "Jane";
        employee2.Surname = "Doe";
        employee2.BirthDate = LocalDate.of(1992, 1, 1);
        employee2.Departmant = "Shipping";
        Shipping.addEmployee(employee2);
        employee2.calculate_years_to_retire();
        // Listing the Employees
        System.out.println("List of employees: ");
        Shipping.getEmployeeList();
        //Removing employee
        Shipping.removeEmployee("John", "Done");
        System.out.println("List of employees: ");
        Shipping.getEmployeeList();

        // Printing list of tasks
        System.out.println("List of tasks: ");
        for (Task task : Shipping.getTasksList()) {
            System.out.println(task.getTaskName() + " " + task.getTaskStatus());
        }
        // Changing the status of the task
        Shipping.changeTaskStatus("Receive goods");
        System.out.println("List of tasks: ");
        for (Task task : Shipping.getTasksList()) {
            System.out.println(task.getTaskName() + " " + task.getTaskStatus());

        }

    }
}

