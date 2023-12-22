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
        BTimeLimitExceeded solver = new BTimeLimitExceeded();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTimeLimitExceeded {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int maxT = in.nextInt();

            int answer = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int c = in.nextInt(), t = in.nextInt();
                if (t <= maxT) {
                    answer = Math.min(c, answer);
                }
            }

            if (answer == Integer.MAX_VALUE)
                out.println("TLE");
            else
                out.println(answer);
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

