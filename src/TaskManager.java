import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class TaskManager
{
    protected final List<Task> tasks;

    public TaskManager()
    {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task)
    {
        tasks.add(task);
    }

    public void markTaskAsCompleted(int taskId)
    {
        for (Task task : tasks)
        {
            if (task.getTaskId() == taskId)
            {
                task.setCompleted(true);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int taskId)
    {
        tasks.removeIf(t -> t.getTaskId() == taskId);
    }

    public void showTasksDueToday()
    {
        LocalDate today = LocalDate.now();
        List<Task> tasksDueToday = tasks.stream()
                .filter(task -> task.getDueDate().equals(today))
                .toList();
        tasksDueToday.forEach(System.out::println);
    }

    public void displayAllTasks()
    {
        tasks.forEach(System.out::println);
    }
}
