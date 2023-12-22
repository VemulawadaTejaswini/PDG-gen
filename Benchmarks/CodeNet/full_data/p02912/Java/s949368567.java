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
    int[] an = new int[n];
    for (int i = 0; i < n; i++) {
      an[i] = Integer.parseInt(sc.next());
    }
    while (m > 0) {
      Arrays.sort(an);
      int a = an[n - 1];
      int halfA = a / 2;
      an[n - 1] = halfA;
      m--;
      if (m == 0) {
        break;
      }
      for (int i = n - 2; i >= 0 && an[i] > halfA; i--) {
        an[i] /= 2;
        m--;
        if (m == 0) {
          break;
        }
      }
    }
    pw.println(Arrays.stream(an).mapToLong(i -> i).sum());
  }
}
