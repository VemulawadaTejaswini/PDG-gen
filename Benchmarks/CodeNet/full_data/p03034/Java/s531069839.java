import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] line = br.readLine().split(" ");

    long[] s = new long[N];
    for (int i = 0; i < N; i++) s[i] = Integer.parseInt(line[i]);

    long max = 0;
    for (int d = 1; d < N; d++) {
      long[] dp = new long[N + 1];
      int maxn = N - d;
      if ((N - 1) % d == 0) maxn = N / 2;
      for (int k = 1; k * d < maxn; k++) {
        dp[k] = dp[k - 1] + s[k * d] + s[N - 1 - k * d];
        max = Math.max(max, dp[k]);
      }
    }
    System.out.println(max);
  }
}
