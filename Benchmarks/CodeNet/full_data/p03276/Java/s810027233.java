import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        void Solve() {
            int n = inp.nextInt();
            int k = inp.nextInt();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();

            a.add(0);
            for (int i = 1; i <= n; ++i) {
                int x = inp.nextInt();
                if (x >= 0) {
                    a.add(x);
                } else {
                    b.add(-x);
                }
            }
            b.add(0);
            Collections.reverse(b);

            int ans = (int) 2e9;
            for (int i = 0; i <= a.size() - 1; ++i) {
                int j = k - i;
                if (0 <= j && j <= b.size() - 1) {
                    int s1 = a.get(i) * 2 + b.get(j);
                    int s2 = a.get(i) + b.get(j) * 2;
                    ans = Math.min(Math.min(s1, s2), ans);
                }
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