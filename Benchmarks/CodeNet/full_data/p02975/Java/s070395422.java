import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */

    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    Map<Integer, Integer> count = new HashMap<>();

    for (int i = 0; i < n; i++){
      count.put(a[i], count.getOrDefault(a[i], 0) + 1);
    }

    if (count.keySet().size() != 3) {
      os.println("No");
      return;
    }

    Iterator<Integer> it = count.keySet().iterator();
    int first = it.next();
    int second = it.next();
    int third = it.next();
    if (second != xor(first, third)) {
      os.println("No");
      return;
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int key : count.keySet()) {
      max = Math.max(max, count.get(key));
      min = Math.min(min, count.get(key));
    }

    if (Math.abs(max - min) == 0) {
      os.println("Yes");
    } else {
      os.println("No");
    }
  }

  private static int xor(int a, int b) {
    int res = 0;

    for (int i = 0; i < 32; i++) {
      int mask = 1 << i;
      res += (mask & a) ^ (mask & b);
    }
    return res;
  }
}