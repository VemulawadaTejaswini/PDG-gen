import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Task[] tasks = new Task[N];
    for (int i = 0; i < N; i++) tasks[i] = new Task(scanner.nextInt(), scanner.nextInt());

    Arrays.sort(tasks, Comparator.comparingInt(t -> t.b));
    long sum = 0;
    for (Task t : tasks) {
      sum += t.a;
      if (sum > t.b) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }

  private static class Task {
    final int a;
    final int b;

    private Task(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}
