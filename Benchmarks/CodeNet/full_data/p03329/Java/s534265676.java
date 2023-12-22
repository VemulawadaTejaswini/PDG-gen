import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    int[] dp = new int[100001];
    
    dp[0] = 0;

    for (int i = 1; i <= 100000; i++) {

      dp[i] = i;

      int cost = 1;

      while (cost <= i && 6 <= i) {
        dp[i] = Math.min(dp[i],dp[i-cost]+1);
        cost *= 6;
      }

      cost = 1;

      while (cost <= i && 9 <= i) {
        dp[i] = Math.min(dp[i],dp[i-cost]+1);
        cost *= 9;
      }

    }

    System.out.println(dp[N]);

  }

}