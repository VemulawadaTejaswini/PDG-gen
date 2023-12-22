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
        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                if (n >= 3) {
                    long h1 = ps[0].h + Math.abs(ps[0].x - x) + Math.abs(ps[0].y - y);
                    // long h2 = ps[1].h + Math.abs(ps[1].x - x) + Math.abs(ps[1].y - y);
                    // long h3 = ps[2].h + Math.abs(ps[2].x - x) + Math.abs(ps[2].y - y);

                    // if (h1 == h2 && h2 == h3 && h1 >= 1) {
                        if (h1 >= 1 && h1 <= 1000000000) {}
                        System.out.printf("%d %d %d%n", x, y, h1);
                        return;
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