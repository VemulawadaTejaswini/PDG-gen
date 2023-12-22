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
        CWhenIHitMyPocket solver = new CWhenIHitMyPocket();
        solver.solve(1, in, out);
        out.close();
    }

    static class CWhenIHitMyPocket {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int k = in.NextInt(), a = in.NextInt(), b = in.NextInt();
            long gainPerOperation = b - a;
            if (gainPerOperation <= 2) {
                out.println(k + 1);
            } else if (k <= (a - 1) + 1) {
                out.println(k + 1);
            } else {
                k -= a - 1;
                long startBisc = a;
                int numberOfOperation = k / 2;
                long biscAtTheEnd = startBisc + gainPerOperation * numberOfOperation;
                k -= numberOfOperation * 2;
                while (k != 0) {
                    k--;
                    biscAtTheEnd++;
                }
                out.println(biscAtTheEnd);

            }
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

