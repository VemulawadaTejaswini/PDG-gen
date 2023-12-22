import java.util.*;

public class Main {
  public static int H;
  public static int W;
  public static char[][] S;
  public static boolean[][] used;
  public static int black;
  public static int white;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    S = new char[H][W];
    used = new boolean[H][W];
    for (int i = 0; i < H; i++) {
      S[i] = sc.next().toCharArray();
    }
    for (int i = 0; i < H; i++) {
      Arrays.fill(used[i], false);
    }
    long ans = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        black = 0;
        white = 0;
        if (!used[i][j]) {
          dfs(i, j);
        }
        ans += black * white;
      }
    }
    System.out.println(ans);
  }

  public static void dfs(int i, int j) {
    if (used[i][j]) {
      return;
    }
    if (S[i][j] == '#') {
      black++;
    } else {
      white++;
    }
    used[i][j] = true;
    int[] dy = { -1, 0, 0, 1 };
    int[] dx = { 0, -1, 1, 0 };
    for (int d = 0; d < 4; d++) {
      int sy = i + dy[d];
      int sx = j + dx[d];
      if (0 <= sy && 0 <= sx && sy < H && sx < W) {
        if (S[i][j] != S[sy][sx] && !used[sy][sx]) {
          dfs(sy, sx);
        }
      }
    }
  }
}