import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N];
    int counter = 0;

    while (sc.hasNextInt()) {
      h[counter] = sc.nextInt();
      counter++;
    }

    int[] dp = new int[N];

    for (int i = 0; i < N; i++) {
      dp[i] = Integer.MAX_VALUE;
    }

    dp[0] = 0;

    for (int i = 1; i < N; i++) {
      dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]));
      if (i > 1) {
        dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
      }
    }

    System.out.println(dp[N - 1]);

  }
}