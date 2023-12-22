import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = new int[n], y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                List<Segment> cur = new ArrayList<>();
                cur.add(new Segment(0, 2 * Math.PI));
                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    List<Segment> newCur = new ArrayList<>();
                    List<Segment> result = new ArrayList<>();
                    double angle = Math.atan2(y[i] - y[j], x[j] - x[i]);
                    if (angle < 0) {
                        angle += 2 * Math.PI;
                    }

                    if (angle + Math.PI > 2 * Math.PI) {
                        newCur.add(new Segment(angle, 2 * Math.PI));
                        newCur.add(new Segment(0, angle - Math.PI));
                    } else {
                        newCur.add(new Segment(angle, angle + Math.PI));
                    }
                    for (Segment p : cur) {
                        for (Segment q : newCur) {
                            Segment r = p.intersect(q);
                            if (r != null) {
                                result.add(r);
                            }
                        }
                    }

                    cur = result;
                }
                double len = 0;
                for (Segment s : cur) {
                    len += s.r - s.l;
                }
                out.println(len / 2 / Math.PI);
            }
        }

        class Segment {
            double l;
            double r;

            public Segment(double l, double r) {
                this.l = l;
                this.r = r;
            }

            Segment intersect(Segment other) {
                double ll = Math.max(l, other.l), rr = Math.min(r, other.r);
                if (ll >= rr) {
                    return null;
                }
                return new Segment(ll, rr);
            }

        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

