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
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = Integer.parseInt(sc.next());
    }
    int min = p[0];
    int count = 0;
    for (int i = 0; i < n; i++) {
      int pi = p[i];
      if (pi <= min) {
        count++;
      }
      min = Math.min(min, pi);
    }
    pw.println(count);
  }
}
