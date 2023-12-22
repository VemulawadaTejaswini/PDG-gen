
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int h = scanner.nextInt();
        final int w = scanner.nextInt();
        final int d = scanner.nextInt();

        final Map<Integer, Point> map = new HashMap<>();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                map.put(scanner.nextInt(), new Point(i, j));
            }
        }

        final int[][] movingMap = new int[h * w + 1][h * w + 1];
        for (int i = 1; i <= d; i++) {
            int tmp = 0;
            for (int j = i + d; j <= h * w; j += d) {
                final Point previousPoint = map.get(j - d);
                final Point currentPoint = map.get(j);
                tmp += Math.abs(previousPoint.x - currentPoint.x) + Math.abs(previousPoint.y - currentPoint.y);
                movingMap[i][j] = tmp;
            }
        }
        
        final int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            final int l = scanner.nextInt();
            final int r = scanner.nextInt();
            final int begin = l % d == 0 ? d : l % d;

            System.out.println(movingMap[begin][r] - movingMap[begin][l]);
        }
    }

    static class Point {
        final int x;
        final int y;

        Point(final int x, final int y) {
            this.x = x;
            this.y = y;
        }
    }
}
