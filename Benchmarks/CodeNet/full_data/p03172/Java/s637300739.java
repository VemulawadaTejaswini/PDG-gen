import java.util.*;
import java.io.*;

class Main {

  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int INF = (int) 1e9 + 7;

    int N = in.nextInt();
    int K = in.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
    }

    int[][] dp = new int[N + 1][K + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j <= K; j++) {
        int cur = 0;
        for (int take = Math.min(a[i - 1], j); take >= 0; take--) {
          cur += dp[i - 1][j - take];
          if (cur > INF) {cur -= INF;}
        }
        dp[i][j] = cur;
      }
    }
    

    System.out.println(dp[N][K]);
  }

}
