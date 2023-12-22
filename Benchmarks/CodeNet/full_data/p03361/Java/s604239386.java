import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String[][] S = new String[H][W];
    for (int i = 0; i < H; ++i) {
      String s = sc.next();
      S[i] = s.split("");
    }
    sc.close();
    // マスに黒予定が2つ隣接していないとNG
    // 時計回り
    int dy[] = { -1, 0, 1, 0 };
    int dx[] = { 0, 1, 0, -1 };
    for (int i = 0; i < H; ++i) {
      for (int j = 0; j < W; ++j) {
        int cnt = 0;
        for (int k = 0; k < 4; ++k) {
          int ny = i + dy[k];
          int nx = j + dx[k];
          if (ny < 0 || nx < 0 || ny >= H || nx >= W) {
            continue;
          }
          if (S[ny][nx].equals("#")) {
            ++cnt;
          }
        }
        if (S[i][j].equals("#") && cnt == 0) {
          System.out.println("No");
          System.exit(0);
        }
      }
    }
    System.out.println("Yes");
  }
}