import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] queue = new int[m * n][2];
        int p, q;
        p = q = 0;
        char[][] grid = new char[m][n];
        int[][] d = new int[m][n];
        for (int i = 0; i < m; ++i) {
            grid[i] = scanner.next().toCharArray();
            for (int j = 0; j < n; ++j) {
                d[i][j] = -1;
                if (grid[i][j] == '#') {
                    d[i][j] = 0;
                    queue[q][0] = i;
                    queue[q++][1] = j;
                }
            }
        }
        final int[] rMove = new int[]{1, -1, 0, 0};
        final int[] cMove = new int[]{0, 0, 1, -1};
        while (p < q) {
            int r = queue[p][0];
            int c = queue[p][1];
            for (int i = 0; i < 4; ++i) {
                int newR = r + rMove[i];
                int newC = c + cMove[i];
                if (newR >= 0 && newR < m && newC >= 0 && newC < n && d[newR][newC] < 0) {
                    d[newR][newC] = d[r][c] + 1;
                    queue[q][0] = newR;
                    queue[q++][1] = newC;
                }
            }
            ++p;
        }
        writer.println(d[queue[q - 1][0]][queue[q - 1][1]]);
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