import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = in.nextInt();
    }
    final Solver solve = new Solver();
    System.out.println(solve.solve(h));
  }
}

class Solver {
  public int solve(int[] h) {
    int n = h.length;
    int[] dp = new int[n + 1];
    dp[1] = 0;
    dp[2] = Math.abs(h[1] - h[0]);
    for (int i = 3; i <= n; i++) {
      dp[i] = Math.min(Math.abs(h[i-1]-h[i-2])+dp[i-1], Math.abs(h[i-1]-h[i-3])+dp[i-2]);
    }
    return dp[n];
  }
}