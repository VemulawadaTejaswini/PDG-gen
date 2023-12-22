import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
        TwoArrays solver = new TwoArrays();
        solver.solve(1, in, out);
        out.close();
    }

    static class TwoArrays {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(0, n), b = in.nextIntArray(0, n);
            int aCapacity = 0, bRequire = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) aCapacity += (b[i] - a[i]) - ((b[i] - a[i]) % 2);
                if (a[i] > b[i]) bRequire += a[i] - b[i];
            }
            if (bRequire * 2 <= aCapacity) out.println("Yes");
            else out.println("No");
        }

    }

    static class InputReader {
        private StringTokenizer tokenizer;
        private BufferedReader reader;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
        }

        private void fillTokenizer() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            fillTokenizer();
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int offset, int length) {
            int[] arr = new int[offset + length];
            for (int i = offset; i < offset + length; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

    }
}

