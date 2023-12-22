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
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DXXOR solver = new DXXOR();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXXOR {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();

            if (k == 0) {
                long ans = 0;
                for (int i = 0; i < n; ++i) ans += in.nextLong();
                out.println(ans);
                return;
            }
            int cnt[] = new int[50];
            for (int i = 0; i < n; ++i) {
                long tmp = in.nextLong();
                for (int j = 0; tmp > 0; ++j) {
                    if ((tmp & ((long) 1 << j)) > 0) {
                        ++cnt[j];
                        tmp ^= (long) 1 << j;
                    }
                }
            }

            int msb = 0;
            while (((long) 1 << msb) <= k) ++msb;
            --msb;

            long[] smaller = new long[msb + 10], equal = new long[msb + 10];
            smaller[0] = Math.max(cnt[0], n - cnt[0]);
            for (int i = 1; i <= msb; ++i) smaller[i] = smaller[i - 1] + Math.max(cnt[i], n - cnt[i]) * ((long) 1 << i);
            for (int i = msb; i >= 0; --i) {
                if ((((long) 1 << i) & k) > 0) equal[i] = equal[i + 1] + (n - cnt[i]) * ((long) 1 << i);
                else equal[i] = equal[i + 1] + cnt[i] * ((long) 1 << i);
            }

            long ans = equal[0];
            for (int i = 0; i <= msb; ++i) {
                if ((((long) 1 << i) & k) > 0) {
                    long tmp = equal[i + 1] + cnt[i] * ((long) 1 << i);
                    if (i > 0) tmp += smaller[i - 1];
                    ans = Math.max(ans, tmp);
                }
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

