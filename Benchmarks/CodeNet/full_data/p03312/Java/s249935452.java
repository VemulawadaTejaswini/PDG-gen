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
        ProblemD solver = new ProblemD();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int[] b = reverse(a);
            long[] sa = partialSums(a);
            long[] sb = partialSums(b);
            int[] bestCutA = solveForTwo(sa);
            int[] bestCutB = solveForTwo(sb);
            bestCutB = reverse(bestCutB);
            for (int i = 0; i < n; i++) {
                bestCutB[i] = n - bestCutB[i] - 1;
            }
            long ans = Long.MAX_VALUE;
            int[] p = new int[5];
            long[] v = new long[4];
            for (int i = 1; i + 2 < n; i++) {
                p[0] = -1;
                p[1] = bestCutA[i];
                p[2] = i;
                p[3] = bestCutB[i + 1] - 1;
                p[4] = n - 1;
                for (int j = 0; j < 4; j++) {
                    v[j] = sa[p[j + 1] + 1] - sa[p[j] + 1];
                }
                Arrays.sort(v);
                ans = Math.min(ans, v[3] - v[0]);
            }
            out.println(ans);
        }

        private int[] solveForTwo(long[] sa) {
            int n = sa.length - 1;
            int j = 0;
            int[] cut = new int[n];
            for (int i = 1; i < n; i++) {
                while (j + 1 < i && Math.abs(sa[i + 1] - 2 * sa[j + 2]) < Math.abs(sa[i + 1] - 2 * sa[j + 1])) {
                    ++j;
                }
                cut[i] = j;
            }

//        // Another working solution:
//        for (int i = 1; i < n; i++) {
//            while (j + 1 < i && sa[j + 2] * 2 < sa[i + 1]) {
//                ++j;
//            }
//            // Important: we do not know which of the left and right
//            // parts will be larger. The while loop assumes that
//            // it is the left one but the situation is not symmetrical.
//            // (S1 < S/2, S2 >= S/2) or (S3 >= S/2, S4 < S/2).
//            // |S3-S4| may be smaller than |S1-S2|.
//            if (j + 1 < i && Math.abs(sa[i + 1] - 2 * sa[j + 2]) < Math.abs(sa[i + 1] - 2 * sa[j + 1])) {
//                ++j;
//            }
//            cut[i] = j;
//        }
            return cut;
        }

        private int[] reverse(int[] a) {
            int[] b = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[a.length - i - 1];
            }
            return b;
        }

        private long[] partialSums(int[] a) {
            long[] sa = new long[a.length + 1];
            for (int i = 0; i < a.length; i++) {
                sa[i + 1] = sa[i] + a[i];
            }
            return sa;
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
                    st = new StringTokenizer(in.readLine());
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

