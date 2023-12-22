import java.io.*;
import java.util.*;

public class Main {
  static int MOD = 1000000007;
  static double EPS = 1e-9;

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(in.readLine());

    int H = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    int[][] dp = new int[H][W];

    dp[H - 1][W - 1] = 1;
    for (int i = H - 1; i >= 0 ; i--) {
      for (int j = W - 1; j >= 0 ; j--) {
        if (dp[i][j] > 0)
          continue;
        if (i < A && j > W - B - 1) {
          continue;
        }
        if (i + 1 < H) {
          dp[i][j] += (dp[i + 1][j] % MOD);
        }
        if (j + 1 < W) {
          dp[i][j] += (dp[i][j + 1] % MOD);
        }
      }
    }

    System.out.println(dp[0][0]);

    in.close();
  }
}