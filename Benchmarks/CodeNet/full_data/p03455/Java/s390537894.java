import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] t = new int[n];
    int[] x = new int[n];
    int[] y = new int[n];
    for (int i = 0; i < n; i++) {
      t[i] = scanner.nextInt();
      x[i] = scanner.nextInt();
      y[i] = scanner.nextInt();
    }

    new Main().execute(n, t, x, y);
  }

  public void execute(int n, int[] t, int[] x, int[] y) {
    int startX = 0;
    int startY = 0;
    int step = 0;
    for (int i = 0; i < n; i++) {
      step = t[i] - step;

      if (!canWalk(step, startX, startY, x[i], y[i])) {
        System.out.println("No");
        return;
      }

      startX = x[i];
      startY = y[i];
    }

    System.out.println("Yes");
  }

  /**
   * Can we walk from (startX, startY) to (endX, endY) in `stepCount` steps
   */
  private boolean canWalk(int stepCount, int startX, int startY, int endX, int endY) {
    int minStep = Math.abs(endX - startX) + Math.abs(endY - startY);
    return (stepCount >= minStep) &&
        (stepCount % 2 == minStep % 2);
  }
}
