import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    List<Queue<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      Queue<Integer> queue = new LinkedList<>();
      for (int j = 0; j < n - 1; j++) {
        queue.add(sc.nextInt() - 1);
      }
      lists.add(queue);
    }

    int count = 0;
    int day = 0;
    int N = n * (n - 1) / 2;
    while (count < N) {
      Set<Integer> used = new HashSet<>();
      for (int i = 0; i < n; i++) {
        if (used.contains(i) || lists.get(i).isEmpty()) continue;
        int j = lists.get(i).peek();
        if (used.contains(j) || lists.get(j).isEmpty()) continue;
        if (lists.get(j).peek() != i) continue;
        used.add(i); used.add(j);
        count++;
      }
      if (used.isEmpty()) {
        os.println(-1);
        return;
      }
      for (int i : used) {
        lists.get(i).remove();
      }
      day++;
    }
    os.println(day);
  }
}