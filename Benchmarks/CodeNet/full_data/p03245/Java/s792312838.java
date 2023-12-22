import java.util.*;

public class Main {
    int dx[] = { 0, 1, 0, -1 };
    int dy[] = { 1, 0, -1, 0 };
    char dr[] = "DLUR".toCharArray();

    private class Point {
        long x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean isOdd() {
            return (x + y) % 2 == 0;
        }

        public long dist() {
            return Math.abs(x) + Math.abs(y);
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        Point p[] = new Point[n];
        BitSet bs = new BitSet();
        long max = 0;

        for (int i = 0; i < n; i++) {
            p[i] = new Point(sc.nextInt(), sc.nextInt());
            if (p[i].isOdd()) {
                bs.set(i);
            }
            max = Math.max(max, p[i].dist());
        }
        sc.close();

        if (bs.cardinality() > 0 && bs.cardinality() < n) {
            System.out.println(-1);
            return;
        }

        boolean isOdd = bs.cardinality() == n;

        int m = 0;
        for (; max > 1 << m; m++) {
        }
        long l[] = new long[m + 1];
        for (int i = 0; i < m; i++) {
            l[i + 1] = 1L << i;
        }

        if (isOdd) {
            for (int i = 0; i < n; i++) {
                p[i].x--;
            }
            System.out.println(m + 1);
        } else {
            System.out.println(m);
        }

        StringBuilder sb = new StringBuilder(isOdd ? "1 " : "");
        for (int i = 1; i <= m; i++) {
            sb.append(l[i] + " ");
        }
        System.out.println(sb.toString().trim());

        for (int i = 0; i < n; i++) {
            char move[] = new char[m];
            long nx = p[i].x;
            long ny = p[i].y;

            for (int j = m; j > 0; j--) {
                for (int k = 0; k < 4; k++) {
                    if (check(nx + l[j] * dx[k], ny + l[j] * dy[k], l[j - 1])) {
                        nx += l[j] * dx[k];
                        ny += l[j] * dy[k];
                        move[j - 1] = dr[k];
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
        return Math.abs(x) + Math.abs(y) <= range;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
