import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            Segment[] a = new Segment[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Segment(in.nextInt(), in.nextInt(), i);
            }
            TreeSet<Segment> left = new TreeSet<>((o1, o2) -> {
                if (o1.l != o2.l) {
                    return -(o1.l - o2.l);
                }
                if (o1.r != o2.r) {
                    return o1.r - o2.r;
                }
                return o1.i - o2.i;
            });
            TreeSet<Segment> right = new TreeSet<>((o1, o2) -> {

                if (o1.r != o2.r) {
                    return o1.r - o2.r;
                }
                if (o1.l != o2.l) {
                    return -(o1.l - o2.l);
                }
                return o1.i - o2.i;
            });
            left.addAll(Arrays.asList(a));
            right.addAll(Arrays.asList(a));

            int pos = 0;
            long ans = 0;
            while (left.size() > 0) {
                Segment s1 = left.first(), s2 = right.first();
                if (dist(pos, s1) < dist(pos, s2)) {
                    s1 = s2;
                }
                left.remove(s1);
                right.remove(s1);
                ans += dist(pos, s1);
                pos = go(pos, s1);
            }
            out.println(Math.abs(pos) + ans);
        }

        private int dist(int pos, Segment s1) {
            return Math.abs(go(pos, s1) - pos);
        }

        private int go(int pos, Segment s1) {
            if (s1.l <= pos && pos <= s1.r) {
                return pos;
            }
            if (pos < s1.l) {
                return s1.l;
            } else {
                return s1.r;
            }
        }

        class Segment {
            int l;
            int r;
            int i;

            public Segment(int l, int r, int i) {
                this.l = l;
                this.r = r;
                this.i = i;
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

