import java.io.*;
import java.util.*;

public class Main {

  static int n;
  static int[] h;
  static int[] memo;

  public static int dp(int i) {
    if (i == n - 1) {
      return 0;
    }
    if (memo[i] != -1) {
      return memo[i];
    }
    if (i == n - 2) {
      return memo[i] = Math.abs(h[i] - h[i + 1] + dp(i + 1));
    } else {
      return memo[i] = Math.min(Math.abs(h[i] - h[i + 1] + dp(i + 1)), Math.abs(h[i] - h[i + 2] + dp(i + 2)));
    }

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    h = new int[n];
    for (int i = 0; i < n; i++)
      h[i] = sc.nextInt();
    memo = new int[n];
    Arrays.fill(memo, -1);
    System.out.println(dp(0));
  }
}