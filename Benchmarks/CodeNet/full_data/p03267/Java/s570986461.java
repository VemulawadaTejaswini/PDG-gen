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
            int l = in.nextInt(), bitn = 0;
            while (1 << bitn < l) {
                ++bitn;
            }
            out.printf("%d %d\n", bitn + 1, bitn * 2);
            for (int i = 1; i <= bitn; ++i) {
                out.printf("%d %d 0\n", i, i + 1);
                out.printf("%d %d %d\n", i, i + 1, 1 << i - 1);
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

