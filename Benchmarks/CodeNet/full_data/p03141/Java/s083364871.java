import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    PriorityQueue<Dish> q = new PriorityQueue<>((a, b)->b.sum-a.sum);
    for (int i= 0; i < N; i++) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      q.offer(new Dish(A, B));
    }
    int t = 0;
    long ans = 0;
    while (!q.isEmpty()) {
      Dish d = q.poll();
      if (t%2 == 0) {
        ans += d.a;
      } else {
        ans -= d.b;
      }
      t++;
    }
    
    System.out.println(ans);
  }
  private static class Dish {
    final int a;
    final int b;
    final int sum;
    Dish(int a, int b) {
      this.a = a;
      this.b = b;
      this.sum = a+b;
    }
  }
}