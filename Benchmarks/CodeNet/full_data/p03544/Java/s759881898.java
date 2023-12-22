import java.util.*;

public class Main {
  static long[] dp;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    dp = new long[N + 1];
    for(int i = 0; i <= N; i++) {
      dp[i] = -1;
    }
    System.out.println(searchLucas(N));
  }
  
  public static long searchLucas(int k) {
    if(k == 0) {
      dp[k] = 2;
    } else if(k == 1) {
      dp[k] = 1;
    }
    if(dp[k] != -1) {
      return dp[k];
    } else {
      return dp[k] = searchLucas(k-1) + searchLucas(k-2);
    }
  }
}
