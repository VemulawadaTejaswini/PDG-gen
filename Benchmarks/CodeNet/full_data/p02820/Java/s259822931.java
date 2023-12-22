import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPredictionAndRestriction solver = new DPredictionAndRestriction();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPredictionAndRestriction {
        int n;
        int k;
        long r;
        long s;
        long p;
        String a;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            n = in.nextInt();
            k = in.nextInt();
            r = in.nextInt();
            s = in.nextInt();
            p = in.nextInt();

            a = in.next();
            long res = solveMe();
            out.println(res);
        }

        private long solveMe() {
            long res = 0;
            int[] choices = new int[k];
            for (int i = 0; i < n; i++) {
                if (i < k || choices[i % k] != a.charAt(i)) {
                    res += winning(a.charAt(i));

                    choices[i % k] = a.charAt(i);
                } else {
                    choices[i % k] = -1;
                }
            }
            return res;
        }

        private long winning(char c) {
            if (c == 'r') {
                return p;
            } else if (c == 's') {
                return r;
            } else {
                return s;
            }
        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

