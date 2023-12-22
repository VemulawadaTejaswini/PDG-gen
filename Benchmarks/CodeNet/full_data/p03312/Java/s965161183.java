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
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqualCut solver = new DEqualCut();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqualCut {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; ++i) a[i] = in.nextLong();
            for (int i = 1; i < n; ++i) a[i] += a[i - 1];

            long ans = Long.MAX_VALUE;
            for (int i = 1; i < n - 2; ++i) {
                int cut1 = Arrays.binarySearch(a, 0, i, a[i] / 2);
                if (cut1 < 0) cut1 = -cut1 - 1;
                if (cut1 == i) {
                    --cut1;
                } else if (cut1 > 0 && Math.abs(a[cut1] - a[i] / 2) > Math.abs(a[cut1 - 1] - a[i] / 2)) {
                    --cut1;
                }

                int cut2 = Arrays.binarySearch(a, i, n, (a[n - 1] + a[i]) / 2);
                if (cut2 < 0) cut2 = -cut2 - 1;
                if (cut2 == i) {
                    --cut2;
                } else if (cut2 > 0 && Math.abs(a[cut2] - (a[n - 1] + a[i]) / 2) > Math.abs(a[cut2 - 1] - (a[n - 1] + a[i]) / 2)) {
                    --cut2;
                }

                long sum1 = a[cut1], sum2 = a[i] - a[cut1], sum3 = a[cut2] - a[i], sum4 = a[n - 1] - a[cut2];
                long mx = Math.max(sum1, Math.max(sum2, Math.max(sum3, sum4)));
                long mn = Math.min(sum1, Math.min(sum2, Math.min(sum3, sum4)));
                ans = Math.min(ans, mx - mn);
            }
            out.println(ans);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

