import java.util.Scanner;

public class Main {
  private static void solve(int n, int[] m) {
    int[] sum = new int[n];
    for (int i = 0; i < n; i++) {
      sum[i] =  m[i] + (i > 0 ? sum[i - 1] : 0);
    }
    int minDiff = Integer.MAX_VALUE;
    for (int i = 1; i < n - 1; i++) {
      minDiff = Math.min(
        minDiff,
        Math.abs(sum[n - 1] - 2 * sum[i]));
    }
    System.out.println(minDiff);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] ms = sc.nextLine().split(" ");
    int[] m = new int[n];
    for (int i = 0; i < n; i++) m[i] = Integer.parseInt(ms[i]);
    solve(n, m);
  }
}
