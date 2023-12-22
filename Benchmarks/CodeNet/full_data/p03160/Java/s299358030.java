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

    dp[0] = 0;
    dp[1] = h[1] - h[0];

    for (int i = 2; i < N; i++) {
      int n1 = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
      int n2 = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
      dp[i] = Math.min(n1, n2);
    }

    System.out.println(dp[N - 1]);

  }
}