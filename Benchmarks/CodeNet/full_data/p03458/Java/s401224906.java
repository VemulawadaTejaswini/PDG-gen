import java.util.Scanner;

public class Main {

  private static final int Black = 0;
  private static final int White = 1;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    int[] c = new int[N];

    final String BlackColor = "B";
    final int K2 = 2 * K;
    for (int i = 0; i < N; i++) {
      x[i] = scanner.nextInt() % K2;
      y[i] = scanner.nextInt() % K2;
      c[i] = BlackColor.equals(scanner.next()) ? Black : White;
    }
    new Main().execute(N, K, x, y, c);
  }

  public void execute(int N, int K, int[] x, int[] y, int[] c) {
    final int K2 = 2 * K;
    int maxDesires = 0;
    for (int i = 0; i < K2; i++) {
      for (int j = 0; j < K2; j++) {
        // Assumes cell (i,j) is black and bottom-left corner of (K,K) square
        int count = 0;
        for (int n = 0; n < N; n++) {
          if (c[n] == getColor(K, i, j, x[n], y[n])) {
            count++;
          }
        }

        if (maxDesires < count) {
          maxDesires = count;
        }
      }
    }

    System.out.println(maxDesires);
  }

  /**
   * Assume bottom-left black corner is (rootX, rootY), get color of cell (x,y)
   */
  public int getColor(int K, int rootX, int rootY, int x, int y) {
    int dx = x - rootX;
    int dy = y - rootY;
    if (dx < 0) {
      dx -= K - 1;
    }
    if (dy < 0) {
      dy -= K - 1;
    }

    return (dx / K + dy / K) % 2 == 0 ? Black : White;
  }

}
