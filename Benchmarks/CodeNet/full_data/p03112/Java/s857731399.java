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
        DLazyFaith solver = new DLazyFaith();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLazyFaith {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int an = in.nextInt(), bn = in.nextInt(), qn = in.nextInt();
            long a[] = new long[an], b[] = new long[bn], ab[] = new long[an], ba[] = new long[bn];
            for (int i = 0; i < an; ++i) a[i] = in.nextLong();
            for (int i = 0; i < bn; ++i) b[i] = in.nextLong();

            for (int i = 0; i < an; ++i) {
                int pos = Arrays.binarySearch(b, a[i]);
                long tmp = Long.MAX_VALUE;
                if (pos < 0) pos = -pos - 1;
                if (pos < bn) tmp = Math.min(tmp, Math.abs(b[pos] - a[i]));
                if (pos > 0) tmp = Math.min(tmp, Math.abs(b[pos - 1] - a[i]));
                ab[i] = tmp;
            }

            for (int i = 0; i < bn; ++i) {
                int pos = Arrays.binarySearch(a, b[i]);
                long tmp = Long.MAX_VALUE;
                if (pos < 0) pos = -pos - 1;
                if (pos < an) tmp = Math.min(tmp, Math.abs(a[pos] - b[i]));
                if (pos > 0) tmp = Math.min(tmp, Math.abs(a[pos - 1] - b[i]));
                ba[i] = tmp;
            }

            while (qn-- > 0) {
                long q = in.nextLong();
                long ans = Long.MAX_VALUE;
                int pos = Arrays.binarySearch(a, q);
                if (pos < 0) pos = -pos - 1;
                if (pos < an) ans = Math.min(ans, Math.abs(a[pos] - q) + ab[pos]);
                if (pos > 0) ans = Math.min(ans, Math.abs(a[pos - 1] - q) + ab[pos - 1]);
                pos = Arrays.binarySearch(b, q);
                if (pos < 0) pos = -pos - 1;
                if (pos < bn) ans = Math.min(ans, Math.abs(b[pos] - q) + ba[pos]);
                if (pos > 0) ans = Math.min(ans, Math.abs(b[pos - 1] - q) + ba[pos - 1]);
                out.println(ans);
            }
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

