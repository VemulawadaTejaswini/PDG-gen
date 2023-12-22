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
    int n = sc.nextInt();
    int k = sc.nextInt();
    int r = sc.nextInt(); // pattern 0
    int s = sc.nextInt(); // pattern 1
    int p = sc.nextInt(); // pattern 2
    
    String t = sc.next();
    
    long ans = 0;
    for (int i = 0; i < k; i++) {
      char lastUsing = '*';
      for (int j = i; j < n; j += k) {
        char c = t.charAt(j);
        if (c == 'r') {
          if (lastUsing != 'p') {
            ans += p; // p wins against r
            lastUsing = 'p';
          } else {
            lastUsing = '*';
          }
        } else if (c == 's') {
          if (lastUsing != 'r') {
            ans += r; // r wins against s
            lastUsing = 'r';
          } else {
            lastUsing = '*';
          }
        } else if (c == 'p') {
          if (lastUsing != 's') {
            ans += s; // s wins against p
            lastUsing = 's';
          } else {
            lastUsing = '*';
          }
        }
      }
    }
    os.println(ans);
  }
}