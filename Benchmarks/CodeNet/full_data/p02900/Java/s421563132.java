import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    boolean aIsMin = a < b;
    if (aIsMin) {
      Set<Long> minPrimes = primes(a);
      Set<Long> and = primesAnd(b, minPrimes);
      pw.println(and.size() + 1);
    } else {
      Set<Long> minPrimes = primes(b);
      Set<Long> and = primesAnd(a, minPrimes);
      pw.println(and.size() + 1);
    }
  }

  static Set<Long> primes(long n) {
    Set<Long> ans = new HashSet<>();
    for (int i = 2; i <= n; i += 2) {
      if (n % i == 0) {
        ans.add((long) i);
        n = n / i;
        i = 1;
      }
    }
    return ans;
  }

  static Set<Long> primesAnd(long n, Set<Long> prev) {
    Set<Long> ans = new HashSet<>();
    for (long p : prev) {
      if (n % p == 0) {
        ans.add(p);
        n = n / p;
      }
    }
    return ans;
  }
}
