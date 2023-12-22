import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = Long.parseLong(sc.next());
    }
    BigInteger lcm = multiLcm(a);
    BigInteger ans = Arrays.stream(a)
      .mapToObj(ai -> lcm.divide(BigInteger.valueOf(ai)))
      .reduce(BigInteger::add)
      .get().remainder(BigInteger.valueOf(1000000007));
    pw.println(ans);
  }

  static BigInteger multiLcm(long[] values) {
    return Arrays.stream(values)
      .mapToObj(BigInteger::valueOf)
      .reduce((a, b) -> {
        BigInteger gcd = a.gcd(b);
        return a.multiply(b.divide(gcd));
      }).get();
  }

  static long gcd(long a, long b) {
    if (a >= b) {
      return calculateGcdRecursively(a, b);
    } else {
      return calculateGcdRecursively(b, a);
    }
  }

  static long calculateGcdRecursively(long a, long b) {
    if (b == 0) {
      return a;
    }
    return calculateGcdRecursively(b, a % b);
  }
}
