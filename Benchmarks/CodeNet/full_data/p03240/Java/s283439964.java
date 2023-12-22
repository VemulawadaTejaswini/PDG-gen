import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] points = new int[N][3];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        points[i][j] = scanner.nextInt();
      }
    }

    for (int cx = 0; cx <= 100; cx++) {
      for (int cy = 0; cy <= 100; cy++) {
        int H = -1;
        boolean found = true;
        for (int i = 0; i < N; i++) {
          int[] pt = points[i];
          int x = pt[0] - cx;
          int y = pt[1] - cy;
          int h = pt[2];
          if (h == 0) continue;
          int hh = h + Math.abs(x) + Math.abs(y);
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
