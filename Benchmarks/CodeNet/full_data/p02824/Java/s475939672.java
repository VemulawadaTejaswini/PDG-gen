import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Random;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author shangu
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BVotingJudges solver = new BVotingJudges();
        solver.solve(1, in, out);
        out.close();
    }

    static class BVotingJudges {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            long n = in.nextLong(), njudge = in.nextLong(), v = in.nextLong(), P = in.nextLong();
            long[] a = new long[(int) n], A = new long[(int) n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                A[i] = a[i] + njudge;
                sum += a[i];
            }
            mySort(a);
            mySort(A);
            long psum[] = new long[(int) n], psumA[] = new long[(int) n];
            psum[0] = a[0];
            psumA[0] = A[0];
            for (int i = 1; i < n; i++) {
                psum[i] = psum[i - 1] + a[i];
                psumA[i] = psumA[i - 1] + A[i];
            }
            sum += v * njudge;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int pj = upperBound(a, a[i] + njudge);
                if (n - pj >= P) continue;
                else {
                    int pi = lowerBound(A, a[i] + njudge);
                    long max = (pi > 0 ? psumA[pi - 1] : 0) + (n - P + 1 - pi) * (a[i] + njudge) +
                            psumA[(int) (n - 1)] - psumA[(int) (n - P)];
                    if (sum <= max) ++ans;
                }
            }
            out.println(ans);
        }

        private void mySort(long[] a) {
            Random random = new Random(System.currentTimeMillis());
            for (int i = 0; i < a.length; i++) {
                int j = random.nextInt(i + 1);
                long tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
            }
            Arrays.sort(a);
        }

        private int lowerBound(long[] a, long v) {
            int L = -1, R = a.length;
            while (R - L > 1) {
                int M = (L + R) >> 1;
                if (a[M] < v) L = M;
                else R = M;
            }
            return R;
        }

        private int upperBound(long[] a, long v) {
            int R = a.length, L = -1;
            while (R - L > 1) {
                int M = (L + R) >> 1;
                if (a[M] <= v) L = M;
                else R = M;
            }
            return R;
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream), 32768);
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

