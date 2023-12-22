import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  int n;
  char s[];
  Deque<Integer> deq = new ArrayDeque<Integer>();
  int ans;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      s = sc.next().toCharArray();
      n = s.length;
    } finally {
      sc.close();
    }
  }
  
  void solve() {
    for (int i = 0; i < n; i++) {
      // System.out.println(s[i]);
      if (s[i] == '0') append(0);
      if (s[i] == '1') append(1);
      if (s[i] == 'B') delete();
    }
  }

  void append(int a) {
    deq.addLast(a);
  }

  void delete() {
    if (deq.size() > 0) deq.removeLast();
  }

  void show() {
    while (deq.size() > 0) {
      ans = deq.pollFirst();
      System.out.print(ans);
    }
    System.out.println("");
  }
}
