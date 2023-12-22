import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char[][] grid = new char[h][];
        int[][] u = new int[h][w];
        int[][] d = new int[h][w];
        int[][] l = new int[h][w];
        int[][] r = new int[h][w];
        for (int i = 0; i < h; ++i) {
            Arrays.fill(u[i], 0);
            Arrays.fill(d[i], 0);
            Arrays.fill(l[i], 0);
            Arrays.fill(r[i], 0);
        }
        for (int i = 0; i < h; ++i) {
            grid[i] = scanner.next().toCharArray();
            for (int j = 0; j < w; ++j) {
                if (grid[i][j] == '.') {
                    if (i > 0 && grid[i - 1][j] == '.')
                        u[i][j] = u[i - 1][j] + 1;
                    if (j > 0 && grid[i][j - 1] == '.')
                        l[i][j] = l[i][j - 1] + 1;
                }
            }
        }
        for (int i = h - 1; i >= 0; --i) {
            for (int j = w - 1; j >= 0; --j) {
                if (grid[i][j] == '.') {
                    if (i < h - 1 && grid[i + 1][j] == '.')
                        d[i][j] = d[i + 1][j] + 1;
                    if (j < w - 1 && grid[i][j + 1] == '.')
                        r[i][j] = r[i][j + 1] + 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < h; ++i)
            for (int j = 0; j < w; ++j)
                if (grid[i][j] == '.')
                    ans = Math.max(ans, u[i][j] + d[i][j] + l[i][j] + r[i][j] + 1);
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