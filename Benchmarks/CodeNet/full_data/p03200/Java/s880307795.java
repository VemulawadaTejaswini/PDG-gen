import java.util.*;
import java.io.*;

class Main {
  int N, ans;
  char[] s;
  public static void main(String[] args) {
    Main m = new Main();
    m.input();
    m.solve();
    m.out();
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine().toCharArray();
    sc.close();
  }

  public void solve() {
    N = s.length;
    int count = 0;
    ans = 0;
    for (int i = N-1; i >= 0; i--) {
      char target = s[i];
      if (target == 'W') {
        count++;
      } else if (target == 'B') {
        ans += count;
      }
    }
  }

  public void out() {
    System.out.println(ans);
  }
}
