import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int H, W, K;

  public static void main(String[] args) {
    H = sc.nextInt();
    W = sc.nextInt();
    K = sc.nextInt();
    int[][] F = new int[H][W];
    for (int i = 0; i < H; i++) {
      char[] row = sc.next().toCharArray();
      for (int j = 0; j < W; j++) {
        F[i][j] = row[j] - '0';
      }
    }
    int ans = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        Board b = new Board(F);
        ans = Math.max(ans, b.simulate(i, j));
      }
    }
    System.out.println(ans);
  }

  static class Board {
    int[][] f;

    Board(int[][] o) {
      this.f = new int[H][];
      for (int i = 0; i < H; i++) {
        this.f[i] = o[i].clone();
      }
    }

    int simulate(int r, int c) {
      int score = 0;
      boolean[][] vanished = new boolean[H][W];
      vanished[r][c] = true;
      for (int i = 0; ; i++) {
        int sum = fall(vanished);
        if (i > 0) score += sum << (i - 1);
        if (!erase(vanished)) break;
      }
//      System.out.println(r + " " + c + " " + score);
      return score;
    }

    int fall(boolean[][] vanished) {
      int sum = 0;
      for (int i = 0; i < W; i++) {
        int to = H - 1;
        for (int j = H - 1; j >= 0; j--) {
          if (vanished[j][i]) {
            sum += f[j][i];
            continue;
          }
          f[to--][i] = f[j][i];
        }
        for (int j = to; j >= 0; j--) {
          f[j][i] = -1;
        }
      }
      return sum;
    }

    boolean erase(boolean[][] vanished) {
      boolean any = false;
      for (int i = 0; i < H; i++) {
        Arrays.fill(vanished[i], false);
        int start = 0;
        for (int j = 1; j < W; j++) {
          if (f[i][j] != f[i][j - 1] || f[i][j] == -1) {
            start = j;
          } else {
            if (j - start + 1 >= K) {
              for (int k = start; k <= j; k++) {
                vanished[i][k] = true;
                any = true;
              }
            }
          }
        }
      }

      return any;
    }

  }

}
