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
        TaskG solver = new TaskG();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskG {
        public int[] BASE = {47, 57, 76, 81, 301, 501, 754};
        public char[] c = "FESTIVA".toCharArray();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long k = in.nextLong();

            StringBuilder s = new StringBuilder();
            s.append("FESTIVA");
            int idx = 0;
            while (k > 0 && idx < c.length) {
                for (int i = 0; i < k % BASE[idx]; i++) {
                    s.append("L");
                }

                for (int pos = c.length - 1; pos >= idx; pos--) {
                    for (int i = 0; i < BASE[idx] - 1; i++) {
                        s.append(c[pos]);
                    }
                }
                k /= BASE[idx];
                idx++;
            }
            while (k-- > 0) {
                s.append("L");
            }
            out.println(s.toString());
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

