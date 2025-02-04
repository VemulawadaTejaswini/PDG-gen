import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ProblemB_RobotArms solver = new ProblemB_RobotArms();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemB_RobotArms {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            Segment[] a = new Segment[n];
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int len = in.nextInt();
                a[i] = new Segment(x - len, x + len);
            }

            Arrays.sort(a, (u, v) -> Integer.compare(u.r, v.r));

            int ans = 0;
            int r = Integer.MIN_VALUE;
            for (Segment s : a) {
                if (s.l >= r) {
                    r = s.r;
                    ++ans;
                }
            }
            out.println(ans);
        }

        class Segment {
            int l;
            int r;

            Segment(int l, int r) {
                this.l = l;
                this.r = r;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

