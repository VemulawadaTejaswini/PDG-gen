import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] t = new int[N];
    int[] a = new int[N];
    for(int i = 0; i < N; i++) {
      t[i] = sc.nextInt();
      a[i] = sc.nextInt();
    }
    // dp[i]はi回目までの投票数の最小値を表す
    long[] dp = new long[N];
    dp[0] = t[0] + a[0];
    for(int i = 1; i < N; i++) {
      long tnum = (dp[i - 1] / (long)(t[i - 1] + a[i - 1])) * t[i - 1]);
      long anum = (dp[i - 1] / (long)(t[i - 1] + a[i - 1])) * a[i - 1]);
      long rate = Math.max((long)Math.ceil((double)tnum / (double)t[i]), (long)Math.ceil((double)anum / (double)a[i]));
      dp[i] = rate * (long)(t[i] + a[i]);
    }
    System.out.println(dp[N - 1]);
  }
}