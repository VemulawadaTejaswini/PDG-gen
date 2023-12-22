import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DABS solver = new DABS();
        solver.solve(1, in, out);
        out.close();
    }

    static class DABS {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int first = in.nextInt(), second = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[n - 1 - i] = in.nextInt();
            }
            a[n] = second;
            System.out.println(n + " " + Arrays.toString(a));

            if (n == 1) {
                out.println(Math.abs(second - a[0]));
                return;
            }

            int[] min = new int[n];
            int[] max = new int[n];
            min[0] = max[0] = Math.abs(a[0] - a[1]);
            for (int i = 1; i < n; i++) {
                min[i] = Math.abs(a[0] - a[i + 1]);
                for (int j = 0; j < i; j++) {
                    min[i] = Math.min(min[i], max[j]);
                }
                max[i] = Math.abs(a[0] - a[i + 1]);
                for (int j = 0; j < i; j++) {
                    max[i] = Math.max(max[i], min[j]);
                }
            }

            int answer = max[n - 1];
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

