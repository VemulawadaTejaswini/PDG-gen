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
    int m = Integer.parseInt(sc.next());
    int ans = 0;
    if (n >= 2) {
      ans += n * (n - 1) / 2;
    }
    if (m >= 2) {
      ans += m * (m - 1) / 2;
    }
    pw.println(ans);
  }
}
