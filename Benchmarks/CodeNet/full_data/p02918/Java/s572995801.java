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
        DFaceProducesUnhappiness solver = new DFaceProducesUnhappiness();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFaceProducesUnhappiness {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            boolean[] s = new boolean[n];
            char[] input = in.next().toCharArray();
            for (int i = 0; i < n; i++) {
                s[i] = (input[i] == 'L');
            }

            int score = 0, lr = 0, rl = 0;
            for (int i = 0; i + 1 < n; i++) {
                if (s[i] == s[i + 1])
                    score++;
                else if (s[i]) {
                    lr++;
                } else {
                    rl++;
                }
            }

            while (k > 0) {
                if (lr > 0 && rl > 0) {
                    lr--;
                    rl--;
                    k--;
                    score += 2;
                } else {
                    break;
                }
            }

            if (k > 0) {
                if (lr > 0 && !s[n - 1]) {
                    score++;
                    lr--;
                    k--;
                }
            }
            if (k > 0) {
                if (rl > 0 && s[0]) {
                    score++;
                    rl--;
                    k--;
                }
            }

            out.println(score);
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

