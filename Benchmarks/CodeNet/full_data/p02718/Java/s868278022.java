import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
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
    int total = 0;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
      total += a[i];
    }
    int border = total / (4 * m);
    Arrays.sort(a);
    boolean ok = true;
    for (int i = 0; i < m; i++) {
      int ai = a[n - 1 - i];
      if (ai < border) {
        ok = false;
        break;
      }
    }
    pw.println(ok ? "Yes" : "No");
  }
}
