import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        private void Solve() {
            int n = inp.nextInt();
            int[] a = inp.nextArrayInt(n);

            int ans = 0;
            for (int i = 0; i < n; ++i) {
                int j = i;
                while (j + 1 < n && a[j + 1] == a[i]) {
                    j += 1;
                }
                ans += (j - i + 1) / 2;
                i = j;
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
        private int[] nextArrayInt(int n) {
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