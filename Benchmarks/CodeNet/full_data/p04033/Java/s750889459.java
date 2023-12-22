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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ARangeProduct solver = new ARangeProduct();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARangeProduct {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long a = in.nextLong(), b = in.nextLong();

            long answer = solve(a, b);

            if (answer > 0)
                out.println("Positive");
            else if (answer < 0)
                out.println("Negative");
            else
                out.println("Zero");
        }

        private long solve(long a, long b) {
            if (a <= 0 && b >= 0) {
                return 0;
            }

            if (a > 0)
                return +1;

            long count = b - a + 1;
            if (count % 2 == 0)
                return +1;
            return -1;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

