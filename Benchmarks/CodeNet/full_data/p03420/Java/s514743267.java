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
        DRemainderReminder solver = new DRemainderReminder();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRemainderReminder {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.nextInt();
            long k = in.nextInt();

            if (k == 0) {
                out.println(n * n);
                return;
            }

            long answer = 0;
            for (long b = 1; b <= n; b++) {
                if (k > b - 1)
                    continue;
                long intervals = n / b;
                answer += intervals * (b - k);
                answer += Math.max(0, (n % b) - k + 1);
            }

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

