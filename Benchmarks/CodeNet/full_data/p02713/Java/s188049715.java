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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSumOfGcdOfTuplesEasy solver = new CSumOfGcdOfTuplesEasy();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSumOfGcdOfTuplesEasy {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();

            long total = 0;
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    for (int l = 0; l < k; l++) {
                        total += gcd(i + 1, j + 1, l + 1);
                    }
                }
            }

            out.println(total);
        }

        private int gcd(int a, int b, int c) {
            return gcd(gcd(a, b), c);
        }

        private int gcd(int a, int b) {
            while (b > 0) {
                int tmp = b;
                b = a % b;
                a = tmp;
            }

            return a;
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

    }
}

