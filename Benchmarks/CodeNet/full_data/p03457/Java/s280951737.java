import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] t = new int[n + 1];
    int[] x = new int[n + 1];
    int[] y = new int[n + 1];

    t[0] = x[0] = y[0] = 0;
    for (int i = 1; i <= n; i++) {
      t[i] = scanner.nextInt();
      x[i] = scanner.nextInt();
      y[i] = scanner.nextInt();
    }

    new Main().execute(n, t, x, y);
  }

  public void execute(int n, int[] t, int[] x, int[] y) {
    for (int i = 1; i <= n; i++) {
      int step = t[i] - t[i - 1];

      if (!canWalk(step, x[i - 1], y[i - 1], x[i], y[i])) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");
  }

  /**
   * Can we walk from (startX, startY) to (endX, endY) in `stepCount` steps
   */
  private boolean canWalk(int stepCount, int startX, int startY, int endX, int endY) {
    int minStep = Math.abs(endX - startX) + Math.abs(endY - startY);
    return (stepCount >= minStep) &&
        ((stepCount - minStep) % 2 == 0);
  }
}
