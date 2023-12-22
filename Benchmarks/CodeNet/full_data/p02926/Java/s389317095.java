import java.awt.*;
import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] xx = {1, 1, -1, 1};
        int[] yy = {1, -1, 1, -1};
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(scanner.nextInt(), scanner.nextInt());
        }
        long ans = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                points[j].move(points[j].x * xx[i], points[j].y * yy[i]);
            }
            ans = Math.max(ans, f(points, n));
        }
        System.out.println(Math.sqrt(ans));
    }

    static long f(Point[] points, int n) {
        boolean[] used = new boolean[n];
        long x1 = 0, x2;
        long y1 = 0, y2;
        for (int i = 0; i < n; i++) {
            if (points[i].x >= 0 && points[i].y >= 0) {
                x1 += points[i].x;
                y1 += points[i].y;
                used[i] = true;
            } else if (points[i].x < 0 && points[i].y < 0) {
            }
        }

        boolean updated = true;
        while (updated) {
            updated = false;
            for (int i = 0; i < n; i++) {
                if (points[i].x < 0 && points[i].y >= 0 && !used[i]) {
                    long nx = x1 + points[i].x;
                    long ny = y1 + points[i].y;
                    if (x1 * x1 + y1 * y1 < nx * nx + ny * ny) {
                        used[i] = true;
                        x1 = nx;
                        y1 = ny;
                        updated = true;
                    }
                }
            }
        }
        x2 = x1;
        y2 = y1;
        updated = true;
        while (updated) {
            updated = false;
            for (int i = 0; i < n; i++) {
                if (points[i].x >= 0 && points[i].y < 0 && !used[i]) {
                    long nx = x2 + points[i].x;
                    long ny = y2 + points[i].y;
                    if (x2 * x2 + y2 * y2 < nx * nx + ny * ny) {
                        used[i] = true;
                        x2 = nx;
                        y2 = ny;
                        updated = true;
                    }
                }
            }
        }

        long max = Math.max(x1 * x1 + y1 * y1, x2 * x2 + y2 * y2);

        for (int i = 0; i < n; i++) {
            if (used[i]) {
                long nx2 = x2 - points[i].x;
                long ny2 = y2 - points[i].y;
                if (max < nx2 * nx2 + ny2 * ny2) {
                    max = nx2 * nx2 + ny2 * ny2;
                }
            } else {
                long nx2 = x2 + points[i].x;
                long ny2 = y2 + points[i].y;
                if (max < nx2 * nx2 + ny2 * ny2) {
                    max = nx2 * nx2 + ny2 * ny2;
                }
            }
        }

        return max;
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}