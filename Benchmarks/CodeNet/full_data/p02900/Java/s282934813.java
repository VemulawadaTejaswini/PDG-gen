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
    long a = sc.nextLong();
    long b = sc.nextLong();

    long target = gcd(a, b);

    Set<Long> factors = new HashSet<>();
    factors.add(1L);

    long root = (long) Math.sqrt(target) + 1;

    for (long i = 2; i <= root; i++) {
      if (target % i != 0) continue;
      do {
        target /= i;

      } while (target % i == 0);
      factors.add(i);
    }

    os.println(factors.size());
  }

  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
  }
}