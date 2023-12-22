import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        ArrayList<LinkedList<int[]>> links = new ArrayList<>(n);
        for (int i = 0; i < n; ++i)
            links.add(new LinkedList<>());
        for (int i = 0; i < m; ++i) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt() - p;
            links.get(u).add(new int[]{v, w});
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] d = new int[n];
        int[] enqueue = new int[n];
        boolean[] inQueue = new boolean[n];
        Arrays.fill(d, Integer.MIN_VALUE);
        d[0] = 0;
        enqueue[0] = 1;
        inQueue[0] = true;
        queue.offer(0);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            inQueue[u] = false;
            for (int[] arc : links.get(u)) {
                int v = arc[0];
                int w = arc[1];
                if (d[v] < d[u] + w) {
                    d[v] = d[u] + w;
                    if (!inQueue[v] && enqueue[v] <= n) {
                        queue.offer(v);
                        inQueue[v] = true;
                        ++enqueue[v];
                    }
                }
            }
        }
        if (enqueue[n - 1] > 0 && enqueue[n - 1] <= n)
            writer.println(Math.max(d[n - 1], 0));
        else
            writer.println(-1);
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
            return Integer.valueOf(next());
        }

        private long nextLong() {
            return Long.valueOf(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}