import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    Integer[] A = new Integer[N]; // cost digest
    int[] F = new int[N]; // uneasiness
    PriorityQueue<Cost> cost = new PriorityQueue<>((c1, c2) -> c2.cost - c1.cost);
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      F[i] = sc.nextInt();
    }

    Arrays.sort(A, (a, b) -> b - a);
    Arrays.sort(F);
    for (int i = 0; i < N; i++) {
      Cost c = new Cost(A[i], F[i]);
      if (c.cost == 0) continue;
      cost.add(c);
    }
    while (K-- > 0 && !cost.isEmpty()) {
      Cost c = cost.poll();
      c.cost -= c.f;
      if (c.cost == 0) continue;
      cost.add(c);
    }
    if (cost.isEmpty()) {
      System.out.println(0);
    } else {
      System.out.println(cost.poll().cost);
    }
  }

  static class Cost {
    int cost, a, f;

    Cost(int a, int f) {
      cost = a * f;
      this.a = a;
      this.f = f;
    }
  }
}
