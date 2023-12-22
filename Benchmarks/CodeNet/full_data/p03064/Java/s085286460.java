import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        final int MODULO = 998244353;
        int n = scanner.nextInt();
        int[] x = new int[n + 1];
        int[] sum = new int[n + 1];
        x[0] = sum[0] = 0;
        for (int i = 1; i <= n; ++i) {
            x[i] = scanner.nextInt();
            sum[i] = sum[i - 1] + x[i];
        }
        int[][] f = new int[n + 1][sum[n] + 1];
        int[][] g = new int[n + 1][sum[n] + 1];
        Arrays.fill(f[0], 0);
        Arrays.fill(g[0], 0);
        f[0][0] = 1;
        g[0][0] = 1;
        int r = 1;
        for (int i = 1; i <= n; ++i) {
            r = (r * 3) % MODULO;
            Arrays.fill(f[i], 0);
            Arrays.fill(g[i], 0);
            for (int j = 0; j <= sum[i - 1]; ++j) {
                f[i][j] = f[i - 1][j] * 2 % MODULO;
                g[i][j] = g[i - 1][j] % MODULO;
            }
            for (int j = x[i]; j <= sum[i]; ++j) {
                f[i][j] = (f[i][j] + f[i - 1][j - x[i]]) % MODULO;
                g[i][j] = (g[i][j] + g[i - 1][j - x[i]]) % MODULO;
            }
        }
        for (int i = sum[n] % 2 == 0 ? sum[n] / 2 : sum[n] / 2 + 1; i <= sum[n]; ++i) {
            r = (r - f[n][i] * 3 % MODULO) % MODULO;
        }
        if (sum[n] % 2 == 0) {
            r = (r + 3 * g[n][sum[n] / 2] % MODULO) % MODULO;
        }
        writer.println((r + MODULO) % MODULO);

        writer.close();
    }

    private static class SimpleScanner {

        private static final int BUFFER_SIZE = 10240;

        private Readable in;
        private CharBuffer buffer;
        private boolean eof;

        SimpleScanner(InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
            buffer = CharBuffer.allocate(BUFFER_SIZE);
            buffer.limit(0);
            eof = false;
        }


        private char read() {
            if (!buffer.hasRemaining()) {
                buffer.clear();
                int n;
                try {
                    n = in.read(buffer);
                } catch (IOException e) {
                    n = -1;
                }
                if (n <= 0) {
                    eof = true;
                    return '\0';
                }
                buffer.flip();
            }
            return buffer.get();
        }

        void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        String next() {
            char b;
            do {
                b = read();
                checkEof();
            } while (Character.isWhitespace(b));
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(b);
                b = read();
            } while (!eof && !Character.isWhitespace(b));
            return sb.toString();
        }

        int nextInt() {
            return Integer.valueOf(next());
        }

        long nextLong() {
            return Long.valueOf(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}