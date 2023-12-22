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
        AIrreversibleOperation solver = new AIrreversibleOperation();
        solver.solve(1, in, out);
        out.close();
    }

    static class AIrreversibleOperation {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String S = in.next();
            int N = S.length();
            int[] whites = new int[N + 1];
            for (int i = N - 1; i >= 0; i--) {
                whites[i] = whites[i + 1] + (S.charAt(i) == 'W' ? 1 : 0);
            }

            long ans = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == 'B') {
                    ans += whites[i + 1];
                }
            }

            out.println(ans);
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

    }
}

