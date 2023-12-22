import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    String str = sc.nextLine();
    String ans = "CODEFESTIVAL2016";
    int cnt = 0;
    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) != ans.charAt(i)) {
        ++cnt;
      }
    }
    System.out.println(cnt);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}