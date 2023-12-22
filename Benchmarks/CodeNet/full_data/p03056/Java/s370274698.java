import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        char[][] grid = new char[r][];
        int[][] bit = new int[r + 1][c + 1];
        for (int i = 0; i < r; ++i) {
            grid[i] = scanner.next().toCharArray();
            for (int j = 0; j < c; ++j) {
                if (grid[i][j] == '#') {
                    bitAdd(bit, r, c, i + 1, j + 1, 1);
                }
            }
        }
        writer.println(solve(bit, 1, 1, r, c));

        writer.close();
    }

    private static int solve(int[][] bit, int x0, int y0, int x1, int y1) {
        int sum = bitSum(bit, x1, y1) - bitSum(bit, x0 - 1, y1) - bitSum(bit, x1, y0 - 1) + bitSum(bit, x0 - 1, y0 - 1);
        if (sum == 0 || sum == (x1 - x0 + 1) * (y1 - y0 + 1))
            return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = x0; i < x1; ++i) {
            int k1 = solve(bit, x0, y0, i, y1);
            int k2 = solve(bit, i + 1, y0, x1, y1);
            int k = Math.max(k1, k2) + 1;
            ans = Math.min(ans, k);
        }
        for (int i = y0; i < y1; ++i) {
            int k1 = solve(bit, x0, y0, x1, i);
            int k2 = solve(bit, x0, i + 1, x1, y1);
            int k = Math.max(k1, k2) + 1;
            ans = Math.min(ans, k);
        }
        return ans;
    }

    private static int bitSum(int[][] bit, int x, int y) {
        int sum = 0;
        for (int i = x; i > 0; i -= (i & -i)) {
            for (int j = y; j > 0; j -= (j & -j)) {
                sum += bit[i][j];
            }
        }
        return sum;
    }


    private static void bitAdd(int[][] bit, int r, int c, int x, int y, int val) {
        for (int i = x; i <= r; i += (i & -i)) {
            for (int j = y; j <= c; j += (j & -j)) {
                bit[i][j] += val;
            }
        }
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