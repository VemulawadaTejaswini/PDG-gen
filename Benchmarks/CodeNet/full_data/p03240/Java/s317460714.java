import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] points = new int[N][3];
    int[] max = new int[]{0, 0, -1};
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        points[i][j] = scanner.nextInt();
        if (points[i][2] > max[2]) {
          max = points[i];
        }
      }
    }

    for (int cxx = max[0]; cxx <= max[0] + 100; cxx++) {
      int cx = cxx;
      if (cx > 100) cx -= 101;
      for (int cyy = max[1]; cyy <= max[1] + 100; cyy++) {
        int cy = cyy;
        if (cy > 100) cy -= 101;
        int H = -1;
        boolean found = true;
        for (int i = 0; i < N; i++) {
          int[] pt = points[i];
          int x = pt[0] - cx;
          int y = pt[1] - cy;
          int h = pt[2];
          if (h == 0) continue;
          final int hh = h + Math.abs(x) + Math.abs(y);
          if (H < 0) {
            H = hh;
          } else if (H != hh) {
            found = false;
            break;
          }
        }
        if (found) {
          System.out.printf("%d %d %d\n", cx, cy, H);
          return;
        }
      }
    }
  }
}
