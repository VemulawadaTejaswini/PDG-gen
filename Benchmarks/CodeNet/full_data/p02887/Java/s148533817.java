import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  int n;
  char s[];
  int ans;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      s = sc.next().toCharArray();
    } finally {
      sc.close();
    }
  }
  
  void solve() {
    char cur = s[0];
    ans++;
    for (int i = 1; i < n; i++) {
      if (cur != s[i]) {
        ans++;
        cur = s[i];
      }
    }
  }

  void show() {
    System.out.println(ans);
  }
}
