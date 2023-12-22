import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int k = Integer.parseInt(scanner.next());
    int a, cost, di;
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = Integer.parseInt(scanner.next());
    }
    int dp[] = new int[n];
    dp[0] = 0;
    dp[1] = Math.abs(h[1] - h[0]);
    for (int i=2; i < n; i++) {
      a = Math.min(i, k);
      di = (int) Math.pow(10, 10);
      for (int j = 1; j < a+1; j++) {
        cost = dp[i-j] + Math.abs(h[i-j]-h[i]);
        if (di > cost) {
          di = cost;
        }
      }
      dp[i] = di;
    }
    System.out.println(dp[n-1]);
  }
}
