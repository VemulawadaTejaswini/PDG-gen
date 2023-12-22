import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Ball[] balls = new Ball[N];
    for (int i = 0; i < N; i++) balls[i] = new Ball(scanner.nextInt(), scanner.nextInt());

    Map<Pair, Integer> freq = new HashMap<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i == j) continue;
        Pair p = new Pair(balls[j].x - balls[i].x, balls[j].y - balls[i].y);
        freq.put(p, freq.getOrDefault(p, 0) + 1);
      }
    }
    int max = freq.values().stream().max(Comparator.comparingInt(i -> i)).orElse(0);
    System.out.println(N - max);
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
  }
}
