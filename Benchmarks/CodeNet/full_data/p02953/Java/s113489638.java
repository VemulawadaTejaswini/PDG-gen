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
    int[] hi = new int[n];
    for (int i = 0; i < n; i++) {
      hi[i] = Integer.parseInt(sc.next());
    }
    boolean isOk = true;
    for (int i = 0; i < n - 1; i++) {
      int current = hi[i];
      int next = hi[i + 1];
      if (next > current) {
        next--;
      }
      if (current > next) {
        isOk = false;
        break;
      }
      hi[i + 1] = next;
    }
    if (isOk) {
      pw.println("Yes");
    } else {
      pw.println("No");
    }
  }
}
