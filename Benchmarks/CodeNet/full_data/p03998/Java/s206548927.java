import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    String[] abc = new String[]{a, b, c};

    int t = 0;
    for (; ; ) {
      String e = abc[t];
      if (e.length() == 0) {
        break;
      }
      int next = abc[t].charAt(0) - 'a';
      abc[t] = abc[t].substring(1);
      t = next;
    }
    System.out.println(new String[]{"A", "B", "C"}[t]);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}