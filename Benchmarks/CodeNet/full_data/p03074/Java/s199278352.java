import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni(), k = in.ni();
            String s = in.ns();
            Segment root = null;
            Segment last = null;
            int cnt = 1;
            for (int i = 1; i <= n; i++) {
                if (i == n || s.charAt(i) != s.charAt(i - 1)) {
                    Segment seg = new Segment(cnt, s.charAt(i - 1) - '0');
                    if (root == null) {
                        last = root = seg;
                    } else {
                        last.next = seg;
                        last = seg;
                    }
                    cnt = 0;
                }
                cnt++;
            }
            int kk = 0;
            int len = 0;
            int max = 0;
            Segment cur = root;
            Segment tail = cur;
            while (cur != null) {
                if (cur.val == 0)
                    kk++;
                len += cur.cnt;
                if (kk > k) {
                    if (tail.val == 1) {
                        len -= tail.cnt;
                        tail = tail.next;
                        kk--;
                        len -= tail.cnt;
                        tail = tail.next;
                    } else {
                        len -= tail.cnt;
                        tail = tail.next;
                        kk--;
                    }
                }
                max = Math.max(max, len);
                cur = cur.next;
            }
            out.println(max);

        }

        class Segment {
            int cnt;
            int val;
            Segment next;

            public Segment(int cnt, int val) {
                this.cnt = cnt;
                this.val = val;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int ni() {
            return Integer.parseInt(ns());
        }

    }
}

