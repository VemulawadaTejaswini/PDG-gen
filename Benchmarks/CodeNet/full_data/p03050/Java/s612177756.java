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
    long n = sc.nextLong();

    long sum = 0;
    long upperbound = (long) Math.ceil(Math.sqrt(n));

    
    Set<Long> added = new HashSet<>();
    
    for (long x1 = 1; x1 <= upperbound; x1++) {
      if (n % x1 == 0) {
        long m1 = n / x1 - 1;
        if (!added.contains(m1)) {
          if (m1 > 1 && n % m1 != 0 && x1 < m1) {
            sum += m1;
            added.add(m1);
          }
        }
        long x2 = m1 + 1;
        long m2 = x1 - 1;
        if (!added.contains(m2)) {
          if (m2 > 1 && n % m2 != 0 && x2 < m2) {
            sum += m2;
            added.add(m2);
          }
        }
      }
    }
    /**
    for (long i = 1; i <= n; i++) {
      if (n / i == n % i) {
        sum += i;
      }
    }*/
    os.println(sum);
  }
}