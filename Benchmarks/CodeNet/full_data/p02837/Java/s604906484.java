import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    List<Statement>[] statements = new List[N];
    for (int i = 0; i < N; i++) statements[i] = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      for (int j = 0; j < a; j++) {
        int x = scanner.nextInt() - 1;
        int h = scanner.nextInt();
        statements[i].add(new Statement(x, h == 1));
      }
    }

    int max = 0;
    for (int i = 0; i < 1 << N; i++) if (possible(i, N, statements)) max = Math.max(max, Integer.bitCount(i));
    System.out.println(max);
  }

  private static boolean possible(int a, int N, List<Statement>[] statements) {
    for (int i = 0; i < N; i++) {
      if ((1 & (a >> i)) == 1) {
        for (Statement s : statements[i]) {
          if (s.h && (1 & (a >> s.x)) != 1) return false;
          if (!s.h && (1 & (a >> s.x)) != 0) return false;
        }
      }
    }
    return true;
  }

  private static class Statement {
    private final int x;
    private final boolean h;

    private Statement(int x, boolean h) {
      this.x = x;
      this.h = h;
    }
  }
}
