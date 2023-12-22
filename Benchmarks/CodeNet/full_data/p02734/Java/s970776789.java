import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/abc159/submissions/11120535
public class Main {
  static final long MOD = 998_244_353;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int S = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    long ans = 0;
    long[][] dp = new long[2][S + 1]; // dp[pre,cur][S]:= f(L,R) when A_i is used or not.
    for (int i = 0; i < N; i++) {
      // Case when A[i] is not used. This is a seed scaffold.
      dp[0][0] += 1;
      dp[1][0] += 1;

      for (int j = A[i]; j <= S; j++) {
        dp[1][j] += dp[0][j - A[i]];
        dp[1][j] %= MOD;
      }
      ans += dp[1][S];
      dp[0] = Arrays.copyOf(dp[1], dp[1].length);
    }
    System.out.println(ans);
  }
}
