import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
  }

  int h;
  int w;
  String s[];
  int[] bomb;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      h = sc.nextInt();
      w = sc.nextInt();
      s = new String[h];
      for (int i = 0; i < h; i++) s[i] = sc.next();
      bomb = new int[h * w];
    } finally {
      sc.close();
    }
  }

  void solve() {
    update();
    for (int y = 0; y < h; y++) {
      for (int x = 0; x < w; x++) {
        int k = bomb[y * w + x];
        System.out.print(k >= 0 ? k : "#");
      }
      System.out.println("");
    }
  }

  void update() {
    for (int y = 0; y < h; y++) {
      for (int x = 0; x < w; x++) {
        bomb[y * w + x] = bombNum(y, x);
      }
    }
  }
  
  int bombNum(int y, int x) {
    if (s[y].charAt(x) == '#') return -1;
    int ans = 0;
    for (int dy = -1; dy < 2; dy++) {
      for (int dx = -1; dx < 2; dx++) {
        if (y + dy < 0) continue;
        if (h <= y + dy) continue;
        if (x + dx < 0) continue;
        if (w <= x + dx) continue;

        if (s[y + dy].charAt(x + dx) == '#') ans++;
      }
    }
    return ans;
  }
}
