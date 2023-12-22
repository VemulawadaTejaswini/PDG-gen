import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long n = Long.parseLong(sc.next());
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    if (a == 0) {
      pw.println(0);
      return;
    }
    if (b == 0) {
      pw.println(n);
      return;
    }
    long ans = 0;
    long total = 0;
    while (total <= n) {
      if (total + a + b > n) {
        ans += Math.min(a, n - total);
        break;
      }
      ans += a;
      total += (a + b);
    }
    pw.println(ans);
  }
}
