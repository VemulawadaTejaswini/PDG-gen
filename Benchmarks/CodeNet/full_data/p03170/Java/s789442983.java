
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(solve(arr, N, K));
  }

  private static String solve(int[] arr, int n, int k) {
    String ans = "";
    boolean[] dp = new boolean[k + 1];
    for (int i = 0; i <=k; i++) {
      for (int j = 0; j < n; j++) {
        if (i >= arr[j] && !dp[i - arr[j]]) {
          dp[i] = true;
        }
      }
    }
    ans = dp[k] ? "First" : "Second";
    return ans;
  }
}
