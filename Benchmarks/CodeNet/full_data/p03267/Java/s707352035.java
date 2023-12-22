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
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DAllYourPathsAreDifferentLengths solver = new DAllYourPathsAreDifferentLengths();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAllYourPathsAreDifferentLengths {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int l = in.nextInt(), bitn = 0, u[] = new int[70], v[] = new int[70], w[] = new int[70], tot = 0;
            --l;
            for (bitn = 30; (1 << bitn & l) == 0; --bitn) ;

            for (int i = bitn; i >= 0; --i) {
                u[tot] = i + 1;
                v[tot] = i;
                w[tot] = 0;
                ++tot;
                if ((1 << i & l) > 0) {
                    int nxt = i - 1;
                    while (nxt >= 0 && (1 << nxt & l) == 0) --nxt;
                    if (i > 0) {
                        u[tot] = i + 1;
                        v[tot] = nxt + 1;
                        w[tot] = 1 << i;
                    }
                } else {
                    u[tot] = i + 1;
                    v[tot] = i;
                    w[tot] = 1 << i;
                }
                ++tot;
            }

            out.printf("%d %d\n", bitn + 2, tot);
            for (int i = 0; i < tot; ++i) {
                out.printf("%d %d %d\n", bitn + 2 - u[i], bitn + 2 - v[i], w[i]);
            }
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

