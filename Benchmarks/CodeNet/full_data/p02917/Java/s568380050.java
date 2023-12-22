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
    int[] bn = new int[n - 1];
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (i < n - 1) {
        bn[i] = Integer.parseInt(sc.next());
      }
      if (i == 0) {
        ans += bn[i];
      } else if (i == n - 1) {
        ans += bn[i - 1];
      } else {
        ans += Math.min(bn[i], bn[i - 1]);
      }
    }
    pw.println(ans);
  }
}
