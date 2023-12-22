import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
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
        DAxisParallelRectangle solver = new DAxisParallelRectangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAxisParallelRectangle {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            long[] x = new long[n];
            long[] y = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            long answer = Long.MAX_VALUE;
            for (int l = 0; l < n; l++) {
                for (int r = l; r < n; r++) {
                    if (x[l] > x[r])
                        continue;
                    List<Long> ys = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        if (x[i] <= x[r] && x[i] >= x[l]) {
                            ys.add(y[i]);
                        }
                    }
                    Collections.sort(ys);
                    for (int i = 0; i + k - 1 < ys.size(); i++) {
                        answer = Math.min(answer, (x[r] - x[l]) * (ys.get(i + k - 1) - ys.get(i)));
                    }
                }
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

