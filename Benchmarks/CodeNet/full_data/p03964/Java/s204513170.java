import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] t = new long[N];
    long[] a = new long[N];
    for(int i = 0; i < N; i++) {
      t[i] = sc.nextLong();
      a[i] = sc.nextLong(); 
    }
    // i回目の投票時が(t[i]k,a[i]k)としたときのkの最小値
    long[] dp = new long[N];
    dp[0] = 1;
    for(int i = 1; i < N; i++) {
      BigDecimal t1 = new BigDecimal(t[i - 1] * dp[i - 1]);
      BigDecimal t2 = new BigDecimal(t[i]);
      BigDecimal a1 = new BigDecimal(a[i - 1] * dp[i - 1]);
      BigDecimal a2 = new BigDecimal(a[i]);
      long k1 = (long)Math.ceil((t1.divide(t2)).doubleValue());
      long k2 = (long)Math.ceil((a1.divide(a2)).doubleValue());
      dp[i] = Math.max(k1, k2);
    }
    System.out.println(dp[N - 1] * (t[N - 1] + a[N - 1]));
  }
}