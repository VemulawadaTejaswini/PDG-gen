import java.util.*;
import java.io.*;

public class Main {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer stok;

    String nextToken() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
            String s = br.readLine();
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    char nextChar() throws IOException {
        return (char) (br.read());
    }

    String nextLine() throws IOException {
        return br.readLine();
    }

    public static class Point{
        public long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public Point minus(Point b) {
            return new Point(x - b.x, y - b.y);
        }

        public double cross(Point b) {
            return x * b.y - y * b.x;
        }

        public double dot(Point b) {
            return x * b.x + y * b.y;
        }

    }

    boolean inside(Point d, Point a, Point b, Point c) {
        return (Math.min(a.x, Math.min(b.x, c.x)) <= d.x && Math.min(a.y, Math.min(b.y, c.y)) <= d.y &&
                Math.max(a.x, Math.max(b.x, c.x)) >= d.x && Math.max(a.y, Math.max(b.y, c.y)) >= d.y);
    }

    long s(Point a, Point b, Point c) {
        return ((Math.max(a.x, Math.max(b.x, c.x)) - Math.min(a.x, Math.min(b.x, c.x))) *
                (Math.max(a.y, Math.max(b.y, c.y)) - Math.min(a.y, Math.min(b.y, c.y))));
    }

    void solve() throws IOException {
        int n = nextInt();
        int k = nextInt();
        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            points[i] = new Point(nextLong(), nextLong());
        }

        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n ; l++) {
                    Point a = points[i];
                    Point b = points[j];
                    Point c = points[l];
                    long mxx = Math.max(a.x, Math.max(b.x, c.x));
                    long mnx = Math.min(a.x, Math.min(b.x, c.x));
                    long mxy = Math.max(a.y, Math.max(b.y, c.y));
                    long mny = Math.min(a.y, Math.min(b.y, c.y));
                    int cnt = 0;
                    for (int q = 0; q < n; q++) {
                        if (mnx <= points[q].x && points[q].x <= mxx && mny <= points[q].y && points[q].y <= mxy) {
                            cnt++;
                        }
                    }
                    //System.err.println(i + " " +  j + " " + l + " " + mxx + " " + mnx + " " + mxy + " " + mny + " " + cnt + " " + ((mxx - mnx) * (mxy - mny)));
                    if (cnt >= k) {
                        min = Math.min(min, (mxx - mnx) * (mxy - mny));
                    }
                }

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {


                    Point a = points[i];
                    Point b = points[j];

                    long mxx = Math.max(a.x, b.x);
                    long mnx = Math.min(a.x, b.x);
                    long mxy = Math.max(a.y, b.y);
                    long mny = Math.min(a.y, b.y);
                    int cnt = 0;
                    for (int q = 0; q < n; q++) {
                        if (mnx <= points[q].x && points[q].x <= mxx && mny <= points[q].y && points[q].y <= mxy) {
                            cnt++;
                        }
                    }
                    //System.err.println(i + " " +  j + " " + l + " " + mxx + " " + mnx + " " + mxy + " " + mny + " " + cnt + " " + ((mxx - mnx) * (mxy - mny)));
                    if (cnt >= k) {
                        min = Math.min(min, (mxx - mnx) * (mxy - mny));
                    }


            }

        }
        //if (min == 3999999996000000000L) min++;
        out.println(min);
    }

    void run() throws IOException {
        // br = new BufferedReader(new FileReader("dragons.in"));
        //out = new PrintWriter("dragons.out");
        // br = new BufferedReader(new FileReader("input.txt"));
        // out = new PrintWriter("output.txt");
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        br.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        // Locale.setDefault(Locale.US);
        new Main().run();
    }
}