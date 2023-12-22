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
      long[] minPrimes = primes(a);
      Set<Long> and = primesAnd(b, minPrimes);
      pw.println(and.size() + 1);
    } else {
      long[] minPrimes = primes(b);
      Set<Long> and = primesAnd(a, minPrimes);
      pw.println(and.size() + 1);
    }
  }

  static long[] primes(long n) {
    long[] ans = new long[64];
    int count = 0;
    if (n % 2 == 0) {
      ans[count] = 2;
      count++;
      n = n / 2;
      while (n % 2 == 0) {
        n = n / 2;
      }
    }
    long d = 3;
    while (d <= n) {
      d = tryDivide(n, d);
      n = n / d;
      ans[count] = d;
      count++;
      while (n % d == 0) {
        n = n / d;
      }
    }
    return ans;
  }

  static long tryDivide(long n, long min) {
    long max = (long) Math.sqrt(n);
    for (long i = min; i <= max; i += 2) {
      if (n % i == 0) {
        return i;
      }
    }
    return n;
  }

  static Set<Long> primesAnd(long n, long[] prev) {
    Set<Long> ans = new HashSet<>();
    for (long p : prev) {
      if (p == 0) {
        break;
      }
      if (n % p == 0) {
        ans.add(p);
        n = n / p;
      }
    }
    return ans;
  }
}
