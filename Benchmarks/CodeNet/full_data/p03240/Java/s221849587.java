import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        Point[] ps = new Point[n];

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long h = sc.nextLong();
            if (h == 100) {
                System.out.printf("%d %d %d%n", x, y, h);
                return;
            }
            ps[i] = new Point(x, y, h);
        }

        Arrays.sort(ps, (x, y) -> {
            if (y.h == x.h) {
                return 0;
            } else if (y.h > x.h) {
                return 1;
            }

            return -1;
        });
        System.out.println(ps[0].h);
        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                long h = ps[0].h + Math.abs(ps[0].x - x) + Math.abs(ps[0].y - y);
                for (int k = 1; k < n; k++) {
                    long h1 = h - Math.abs(ps[k].x - x) - Math.abs(ps[k].y - y);

                    if (ps[k].h == 0 && h1 > 0 || ps[k].h != h1) {
                        break;
                    } else if (k == n - 1) {
                        System.out.printf("%d %d %d%n", x, y, h);
                    }
                }
            }
        }
    }
}

class Point {
    long x;
    long y;
    long h;

    Point(long x, long y, long h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }
}