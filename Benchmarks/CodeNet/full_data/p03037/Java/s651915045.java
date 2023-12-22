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
    int m = sc.nextInt();

    int[] l = new int[m];
    int[] r = new int[m];

    int lMax = Integer.MIN_VALUE;
    int rMin = Integer.MAX_VALUE;
    for (int i = 0; i < m; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
      lMax = Math.max(l[i], lMax);
      rMin = Math.min(r[i], rMin);
    }
    os.println(rMin - lMax + 1);
  }

}