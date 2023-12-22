import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    int[] array = new int[N];
    for (int i=0; i<N; i++) {
      int n = sc.nextInt();
      array[i] = n;
    }
    int[] dp = new int[N];
    dp[1] = Math.abs(array[0] - array[1]);
    for (int i=2; i<N; i++) {
      dp[i] = Math.min(dp[i-2] + Math.abs(array[i-2]-array[i]), dp[i-1] + Math.abs(array[i-1]-array[i]));
    }
    System.out.println(dp[N-1]);
  }
}