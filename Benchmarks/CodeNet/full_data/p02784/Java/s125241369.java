import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int h = Integer.parseInt(sc.next());
    int n = Integer.parseInt(sc.next());
    long total = 0;
    for (int i = 0; i < n; i++) {
      total += Integer.parseInt(sc.next());
      if (total >= h) {
        pw.println("Yes");
        return;
      }
    }
    pw.println("No");
  }
}
