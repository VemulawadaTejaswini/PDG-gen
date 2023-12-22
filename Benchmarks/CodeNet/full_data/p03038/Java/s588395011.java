import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

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

    Collections.sort(values);

    for (int i = 0; i < m; i++) {
      Change change = new Change();
      change.times = sc.nextInt();
      change.toValue = sc.nextInt();
      changes.add(change);
    }

    // logic
    for (Change change : changes) {
      int pos = Collections.binarySearch(values, change.toValue);
      if (pos < 0) pos = -pos - 1;
      int bound = Math.min(pos, change.times);

      List<Integer> toAdd = new LinkedList<>();
      for (int i = 0; i < bound; i++) {
        toAdd.add(change.toValue);
      }
      values.addAll(pos, toAdd);
      for (int i = 0; i < bound; i++) {
        values.remove(0);
      }
    }

    long sum = 0;
    for (int val : values) {
      sum += val;
    }
    os.println(sum);
  }

  /**
  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    int n = sc.nextInt();
    int m = sc.nextInt();

    PriorityQueue<Integer> queue = new PriorityQueue<>(Integer::compareTo);
    List<Change> changes = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      queue.add(sc.nextInt());
    }

    for (int i = 0; i < m; i++) {
      Change change = new Change();
      change.times = sc.nextInt();
      change.toValue = sc.nextInt();
      changes.add(change);
    }

    // logic
    for (Change change : changes) {
      List<Integer> toBack = new ArrayList<>();
      for (int i = 0; i < change.times; i++) {
        int value = queue.remove();
        if (value < change.toValue) {
          toBack.add(change.toValue);
        } else {
          toBack.add(value);
          break;
        }
      }
      queue.addAll(toBack);
    }

    long sum = 0;
    for (int val : queue) {
      sum += val;
    }
    os.println(sum);
  }
  */
}