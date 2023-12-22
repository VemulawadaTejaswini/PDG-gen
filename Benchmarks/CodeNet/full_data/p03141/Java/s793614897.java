import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Pair[] dishes = new Pair[N];
    for (int i = 0; i < N; i++) dishes[i] = new Pair(scanner.nextInt(), scanner.nextInt());

    Arrays.sort(dishes, (p1, p2) -> p2.a + p2.b - p1.a - p1.b);

    long score = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) score += dishes[i].a;
      else score -= dishes[i].b;
    }
    System.out.println(score);
  }

  private static class Pair {
    public final int a;
    public final int b;

    private Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}
