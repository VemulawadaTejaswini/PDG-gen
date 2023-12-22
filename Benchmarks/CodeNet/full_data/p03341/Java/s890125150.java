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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        int[] east;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            String word = in.next();
            east = new int[N];

            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    east[i] = word.charAt(0) == 'E' ? 1 : 0;
                } else {
                    east[i] = east[i - 1] + (word.charAt(i) == 'E' ? 1 : 0);
                }
            }

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                ans = Math.min(ans, sum(0, i - 1, true) + sum(i + 1, N - 1, false));
            }
            out.println(ans);
        }

        private int sum(int start, int end, boolean toEast) {
            if (start > end) return 0;
            int len = end - start + 1;
            if (start == 0) {
                return !toEast ? east[end] : (len - east[end]);
            }
            return !toEast ? (east[end] - east[start - 1]) : (len - (east[end] - east[start - 1]));
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

