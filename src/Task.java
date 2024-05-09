import java.time.LocalDate;


public class Task
{
    private final int taskId;
    private String description;
    private LocalDate dueDate;
    private int priority;  // Assume a scale of 1-5, 5 being highest priority
    private boolean completed;

    public Task(int taskId, String description, LocalDate dueDate, int priority)
    {
        this.taskId = taskId;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.completed = false;
    }

    public int getTaskId()
    {
        return taskId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public LocalDate getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate)
    {
        this.dueDate = dueDate;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return String.format(
                "Task Details:\n" +
                        "   ID:          %d\n" +
                        "   Description: %s\n" +
                        "   Due Date:    %s\n" +
                        "   Priority:    %d (1=Low, 5=High)\n" +
                        "   Status:      %s\n",
                taskId,
                description,
                dueDate,
                priority,
                completed ? "Completed" : "Pending"
        );
    }

}
