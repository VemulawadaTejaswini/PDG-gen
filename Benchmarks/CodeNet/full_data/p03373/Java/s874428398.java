import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    long a = s.nextLong();
    long b = s.nextLong();
    long c = s.nextLong();  // 0.5a + 0.5b
    long x = s.nextLong();
    long y = s.nextLong();

    long minCost = Long.MAX_VALUE;
    for (int i = 0; i <= Math.max(x, y); i++) {
      long cost = i * (2 * c) + Math.max(x - i, 0) * a + Math.max(y - i, 0) * b;
      minCost = Math.min(minCost, cost);
    }
    System.out.println(minCost);
  }
}