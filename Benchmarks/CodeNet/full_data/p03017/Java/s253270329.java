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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int s1 = in.nextInt() - 1;
            int s2 = in.nextInt() - 1;
            int t1 = in.nextInt() - 1;
            int t2 = in.nextInt() - 1;
            String s = in.next();
            if (t1 == t2) {
                out.println("No");
                return;
            }
            if (!canMove(s, s1, t1) || !canMove(s, s2, t2)) {
                out.println("No");
                return;
            }
            if (t1 > t2) {
                if (!s.substring(s2 - 1, t2 + 2).contains("...")) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
        }

        private boolean canMove(String s, int s1, int t1) {
            return !s.substring(s1, t1 + 1).contains("##");
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

