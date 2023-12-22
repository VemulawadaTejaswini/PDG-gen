import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int K = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int sx = 1, sy = 1;
    if (x < 0) {
      sx = -1;
      x = -x;
    }
    if (y < 0) {
      sy = -1;
      y = -y;
    }
    List<Diff> diffs = new ArrayList<>();

    while (x + y > K * 2) {
      int dx, dy;
      if (y > K) {
        dx = 0;
        dy = -K;
      } else {
        dx = -K;
        dy = 0;
      }
      diffs.add(new Diff(dx, dy));
      x += dx;
      y += dy;
    }

    if (K % 2 == 0 && (x + y) % 2 != 0) {
      System.out.println(-1);
      return;
    }
    if (x + y == K) {
      System.out.println(1);
      System.out.printf("%d %d\n", sx * x, sy * y);
      return;
    }
    if (K % 2 != 0 && (x + y) % 2 != 0) {
      int dx, dy;
      if (x + y > K) {
        dy = -Math.min(y, K);
        dx = y + dy == 0 ? -(K - y) : 0;
      } else {
        dy = 0;
        dx = K;
      }
      diffs.add(new Diff(dx, dy));
      x += dx;
      y += dy;
    }

    int p, q;
    if (x > y) {
      p = (x - y) / 2;
      q = K - p;
    } else {
      q = (y - x) / 2;
      p = K - q;
    }
    diffs.add(new Diff(p - x, q - y));
    diffs.add(new Diff(-p, -q));

    Collections.reverse(diffs);
    long xx = 0;
    long yy = 0;
    StringBuilder sb = new StringBuilder();
    sb.append(diffs.size()).append('\n');
    for (Diff d : diffs) {
      xx += -sx * d.x;
      yy += -sy * d.y;
      sb.append(xx).append(' ').append(yy).append('\n');
    }
    System.out.print(sb.toString());
  }

  private static class Diff {
    private final int x;
    private final int y;

    private Diff(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
