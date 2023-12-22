import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int taskCount = sc.nextInt();
    ArrayList<Task> tasks = new ArrayList<>();
    for (int i = 0; i <= taskCount; ++i) {
      tasks.add(new Task(sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(tasks, new TaskComparator());
    int totalTime = 0;
    for (Task task : tasks) {
      totalTime += task.getRequiredTime();
      if (totalTime > task.getDeadline()) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }

class Task {

  public Task(int requiredTime, int deadline) {
    this.requiredTime = requiredTime;
    this.deadline = deadline;
  }

  private int requiredTime;
  private int deadline;

  public int getRequiredTime() {
    return requiredTime;
  }

  public int getDeadline() {
    return deadline;
  }

}

class TaskComparator implements Comparator<Task> {

  @Override
  public int compare(Task t1, Task t2) {
    return t1.getDeadline() <= t2.getDeadline() ? -1: 1;
  }

}
}