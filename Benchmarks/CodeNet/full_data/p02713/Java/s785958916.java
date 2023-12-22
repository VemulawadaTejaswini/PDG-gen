import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    long ans = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        int gcdIJ = gcd(i, j);
        for (int k = 1; k <= n; k++) {
          ans += gcd(gcdIJ, k);
        }
      }
    }
    pw.println(ans);
  }

  static int gcd(int a, int b) {
    if (a == b) {
      return a;
    }
    if (a > b) {
      return innerGcd(a, b);
    } else {
      return innerGcd(b, a);
    }
  }

  static int innerGcd(int a, int b) {
    int r = a % b;
    if (r == 0) {
      return b;
    }
    return innerGcd(b, r);
  }
}
