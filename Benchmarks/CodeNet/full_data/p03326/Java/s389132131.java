import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        DPatisserieABC solver = new DPatisserieABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPatisserieABC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] x = new long[n];
            long[] y = new long[n];
            long[] z = new long[n];

            for (int i = 0; i < n; i++) {
                x[i] = in.nextLong();
                y[i] = in.nextLong();
                z[i] = in.nextLong();
            }

            long answer = Long.MIN_VALUE;
            for (int X = -1; X <= 1; X += 2) {
                for (int Y = -1; Y <= 1; Y += 2) {
                    for (int Z = -1; Z <= 1; Z += 2) {
                        PriorityQueue<Long> scores = new PriorityQueue<>(Comparator.reverseOrder());
                        for (int i = 0; i < n; i++) {
                            scores.add(x[i] * X + y[i] * Y + z[i] * Z);
                        }
                        long candidate = 0;
                        for (int i = 0; i < m; i++) {
                            candidate += scores.poll();
                        }

                        answer = Math.max(answer, candidate);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

