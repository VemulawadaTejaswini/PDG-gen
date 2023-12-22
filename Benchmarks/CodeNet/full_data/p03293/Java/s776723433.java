import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    String S = sc.next();
    String T = sc.next();

    int size = S.length();
    boolean flg = false;
    for (int i = 0; i < size; i++) {
      String tmps = S.substring(0, size - i);
      String tmpt = T.substring(i);
      if (!tmps.equals(tmpt)) {
        continue;
      }

      String tmps2 = S.substring(size - i);
      String tmpt2 = T.substring(0, i);
      if (!tmps2.equals(tmpt2)) {
        continue;
      }
      flg = true;
      break;
    }

    if (flg) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
