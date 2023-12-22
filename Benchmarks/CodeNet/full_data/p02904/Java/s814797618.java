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
    int k = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    List<Integer> list = new LinkedList<>();

    for (int i = 0; i < k; i++) {
      list.add(a[i]);
    }
    Collections.sort(list);

    int start = 0;

    int res = 1;

    do {
      int bs = Collections.binarySearch(list, start + k);
      if (-bs-1 != k) res++;
      list.add(-bs - 1);
      start++;
    } while (start + k < n);

    os.println(res);

  }

}