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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String[] a = new String[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.next();
            }
            boolean[] emptyRow = new boolean[n];
            for (int row = 0; row < n; ++row) {
                emptyRow[row] = true;
                for (int col = 0; col < n; ++col) {
                    if (a[row].charAt(col) == '#') emptyRow[row] = false;
                }
            }
            int untilBlackRow = Integer.MAX_VALUE;
            for (int blackRow = 0; blackRow < n; ++blackRow) {
                int whites = 0;
                for (int col = 0; col < n; ++col) if (a[blackRow].charAt(col) == '.') ++whites;
                if (whites == 0) {
                    untilBlackRow = Math.min(untilBlackRow, 0);
                    continue;
                }
                boolean anyFiller = false;
                for (int row = 0; row < n; ++row) if (a[row].charAt(blackRow) == '#') anyFiller = true;
                if (anyFiller) {
                    untilBlackRow = Math.min(untilBlackRow, whites);
                    continue;
                }
                int extra = a[blackRow].charAt(blackRow) == '#' ? 1 : 0;
                for (int row = 0; row < n; ++row)
                    if (!emptyRow[row]) {
                        untilBlackRow = Math.min(untilBlackRow, 1 + whites + extra);
                    }
            }
            if (untilBlackRow == Integer.MAX_VALUE) {
                out.println(-1);
                return;
            }
            int res = untilBlackRow;
            for (int col = 0; col < n; ++col) {
                boolean hasWhites = false;
                for (int row = 0; row < n; ++row) {
                    if (a[row].charAt(col) == '.') hasWhites = true;
                }
                if (hasWhites) ++res;
            }
            out.println(res);
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

