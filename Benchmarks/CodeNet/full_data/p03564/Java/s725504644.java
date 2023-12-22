
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(final String[] args) {
        final InputStream inputStream = System.in;
        final OutputStream outputStream = System.out;
        final InputReader in = new InputReader(inputStream);
        final PrintWriter out = new PrintWriter(outputStream);
        final Solution solver = new Solution();
        solver.solve(in, out);
        out.close();
    }

    static class Solution {
        void solve(final InputReader in, final PrintWriter out) {
            final int N = in.nextInt();
            final int K = in.nextInt();
            int currentValue = 1;
            for (int i = 0; i < N; i++) {
                currentValue = Math.min(currentValue * 2, currentValue + K);
            }
            out.println(currentValue);
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(final InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (final IOException e) {
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
