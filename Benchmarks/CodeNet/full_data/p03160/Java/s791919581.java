import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] x = new int[N+1];

    for (int i = 1; i < N+1; i++) {
      x[i] = sc.nextInt();
    }

    sc.close();

    int[] dp = new int[N+1];

    dp[0] = 0;
    dp[1] = 0;
    dp[2] = Math.abs(x[2] - x[1]);

    for (int i = 3; i < N+1; i++) {
      dp[i] = Math.min(dp[i-1] + Math.abs(x[i]-x[i-1]), dp[i-2] + Math.abs(x[i]-x[i-2]));
    }

    System.out.println(dp[N]);

  }

}