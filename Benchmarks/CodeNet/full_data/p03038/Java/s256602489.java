import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.function.UnaryOperator;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static class Change {

    int times;
    int toValue;

  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    int m = sc.nextInt();

    List<Integer> values = new ArrayList<>();
    List<Change> changes = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      values.add(sc.nextInt());
    }

    for (int i = 0; i < m; i++) {
      Change change = new Change();
      change.times = sc.nextInt();
      change.toValue = sc.nextInt();
      changes.add(change);
    }

    // logic

    PriorityQueue<Integer> queue = new PriorityQueue<>(values);

    for (Change change : changes) {
      for (int i = 0; i < change.times; i++) {
        queue.add(change.toValue);
        queue.remove();
      }
    }

    long sum = 0;
    for (int value : queue) {
      sum += value;
    }

    os.println(sum);
  }
}