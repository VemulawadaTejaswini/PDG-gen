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
        ADigitsSum solver = new ADigitsSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADigitsSum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int answer = Integer.MAX_VALUE;
            for (int a = 1; a < n; a++) {
                int b = n - a;
                answer = Math.min(answer, sum(a) + sum(b));
            }

            out.println(answer);
        }

        static int sum(int n) {
            int result = 0;
            while (n > 0) {
                result += n % 10;
                n /= 10;
            }
            return result;
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

