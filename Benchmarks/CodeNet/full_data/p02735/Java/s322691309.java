import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] map = new char[H][W];
    for (int i = 0; i < H; i++) map[i] = scanner.next().toCharArray();
    int[][] dp = new int[H][W];
    dp[0][0] = map[0][0] == '#' ? 1 : 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (i == 0 && j == 0) continue;
        int cost1;
        int cost2;
        if (i > 0) {
          cost1 = dp[i - 1][j];
          if (map[i - 1][j] == '.' && map[i][j] == '#') cost1++;
        } else {
          cost1 = 100000;
        }
        if (j > 0) {
          cost2 = dp[i][j - 1];
          if (map[i][j - 1] == '.' && map[i][j] == '#') cost2++;
        } else {
          cost2 = 100000;
        }
        dp[i][j] = Math.min(cost1, cost2);
      }
    }
    System.out.println(dp[H - 1][W - 1]);
  }
}
