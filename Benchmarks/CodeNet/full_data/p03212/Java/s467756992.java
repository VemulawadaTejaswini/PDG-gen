import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        C755 solver = new C755();
        solver.solve(1, in, out);
        out.close();
    }

    static class C755 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.NextInt();
            long x = 357;
            int res = 0;
            while (x <= n) {
                if (isOk(x)) {
                    res++;
                }
                x = next(x);
            }
            out.println(res);
        }

        private long next(long x) {
            long divide = 1;
            while (true) {
                long cur = (x / divide) % 10;
                if (cur != 7) {
                    if (cur != 0) {
                        x += 2 * divide;
                    } else {
                        x += 3 * divide;
                    }
                    return x;
                } else {
                    x -= 4 * divide;
                }
                divide *= 10;
            }
        }

        private boolean isOk(long x) {
            return has(x, 3) && has(x, 5) && has(x, 7);
        }

        private boolean has(long x, int i) {
            while (x != 0) {
                if (x % 10 == i) return true;
                x /= 10;
            }
            return false;
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(Writer out) {
            super(out);
        }

        public OutputWriter(File file) throws FileNotFoundException {
            super(file);
        }

        public OutputWriter(OutputStream out) {
            super(out);
        }

    }
}

