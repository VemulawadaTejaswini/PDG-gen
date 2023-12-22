import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();

    tx -= sx;
    sx = 0;
    ty -= sy;
    sy = 0;

    String ans = "";

    ans += "L";
    for (int i = 0; i < ty + 1; i++) {
      ans += "U";
    }
    for (int i = 0; i < tx + 1; i++) {
      ans += "R";
    }
    ans += "D";

    for (int i = 0; i < tx; i++) {
      ans += "L";
    }
    for (int i = 0; i < ty; i++) {
      ans += "D";
    }

    for (int i = 0; i < tx; i++) {
      ans += "R";
    }
    for (int i = 0; i < ty; i++) {
      ans += "U";
    }

    ans += "R";
    for (int i = 0; i < ty + 1; i++) {
      ans += "D";
    }
    for (int i = 0; i < tx + 1; i++) {
      ans += "L";
    }
    ans += "U";

    os.println(ans);
  }
}
