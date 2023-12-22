import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPalace solver = new BPalace();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPalace {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints(), t = in.ints() * 1000, a = in.ints() * 1000;
            Long min = Long.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < n; i++) {
                int h = in.ints();
                long abs = Math.abs(a - t + 6 * h);
                if (abs < min) {
                    min = abs;
                    index = i;
                }
            }
            out.println(index + 1);
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

