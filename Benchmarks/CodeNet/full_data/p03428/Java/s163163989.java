import java.util.*;
import java.io.*;

public class Main {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    final long MOD = 1000L * 1000L * 1000L + 7;

    class Point {
        int x;
        int y;
        int id;
        public Point(int x, int y, int id){
            this.x = x;
            this.y = y;
            this.id = id;
        }

        @Override
        public String toString() {
            return "x: " + x + ", y: " + y + ", id: " + id;
        }
    }
    void solve() throws IOException {
        int n = nextInt();
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = nextInt();
            int y = nextInt();
            arr[i] = new Point(x, y, i);
        }
        if (n == 2) {
            for (int i = 0; i < n; i++) {
                outln(0.5);
            }
            return;
        }

        List<Point> hull = convexHull(arr);
        double[] res = new double[n];
        int sz = hull.size();
        for (int i = 0; i < sz; i++) {
            Point cur = hull.get(i);
            Point prev = hull.get((i - 1 + sz) % sz);
            Point nxt = hull.get((i + 1) % sz);

            double angle = getAngle(cur, prev, nxt);
            res[cur.id] = angle / 2  / Math.PI;
        }

        for (int i = 0; i < n; i++) {
            outln(res[i]);
        }
    }

    double getAngle(Point cur, Point prev, Point nxt) {
        Point d1 = new Point(prev.x - cur.x, prev.y - cur.y, 0);
        Point d2 = new Point(nxt.x - cur.x, nxt.y - cur.y, 0);
        double div = 1.0;
        div *= 1.0 * d1.x * d2.x + 1.0 * d1.y * d2.y;
        div /= Math.sqrt(1.0 * d1.x * d1.x + 1.0 * d1.y * d1.y);
        div /= Math.sqrt(1.0 * d2.x * d2.x + 1.0 * d2.y * d2.y);
        return Math.PI - Math.acos(div);
    }

    public List<Point> convexHull(Point points[]) {
        int n = points.length;
        List<Point> hull = new ArrayList<>();
        if (n < 3) {
            for (int i = 0; i < n; i++) {
                hull.add(points[i]);
            }
            return hull;
        }

        int l = 0;
        for (int i = 1; i < n; i++)
            if (points[i].x < points[l].x)
                l = i;

        int p = l, q;
        do {
            hull.add(points[p]);
            q = (p + 1) % n;

            for (int i = 0; i < n; i++) {
                if (orientation(points[p], points[i], points[q]) == 2)
                    q = i;
            }

            p = q;

        } while (p != l);

        return hull;
    }

    int orientation(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x) -
                (q.x - p.x) * (r.y - q.y);

        if (val == 0) return 0;  // collinear
        return (val > 0)? 1: 2; // clock or counterclock wise
    }

    void shuffle(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }
    private void outln(Object o) {
        out.println(o);
    }
    private void out(Object o) {
        out.print(o);
    }
    public Main() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public long[] nextLongArr(int n) throws IOException{
        long[] res = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
    public int[] nextIntArr(int n) throws IOException {
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }
    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }
    public String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
