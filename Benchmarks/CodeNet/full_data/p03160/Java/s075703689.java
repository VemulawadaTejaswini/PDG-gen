import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N];
    for (int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }
    long[] cost = new long[N];
    cost[0] = 0;
    cost[1] = Math.abs(h[1] - h[0]);
    for (int i = 2; i < N; i++) {
      cost[i] = Math.min(cost[i - 2] + Math.abs(h[i] - h[i - 2]), cost[i - 1] + Math.abs(h[i] - h[i - 1]));
    }
    System.out.println(cost[N - 1]);
  }
}