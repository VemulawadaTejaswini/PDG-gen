import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    long[][] dp = new long[N][N];
    for (int i = 0; i < N; i++) dp[i][i] = a[i];

    for (int k = 1; k < N; k++) {
      for (int i = 0; i < N - k; i++) {
        int j = i + k;
        dp[i][j] = Math.max(a[i] - dp[i + 1][j], a[j] - dp[i][j - 1]);
      }
    }
    System.out.println(dp[0][N - 1]);
  }
}
