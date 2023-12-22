import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
            String s = in.next();
            boolean[] exists = new boolean[123];
            for (int i = 0; i < s.length(); i++) {
                exists[s.charAt(i)] = true;
            }
            for (char c = 'a'; c <= 'z'; c++) {
                if (!exists[c]) {
                    out.print(s + c);
                    return;
                }
            }
            for (int i = s.length() - 1; i >= 0; i--) {
                for (char c = (char) (s.charAt(i) + 1); c <= 'z'; c++) {
                    if (!exists[c]) {
                        out.print(s.substring(0, s.length() - 1) + c);
                        return;
                    }
                }
                exists[s.charAt(i)] = false;
                s = s.substring(0, s.length() - 1);
            }
            out.print(-1);
        }

    }

    static class InputReader {
        private StringTokenizer tokenizer;
        private BufferedReader reader;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
        }

        private void fillTokenizer() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            fillTokenizer();
            return tokenizer.nextToken();
        }

    }
}

