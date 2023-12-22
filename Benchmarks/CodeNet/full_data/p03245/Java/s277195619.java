import static java.lang.Math.*;

import java.util.*;

public class Main {
    int dx[] = { 0, 1, 0, -1 };
    int dy[] = { 1, 0, -1, 0 };
    char dr[] = "DLUR".toCharArray();

    private class Point {
        long x, y, len;
        boolean isOdd;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.len = abs(x) + abs(y);
            this.isOdd = (x + y) % 2 == 0;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        Point p[] = new Point[n];
        BitSet bs = new BitSet();
        long max = 0;

        for (int i = 0; i < n; i++) {
            p[i] = new Point(sc.nextInt(), sc.nextInt());
            if (p[i].isOdd) {
                bs.set(i);
            }
            max = max(max, p[i].len);
        }
        sc.close();

        if (bs.cardinality() > 0 && bs.cardinality() < n) {
            System.out.println(-1);
            return;
        }

        boolean isOdd = bs.cardinality() == n;
        if (isOdd) {
            for (int i = 0; i < n; i++) {
                p[i].x--;
            }
        }

        int m = 0;
        for (; max > 0; m++) {
            max /= 2;
        }
        long l[] = new long[m];
        for (int i = 0; i < m; i++) {
            l[i] = 1L << i;
        }
        System.out.println(m + (isOdd ? 1 : 0));
        System.out.println((isOdd ? "1 " : "") + Arrays.toString(l).replaceAll("[^0-9 ]+", ""));

        for (int i = 0; i < n; i++) {
            char move[] = new char[m];
            long nx = p[i].x;
            long ny = p[i].y;

            for (int j = m - 1; j >= 0; j--) {
                for (int k = 0; k < 4; k++) {
                    if (check(nx + l[j] * dx[k], ny + l[j] * dy[k], l[j])) {
                        nx += l[j] * dx[k];
                        ny += l[j] * dy[k];
                        move[j] = dr[k];
                        break;
                    }
                }
            }

            if (isOdd) {
                System.out.print("R");
            }
            System.out.println(new String(move));
        }
    }

    private boolean check(long x, long y, long range) {
        return abs(x) + abs(y) <= (range - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
