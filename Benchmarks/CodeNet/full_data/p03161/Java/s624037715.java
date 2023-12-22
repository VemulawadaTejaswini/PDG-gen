import java.util.*;


class Main {
  public static void main(String[] args) {
    int n, k;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    
    int[] h = new int[n];
    while(int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    int[] dp = new int[n];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    dp[1] = h[0];
    for(int i = 1; i < n; i++) {
      for(int j = 1; j < k && i-j >= 0; j++) {
          dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i] - h[i-j]));
      }
    }
   System.out.println(dp[n-1]);
  }
}