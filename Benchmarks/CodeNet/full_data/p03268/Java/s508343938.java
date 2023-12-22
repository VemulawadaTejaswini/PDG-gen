import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        private void Solve() {
            int n = inp.nextInt();
            int k = inp.nextInt();

            long[] c = new long[k];
            for (int i = 0; i < k; ++i) {
                c[i] = 0;
            }
            for (int i = 1; i <= n; ++i) {
                c[i % k] += 1;
            }

            long ans = 0;
            long cnt = c[0];
            ans = ans + cnt * cnt * cnt;
            if (k % 2 == 0) {
                cnt = c[k / 2];
                ans = ans + cnt * cnt * cnt;
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

        private double nextDouble() {
            return Double.parseDouble(next());
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