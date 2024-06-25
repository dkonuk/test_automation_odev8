package Human_Resources;

public class Task {
    private String TaskName;
    private String TaskDescription;
    private boolean TaskStatus;

    public Task(String TaskName, String TaskDescription) {
        this.TaskName = TaskName;
        this.TaskDescription = TaskDescription;
        this.TaskStatus = false;
    }
        public String getTaskName() {
            return TaskName;
        }

        public boolean getTaskStatus() {
            if (TaskStatus) {
                System.out.println(TaskName + " task status: " + "Completed");
            } else {
                System.out.println(TaskName + " task status: " + "Not Completed");
            }
            return TaskStatus;
        }
        public void setTaskStatus(boolean TaskStatus) {
            this.TaskStatus = TaskStatus;
        }

    }


