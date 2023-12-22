import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int a[] = new int[n];
    BigInteger lcm = BigInteger.valueOf(1);
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    int dividableBy2Count = dividableBy2Count(a[0]);
    for (int i = 0; i < n; i++) {
      if (dividableBy2Count != dividableBy2Count(a[i])) {
        pw.println(0);
        return;
      }
    }
    for (int i = 0; i < n; i++) {
      lcm = lcm(lcm, BigInteger.valueOf(a[i]).divide(BigInteger.TWO));
    }
    int lLcm = lcm.intValue();
    int ans = 0;
    for (int i = lLcm; i <= m; i += lLcm * 2) {
      ans++;
    }
    pw.println(ans);
  }

  static BigInteger lcm(BigInteger a, BigInteger b) {
    return a.multiply(b).divide(a.gcd(b));
  }

  static int dividableBy2Count(int n) {
    int ans = 0;
    while (n % 2 == 0) {
      ans++;
      n /= 2;
    }
    return ans;
  }
}
