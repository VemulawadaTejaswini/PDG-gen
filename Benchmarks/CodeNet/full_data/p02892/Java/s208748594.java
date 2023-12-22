import java.io.*;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        char[][] matrix = new char[n][];
        for (int i = 0; i < n; ++i)
            matrix[i] = scanner.next().toCharArray();
        int ans = -1;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, bfs(matrix, i));
        }
        writer.println(ans);

        writer.close();
    }

    private static int bfs(char[][] matrix, int root) {
        int n = matrix.length;
        int[] d = new int[n];
        d[root] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        int result = 1;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            result = d[u];
            for (int v = 0; v < n; ++v) {
                if (matrix[u][v] == '1') {
                    if (d[v] == 0) {
                        d[v] = d[u] + 1;
                        queue.offer(v);
                    } else if (d[v] != d[u] - 1 && d[v] != d[u] + 1)
                        return -1;
                }
            }
        }
        return result;
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