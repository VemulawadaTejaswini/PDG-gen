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
        D756 solver = new D756();
        solver.solve(1, in, out);
        out.close();
    }

    static class D756 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.NextInt();
            int[] primesFactors = new int[101];
            for (int i = 2; i <= n; i++) {
                addPrimes(primesFactors, i);
            }
            int res = 0;
            for (int i = 2; i <= 100; i++) {
                if (primesFactors[i] >= 4)
                    for (int j = i + 1; j <= 100; j++) {
                        if (primesFactors[j] >= 4)
                            for (int k = 2; k <= 100; k++) {
                                if (primesFactors[k] >= 2)
                                    if (k != i && k != j) {
                                        res++;
                                    }
                            }
                    }
            }
            for (int i = 2; i <= 100; i++) {
                if (primesFactors[i] >= 24)
                    for (int k = 2; k <= 100; k++) {
                        if (primesFactors[k] >= 2)
                            if (k != i) {
                                res++;
                            }
                    }
            }
            for (int i = 2; i <= 100; i++) {
                if (primesFactors[i] >= 14)
                    for (int k = 2; k <= 100; k++) {
                        if (primesFactors[k] >= 4)
                            if (k != i) {
                                res++;
                            }
                    }
            }
            for (int i = 2; i <= 100; i++) {
                if (primesFactors[i] >= 74)
                    res++;
            }
            out.println(res);
        }

        private void addPrimes(int[] primesFactors, int i) {
            while (i != 1) {
                for (int j = 2; j <= i; j++) {
                    while (i % j == 0) {
                        primesFactors[j]++;
                        i /= j;
                    }
                }
            }
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
}

