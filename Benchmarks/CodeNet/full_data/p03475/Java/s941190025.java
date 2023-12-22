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

    int[] c = new int[n];
    int[] s = new int[n];
    int[] f = new int[n];

    for (int i = 0; i < n - 1; i++) {
      c[i] = sc.nextInt();
      s[i] = sc.nextInt();
      f[i] = sc.nextInt();
    }

    for (int start = 0; start < n; start++) {
      int t = 0;
      for (int i = start; i < n - 1; i++) {
        int k = Math.max((t - s[i]) / f[i], 0);
        t = s[i] + k * f[i] + c[i];
      }
      os.println(t);
    }
  }
}
