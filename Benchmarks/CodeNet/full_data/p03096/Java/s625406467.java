import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhas Jain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BReversi solver = new BReversi();
        solver.solve(1, in, out);
        out.close();
    }

    static class BReversi {
        int n;
        int[] c;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.ni();
            c = new int[n];
            for (int i = 0; i < n; ++i) {
                c[i] = in.ni();
            }
            int cnt = unique();
            long[] dp = new long[cnt];
            int[] prev = new int[cnt];
            for (int i = 0; i < cnt; ++i) prev[i] = -1;
            HashMap<Integer, Integer> hmp = new HashMap<>();
            for (int i = 0; i < cnt; ++i) {
                if (hmp.containsKey(c[i])) {
                    prev[i] = hmp.get(c[i]);
                }
                hmp.put(c[i], i);
            }
            long[] psum = new long[cnt];
            long mod = (long) 1e9 + 7L;
            for (int i = 0; i < cnt; ++i) {
                if (prev[i] == -1) {
                    if (i != 0)
                        psum[i] = psum[i - 1];
                } else {
                    dp[i] = (psum[prev[i]] % mod + 1L) % mod;
                    psum[i] = (psum[i - 1] % mod + dp[i] % mod) % mod;
                }
            }
            out.print((psum[cnt - 1] + 1L) % mod);
        }

        int unique() {
            int cnt = 0;
            for (int i = 0; i < n; ++i) {
                if (i == 0 || c[i] != c[i - 1]) {
                    c[cnt++] = c[i];
                }
            }
            return cnt;
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

        public int ni() {
            return Integer.parseInt(next());
        }

    }
}

