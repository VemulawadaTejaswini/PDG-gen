import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    Point[] x = new Point[N * 2];
    Point[] y = new Point[N * 2];

    for (int j = 0; j < 2; j++) {
      for (int i = 0; i < N; i++) {
        x[i + N * j] = new Point(scanner.nextInt(), j);
        y[i + N * j] = new Point(scanner.nextInt(), j);
      }
    }

    Arrays.sort(x);
    Arrays.sort(y);

    System.out.println(Math.min(count(x, N), count(y, N)));
  }

  private static int count(Point[] a, int N) {
    int count = 0;
    for(Point p : a) {
      if (p.type == 0) {
        count++;
      } else if (count > 0) {
        count--;
      }
    }
    return N - count;
  }

  private static class Point implements Comparable<Point> {
    final int pos;
    final int type;

    private Point(int pos, int type) {
      this.pos = pos;
      this.type = type;
    }

    @Override public int compareTo(Point o) {
      return pos - o.pos;
    }
  }
}
