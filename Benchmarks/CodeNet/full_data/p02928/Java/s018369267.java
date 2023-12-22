import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static final long MOD = 1000000007L;

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    long k = sc.nextLong();

    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    long result = 0;
    for (int i = 0; i < n; i++) {
      long l = 0;
      long r = 0;
      for (int j = 0; j < n; j++) {
        if (a[i] > a[j]) {
          if (i < j) r++;
          else l++;
        }
      }
      result = (result + calc(r, k, r + l)) % MOD;
    }

   os.println(result);
  }

  private static long calc(long a, long n, long d) {
    return ((n * (2 * a + (n - 1) * d)) / 2) % MOD;
  }
}