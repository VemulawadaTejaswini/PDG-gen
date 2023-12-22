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
    int count = 0;
    for (int i = 0; i < n; i++) {
      int pn = Integer.parseInt(sc.next());
      if (pn != i + 1) {
        count++;
      }
    }
    if (count <= 2) {
      pw.println("YES");
    } else {
      pw.println("NO");
    }
  }
}
