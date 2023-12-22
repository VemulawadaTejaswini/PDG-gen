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
    BigInteger[] a = new BigInteger[n];
    for (int i = 0; i < n; i++) {
      a[i] = BigInteger.valueOf(Long.parseLong(sc.next()));
    }
    BigInteger lcm = multiLcm(a);
    BigInteger ans = Arrays.stream(a)
      .map(ai -> lcm.divide(ai))
      .reduce(BigInteger::add)
      .get().remainder(BigInteger.valueOf(1000000007));
    pw.println(ans);
  }

  static BigInteger multiLcm(BigInteger[] values) {
    return Arrays.stream(values).reduce((a, b) -> {
      BigInteger gcm = a.gcd(b);
      return a.multiply(b.divide(gcm));
    }).get();
  }
}
