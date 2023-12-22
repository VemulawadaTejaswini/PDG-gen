import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    private static int count;
    private static double totalDis;

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; ++i) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        boolean[] visited = new boolean[n];
        int[] a = new int[n];
        search(0, n, a, visited, 0, x, y);
        writer.println(totalDis / count);

        writer.close();
    }

    private static void search(int k, int n, int[] a, boolean[] visited, double dis, int[] x, int[] y) {
        if (k == n) {
            totalDis += dis;
            ++count;
        } else {
            for (int i = 0; i < n; ++i) {
                if (!visited[i]) {
                    a[k] = i;
                    visited[i] = true;
                    search(k + 1, n, a, visited, dis + (k > 0 ? Math.sqrt(Math.pow(x[a[k]] - x[a[k - 1]], 2) + Math.pow(y[a[k]] - y[a[k - 1]], 2)) : 0), x, y);
                    visited[i] = false;
                }
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