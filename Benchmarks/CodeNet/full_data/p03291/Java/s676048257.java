import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        private void Solve() {
            String S = inp.next();
            int n = S.length();

            int[] ca = new int[n + 1];
            int[] cc = new int[n + 1];
            int[] cq = new int[n + 1];
            ca[0] = cc[0] = cq[0] = 0;
            for (int i = 1; i <= n; ++i) {
                ca[i] = ca[i - 1];
                cc[i] = cc[i - 1];
                cq[i] = cq[i - 1];
                switch (S.charAt(i - 1)) {
                    case 'A': ca[i] += 1; break;
                    case 'C': cc[i] += 1; break;
                    case '?': cq[i] += 1; break;
                }
            }

            final int MOD = (int) 1e9 + 7;
            long[] pw2 = new long[n + 1];
            long[] pw3 = new long[n + 1];
            pw2[0] = 1;
            pw3[0] = 1;
            for (int i = 1; i <= n; ++i) {
                pw2[i] = pw2[i - 1] * 2 % MOD;
                pw3[i] = pw3[i - 1] * 3 % MOD;
            }

            long ans = 0;
            for (int i = 1; i <= n; ++i) {
                char c = S.charAt(i - 1);
                if (c != 'B' && c != '?') {
                    continue;
                }
                long x, y;
                x = ca[i - 1] * pw3[cq[i - 1]] % MOD;
                if (cq[i - 1] > 0) {
                    x = (x + pw3[cq[i - 1] - 1] * cq[i - 1]) % MOD;
                }
                y = (cc[n] - cc[i]) * pw3[cq[n] - cq[i]] % MOD;
                if (cq[n] - cq[i] > 0) {
                    y = (y + pw3[cq[n] - cq[i] - 1] * (cq[n] - cq[i])) % MOD;
                }
                ans = (ans + x * y) % MOD;
            }
            out.println(ans);
        }
        static InputReader inp;
        static PrintWriter out;
    }

    private static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        private InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        private String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }
        private long nextLong() {
            return Long.parseLong(next());
        }
        private int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = nextInt();
            }
            return a;
        }
    }
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Solver.inp = new InputReader(inputStream);
        Solver.out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.Solve();
        Solver.out.close();
    }
}