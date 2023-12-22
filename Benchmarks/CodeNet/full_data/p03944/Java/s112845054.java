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
        B2SnukesColoring2ABCEdit solver = new B2SnukesColoring2ABCEdit();
        solver.solve(1, in, out);
        out.close();
    }

    static class B2SnukesColoring2ABCEdit {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int w = in.ints(), h = in.ints(), n = in.ints();
            int xmax = w, xmin = 0, ymax = h, ymin = 0;
            for (int i = 0; i < n; i++) {
                int x = in.ints(), y = in.ints(), a = in.ints();
                switch (a) {
                    case 1:
                        xmin = x;
                        break;
                    case 2:
                        xmax = x;
                        break;
                    case 3:
                        ymin = y;
                        break;
                    case 4:
                        ymax = y;
                        break;
                }
            }
            if (xmax <= xmin || ymax <= ymin) {
                out.println(0);
            } else {
                out.println((xmax - xmin) * (ymax - ymin));
            }
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

