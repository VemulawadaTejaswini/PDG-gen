import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int maxn = 101;
    int maxv = 1001;
    Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
    int W = sc.nextInt();
    long[] dp = new long[maxn * maxv];
    int[] w = new int[maxn];
    int[] v = new int[maxn];
    for (int i = 0; i < N; i++) {
		    w[i] = sc.nextInt();
      	v[i] = sc.nextInt();
    }
    Arrays.fill(dp,(1L << 50));
    dp[0] = 0;
    for (int i = 0; i < N; i++) {
      for (int j = maxn * maxv - 1; j >= v[i]; j--) {
      	dp[j] = Math.min(dp[j],dp[j - v[i]] + w[i]);
      }
    }
    for (int i = maxn * maxv - 1; i >= 0; i--) {
      if (dp[i] <= W) {
        System.out.println(i);
        return;
      }
    }
  }
}