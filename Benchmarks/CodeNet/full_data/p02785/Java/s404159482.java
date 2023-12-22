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
    int k = Integer.parseInt(sc.next());
    int h[] = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(h);
    long ans = 0;
    for (int i = n - k - 1; i >= 0; i--) {
      ans += h[i];
    }
    pw.println(ans);
  }
}
