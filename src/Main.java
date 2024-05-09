import java.time.LocalDate;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        boolean running = true;

        while (running)
        {
            System.out.println("\n1. Add Task\n2. Mark Task Completed\n3. Delete Task\n4. Show Tasks Due Today\n5. Show All Tasks\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice)
            {
                case 1 ->
                {
                    // Prompt for task details and add a task
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter due date (YYYY-MM-DD):");
                    LocalDate dueDate = LocalDate.parse(scanner.nextLine());
                    System.out.println("Enter priority (1-5):");
                    int priority = scanner.nextInt();
                    Task task = new Task(manager.tasks.size() + 1, description, dueDate, priority);
                    manager.addTask(task);
                }
                case 2 ->
                {
                    // Prompt for task ID and mark it as completed
                    System.out.println("Enter task ID to mark as completed:");
                    int taskIdComplete = scanner.nextInt();
                    manager.markTaskAsCompleted(taskIdComplete);
                }
                case 3 ->
                {
                    // Prompt for task ID and delete it
                    System.out.println("Enter task ID to delete:");
                    int taskIdDelete = scanner.nextInt();
                    manager.deleteTask(taskIdDelete);
                }
                case 4 ->
                    // Show tasks due today
                        manager.showTasksDueToday();
                case 5 ->
                    // Display all tasks
                        manager.displayAllTasks();
                case 6 ->
                    // Exit the application
                        running = false;
                default -> System.out.println("Invalid option, please try again.");
            }
        }

        scanner.close();
    }
}
