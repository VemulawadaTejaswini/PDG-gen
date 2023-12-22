import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = br.readLine().split(" ");
    long[] a = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = Long.parseLong(line[i]);
    }
    int k = 1 + (n%2);
    long[][] dp = new long[n + 1][k + 2];
    for(int i = 0; i <= n; i++){
      Arrays.fill(dp[i], Long.MIN_VALUE);
    }
    dp[0][0] = 0;

    for(int i = 0; i < n; i++){
      for(int j = 0; j <= k; j++){
        dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j]);
        long temp = dp[i][j];
        if((i + j) % 2 == 0 && i >= j) {
          temp += a[i];
        }
        dp[i + 1][j] = Math.max(dp[i + 1][j], temp);
      }
    }
    System.out.println(dp[n][k]);
  }
}
