import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.BitSet;
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
        FNamoriGrundy solver = new FNamoriGrundy();
        solver.solve(1, in, out);
        out.close();
    }

    static class FNamoriGrundy {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] p = new int[n];
            int[] degree = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt() - 1;
                degree[p[i]]++;
            }

            boolean valid = true;

            outer:
            for (int start = 0; start < n; start++) {
                int len = 1;

                BitSet visited = new BitSet();
                for (int i = p[start]; !visited.get(i); i = p[i], len++) {
                    visited.set(i);
                    if (i == start) {
                        int min = Integer.MAX_VALUE;
                        int max = 0;
                        for (int j = visited.nextSetBit(0); j != -1; j = visited.nextSetBit(j + 1)) {
                            min = Math.min(min, degree[j]);
                            max = Math.max(max, degree[j]);
                        }
                        valid = len % 2 == 0 || max > min;
                        break outer;
                    }
                }
            }

            String answer = valid ? "POSSIBLE" : "IMPOSSIBLE";

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

