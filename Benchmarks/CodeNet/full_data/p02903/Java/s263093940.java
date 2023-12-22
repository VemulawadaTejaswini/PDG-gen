import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            int h = in.nextInt();
            int w = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            for (int na = 0; na <= h; ++na) {
                for (int nb = 0; nb <= w; ++nb) {
                    if (na * a + (h - na) * (w - a) == nb * b + (w - nb) * (h - b)) {
                        long[] togo = new long[w];
                        Arrays.fill(togo, h - b);
                        for (int i = 0; i < nb; ++i) togo[i] = b;
                        for (int i = 0; i < w; ++i) togo[i] = togo[i] * w + i;
                        char[] res = new char[w];
                        for (int r = 0; r < h; ++r) {
                            int need = (r < na) ? a : w - a;
                            Arrays.sort(togo);
                            Arrays.fill(res, '0');
                            for (int i = 0; i < need; ++i) {
                                int at = (int) (togo[w - 1 - i] % w);
                                res[at] = '1';
                                togo[w - 1 - i] -= w;
                            }
                            out.println(new String(res));
                        }
                        return;
                    }
                }
            }
            out.println(-1);
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

