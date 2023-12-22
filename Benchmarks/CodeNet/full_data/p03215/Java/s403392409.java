import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BSumANDSubarrays solver = new BSumANDSubarrays();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSumANDSubarrays {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            int k = in.ints();
            int[] a = in.ints(n);
            long[] sum = new long[n + 1];
            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + a[i];
            }

            long ans = 0;
            for (int i = 62; i >= 0; i--) {
                long mask = ans | (1L << i);
                int c = 0;
                for (int r = 1; r < n; r++) {
                    for (int l = 0; l < r; l++) {
                        long s = sum[r + 1] - sum[l];
                        if ((s & mask) == mask) {
                            c++;
                        }
                    }
                }
                if (c >= k) {
                    ans = mask;
                }
            }
            out.println(ans);
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }
}

