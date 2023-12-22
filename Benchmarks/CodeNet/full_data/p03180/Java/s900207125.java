import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] a = new int[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) a[i][j] = scanner.nextInt();

    long[] dp = new long[1 << N];
    for (int i = 1; i < (1 << N); i++) {
      int msb = msb(i);
      dp[i] = dp[i ^ (1 << msb)];

      int k = i;
      int j = 0;
      while (k > 0) {
        if (k % 2 == 1) {
          dp[i] += a[msb][j];
        }
        k /= 2;
        j++;
      }
    }

    for (int i = 1; i < (1 << N); i++) {
      for (int j = i; j > 0; j = (j - 1) & i) {
        dp[i] = Math.max(dp[i], dp[j] + dp[i ^ j]);
      }
    }

    long max = 0;
    for (int i = 0; i < (1 << N); i++) {
      max = Math.max(max, dp[i]);
    }
    System.out.println(max);
  }

  private static int msb(int n) {
    int i = -1;
    while (n > 0) {
      n /= 2;
      i++;
    }
    return i;
  }
}
