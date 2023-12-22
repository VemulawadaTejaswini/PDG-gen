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
    long previousH = Long.parseLong(sc.next());
    int currentCount = 0;
    int maxCount = 0;
    for (int i = 0; i < n - 1; i++) {
      long h = Long.parseLong(sc.next());
      if (previousH >= h) {
        currentCount++;
        previousH = h;
        maxCount = Math.max(maxCount, currentCount);
      } else {
        currentCount = 0;
        previousH = h;
      }
    }
    pw.println(maxCount);
  }
}
