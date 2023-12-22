import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Ball[] balls = new Ball[N];
    for (int i = 0; i < N; i++) balls[i] = new Ball(scanner.nextInt(), scanner.nextInt());
    Arrays.sort(balls, (b1, b2) -> {
      if (b1.x == b2.x) return b1.y - b2.y;
      return b1.x - b2.x;
    });

    Set<Pair> pqSet = new HashSet<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i == j) continue;
        pqSet.add(new Pair(balls[j].x - balls[i].x, balls[j].y - balls[i].y));
      }
    }
    int min = N;
    for (Pair pq : pqSet) {
      Set<Ball> set = new LinkedHashSet<>(Arrays.asList(balls));
      int cost = 0;
      Ball next = null;
      while (!set.isEmpty()) {
        if (next == null || !set.contains(next)) {
          cost++;
          Ball b = set.stream().findFirst().get();
          set.remove(b);
          next = new Ball(b.x + pq.p, b.y + pq.q);
        } else {
          set.remove(next);
          next = new Ball(next.x + pq.p, next.y + pq.q);
        }
      }
      min = Math.min(min, cost);
    }
    System.out.println(min);
  }

  private static class Pair {
    private final int p;
    private final int q;

    private Pair(int p, int q) {
      this.p = p;
      this.q = q;
    }

    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Pair pair = (Pair) o;
      return p == pair.p &&
          q == pair.q;
    }

    @Override public int hashCode() {
      return Objects.hash(p, q);
    }
  }

  private static class Ball {
    private final int x;
    private final int y;

    private Ball(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Ball ball = (Ball) o;
      return x == ball.x &&
          y == ball.y;
    }

    @Override public int hashCode() {
      return Objects.hash(x, y);
    }
  }
}
