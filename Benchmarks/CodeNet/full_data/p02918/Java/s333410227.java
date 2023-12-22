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
    int k = Integer.parseInt(sc.next());
    char[] s = sc.next().toCharArray();
    int[] pn = new int[n];
    for (int i = 0; i < n; i++) {
      if (String.valueOf(s[i]).equals("L")) {
        pn[i] = -1;
      } else {
        pn[i] = 1;
      }
    }
    int happy = 0;
    int previous = -2;
    for (int i = 0; i < n; i++) {
      if (previous == pn[i]) {
        happy += 1;
      }
      previous = pn[i];
    }
    pw.println(Math.min(n - 1, happy + 2 * k));
  }
}
