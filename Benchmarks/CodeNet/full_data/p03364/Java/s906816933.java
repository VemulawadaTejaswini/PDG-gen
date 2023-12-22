import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Random;
import java.math.BigInteger;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[][] s = new char[2 * n][2 * n];
            for (int i = 0; i < n; i++) {
                char[] t = in.next().toCharArray();
                for (int j = 0; j < n; j++) {
                    s[i][j] = t[j];
                    s[i + n][j] = t[j];
                    s[i][j + n] = t[j];
                    s[i + n][j + n] = t[j];
                }
            }
            char[][] t = transpose(s);
            StringHasher hasher = new StringHasher(2 * n);
            long[][] rows = new long[2 * n][];
            long[][] cols = new long[2 * n][];
            for (int i = 0; i < 2 * n; i++) {
                rows[i] = hasher.buildHash(s[i]);
                cols[i] = hasher.buildHash(t[i]);
            }

            int ans = 0;
            for (int si = 0; si < n; si++) {
                for (int sj = 0; sj < n; sj++) {
                    ++ans;
                    for (int i = 0; i < n; i++) {
                        long hr = hasher.hash(rows[si + i], sj, sj + n - 1);
                        long hc = hasher.hash(cols[sj + i], si, si + n - 1);
                        if (hr != hc) {
                            --ans;
                            break;
                        }
                    }
                }
            }
            out.println(ans);
        }

        private char[][] transpose(char[][] s) {
            int n = s.length;
            char[][] t = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    t[i][j] = s[j][i];
                }
            }
            return t;
        }

        class StringHasher {
            Random random = new Random(System.currentTimeMillis());
            long P;
            long X;
            long[] powX;

            StringHasher(int maxLen) {
                P = random.nextInt((int) 1e9) + random.nextInt((int) 1e5);
                while (!BigInteger.valueOf(P).isProbablePrime(100)) {
                    ++P;
                }
                X = 1 + random.nextInt((int) P);

                powX = new long[maxLen + 1];
                powX[0] = 1;
                for (int i = 1; i < powX.length; i++) {
                    powX[i] = X * powX[i - 1] % P;
                }
            }

            long[] buildHash(char[] s) {
                long[] h = new long[s.length + 1];
                for (int i = 0; i < s.length; i++) {
                    h[i + 1] = (X * h[i] + s[i]) % P;
                }
                return h;
            }

            long hash(long[] h, int l, int r) {
                if (l > r) {
                    return 0;
                }
                long res = (h[r + 1] - h[l] * powX[r - l + 1]) % P;
                if (res < 0) {
                    res += P;
                }
                return res;
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

