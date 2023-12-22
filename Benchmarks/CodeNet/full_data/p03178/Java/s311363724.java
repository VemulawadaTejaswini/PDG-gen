import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int d = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    int len = n.length();
    long[][][] dp = new long[len][2][d];
    int first = Integer.parseInt(String.valueOf(n.charAt(0)));
    for(int i = 0; i < first; i++) {
      dp[0][1][(i % d)]++; 
    }
    first %= d;
    dp[0][0][first] = 1;
    int sum = first;
    for(int i = 1; i < len; i++) {
      int k = Integer.parseInt(String.valueOf(n.charAt(i)));
      int s = sum;
      sum = (sum + k) % d;
      dp[i][0][sum] = 1;
      for(int j = 0; j < k; j++) {
        dp[i][1][(s + j) % d] = (dp[i][1][(s + j) % d] + dp[i - 1][0][s]) % MOD;
      }
      for(int j = 0; j < 10; j++) {
        for(int l = 0; l < d; l++) {
          dp[i][1][(l + j) % d] = (dp[i][1][(l + j) % d] + dp[i - 1][1][l]) % MOD;
        }
      }
    }
    System.out.println((dp[len - 1][0][0] + dp[len - 1][1][0] - 1) % MOD);
  }
}