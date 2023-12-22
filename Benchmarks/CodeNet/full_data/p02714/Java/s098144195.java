import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static final int R = 0;
  static final int G = 1;
  static final int B = 2;

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    String s = sc.next();
    int rgb[] = new int[n];
    long rCount = 0;
    long gCount = 0;
    long bCount = 0;
    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      if (c == 'R') {
        rgb[i] = R;
        rCount++;
      } else if (c == 'G') {
        rgb[i] = G;
        gCount++;
      } else if (c == 'B') {
        rgb[i] = B;
        bCount++;
      }
    }
    long condition1 = rCount * gCount * bCount;
    long ans = condition1;
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        int k = (j + 1) + (j + 1) - (i + 1) - 1;
        if (k >= n) {
          continue;
        }
        if (rgb[i] != rgb[j] && rgb[j] != rgb[k] && rgb[i] != rgb[k]) {
          ans--;
        }
      }
    }
    pw.println(ans);
  }
}
