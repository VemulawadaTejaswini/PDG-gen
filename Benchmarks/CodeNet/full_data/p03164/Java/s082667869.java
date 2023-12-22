import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
    int W = sc.nextInt();
    long[] dp = new long[N * 1000];
    int[] w = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
		    w[i] = sc.nextInt();
      	v[i] = sc.nextInt();
    }
    Arrays.fill(dp,(1 << 50));
    dp[0] = 0;
    for (int i = 0; i < N; i++) {
      for (int j = N * 1000 - 1; j > v[i] - 1; j--) {
      	dp[j] = dp[j - v[i]] + w[i];
      }
    }
    for (int i = N * 1000 - 1; i >= 0; i--) {
      if (dp[i] <= W) {
        System.out.println(i);
        return;
      }
    }
  }
}