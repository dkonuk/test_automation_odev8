package Human_Resources;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String DepartmentName;
    private String TeamLeader;
    private static ArrayList<Employee> employeeList;
    private static ArrayList<Task> tasksList;

    public Department(String DepartmentName, String TeamLeader) {
        this.DepartmentName = DepartmentName;
        this.TeamLeader = TeamLeader;
        this.employeeList = new ArrayList<>();
        this.tasksList = new ArrayList<>();
    }
    public void changeTeamLeader(String TeamLeader) {
        this.TeamLeader = TeamLeader;
        System.out.println("Team leader  of " + DepartmentName + " department  changed to " + TeamLeader);
    }

    //Add employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    //Remove employee
    public void removeEmployee(String Name, String Surname) {
        employeeList.removeIf(employee -> employee.getName().equals(Name) && employee.getSurname().equals(Surname));
        System.out.println(Name + " " + Surname + " removed from " + DepartmentName + " department");
    }
    //Get list of employees
    public  List<Employee> getEmployeeList() {
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " " + employee.getSurname());
        }
        return List.of();
    }

    //Add task
    public void addTask(Task task) {
        tasksList.add(task);
    }

    //Change task status
    public void changeTaskStatus(String TaskName) {
        for (Task task : tasksList) {
            if (task.getTaskName().equals(TaskName)) {
                task.setTaskStatus(true);
                System.out.println(TaskName + " task status changed to Completed");
            }
        }
    }

    public List<Task> getTasksList() {
        for (Task task : tasksList) {
            System.out.println(task.getTaskName() + " " + task.getTaskStatus());
        }
        return List.of();
    }

}
