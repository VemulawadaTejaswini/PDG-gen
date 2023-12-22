import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        char[] s = scanner.next().toCharArray();
        int n = s.length;
        int k = scanner.nextInt();
        int[][] f = new int[n][2];
        long ans = (long) n * k;
        f[0][0] = 0;
        f[0][1] = n;
        for (int i = 1; i < n; ++i) {
            f[i][0] = s[i] == s[i - 1] ? f[i - 1][1] : Math.min(f[i - 1][0], f[i - 1][1]);
            f[i][1] = Math.min(f[i - 1][0], f[i - 1][1]) + 1;
        }
        ans = Math.min(ans, (long) f[n - 1][0] * k + (s[n - 1] == s[0] ? k - 1 : 0));
        ans = Math.min(ans, (long) f[n - 1][1] * k);
        f[n - 1][0] = 0;
        f[n - 1][1] = n;
        for (int i = n - 2; i >= 0; --i) {
            f[i][0] = s[i] == s[i + 1] ? f[i + 1][1] : Math.min(f[i + 1][0], f[i + 1][1]);
            f[i][1] = Math.min(f[i + 1][0], f[i + 1][1]) + 1;
        }
        ans = Math.min(ans, (long) f[0][0] * k + (s[n - 1] == s[0] ? k - 1 : 0));
        ans = Math.min(ans, (long) f[0][1] * k);
        writer.println(ans);

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

        private void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        private char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        private String next() {
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

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}