import java.util.*;

public class Main {
  private static int getCost(int[] as, int v) {
    int sum = 0;
    for (int a : as) {
      sum += (a - v)*(a - v);
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] as = new int[n];
    for (int i = 0; i < n; i++) {
      as[i] = s.nextInt();
    }
    int minimumCost = Integer.MAX_VALUE;
    for (int v = -100; v <= 100; v++) {
      minimumCost = Math.min(minimumCost, getCost(as, v));
    }
    System.out.println(minimumCost);
  }
}
