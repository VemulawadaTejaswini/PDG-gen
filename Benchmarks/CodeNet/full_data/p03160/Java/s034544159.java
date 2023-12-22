import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    if (n == 0) {
      	System.out.println(0);
    	return;
    }
    int[] h = new int[n];
    int[] dp = new int[n];

    for (int i = 0; i < n; i++) {
      h[i] = scan.nextInt();
    }

    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    scan.close();

	for (int i = 1; i < n; i++) {
      for (int j = 1; j <= 2; j++) {
        if (i - j < 0) continue;
        int currentCost = Math.abs(h[i] - h[i-j]);
        dp[i] = Math.min(dp[i], dp[i - j] + currentCost);
      }
    }

    System.out.println(dp[dp.length - 1]);
  }
}