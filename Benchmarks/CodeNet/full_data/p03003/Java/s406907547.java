import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        final int MOD = 1000000007;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a, b;
        a = new int[n + 1];
        b = new int[m + 1];
        for (int i = 1; i <= n; ++i)
            a[i] = scanner.nextInt();
        for (int j = 1; j <= m; ++j)
            b[j] = scanner.nextInt();
        int[][] g = new int[n + 1][m + 1];
        for (int i = 0; i <= n; ++i)
            g[i][0] = 1;
        for (int j = 0; j <= m; ++j)
            g[0][j] = 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                g[i][j] = (g[i][j - 1] + g[i - 1][j]) % MOD;
                if (a[i] != b[j])
                    g[i][j] -= g[i - 1][j - 1];
                g[i][j] = (g[i][j] + MOD) % MOD;
            }
        }
        writer.println(g[n][m]);
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