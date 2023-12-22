import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    String str = sc.next();
    for (char c = 'a'; c <= 'z'; ++c) {
      int idx = 0;
      while ((idx = str.indexOf(c, idx)) != -1) {
        if (idx + 2 < str.length()) {
          char d = str.charAt(idx + 2);
          char e = str.charAt(idx + 1);
          if (c == d && c != e) {
            ++idx;
            System.out.println(idx + " " + (idx + 2));
            return;
          }
        }
        ++idx;
      }
      String sub = "" + c + c;
      idx = 0;
      while ((idx = str.indexOf(sub, idx)) != -1) {
        if (idx + 2 < str.length()) {
          char d = str.charAt(idx + 2);
          if (c != d) {
            ++idx;
            System.out.println(idx + " " + (idx + 2));
            return;
          }
        }
        if (0 <= idx - 1) {
          char d = str.charAt(idx - 1);
          if (c != d) {
            System.out.println((idx - 1) + " " + (idx + 1));
            return;
          }
        }
        ++idx;
      }
    }

    System.out.println(-1 + " " + -1);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}