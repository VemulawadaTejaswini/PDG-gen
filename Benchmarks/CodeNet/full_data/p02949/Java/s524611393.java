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
        ArrayList<LinkedList<Integer>> reverseLinks = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            links.add(new LinkedList<>());
            reverseLinks.add(new LinkedList<>());
        }
        for (int i = 0; i < m; ++i) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt() - p;
            links.get(u).add(new int[]{v, w});
            reverseLinks.get(v).add(u);
        }
        Queue<Integer> reverseQueue = new LinkedList<>();
        boolean[] visit = new boolean[n];
        reverseQueue.add(n - 1);
        visit[n - 1] = true;
        reverseQueue.add(n - 1);
        while (!reverseQueue.isEmpty()) {
            int u = reverseQueue.poll();
            for (int v : reverseLinks.get(u)) {
                if (!visit[v]) {
                    reverseQueue.offer(v);
                    visit[v] = true;
                }
            }
        }

        if (!visit[0]) {
            writer.println(-1);
            writer.close();
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        long[] d = new long[n];
        int[] enqueue = new int[n];
        boolean[] inQueue = new boolean[n];
        Arrays.fill(d, Long.MIN_VALUE);
        d[0] = 0;
        enqueue[0] = 1;
        inQueue[0] = true;
        queue.offer(0);
        boolean loop = false;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            if (enqueue[u] > n) {
                loop = true;
                break;
            }
            inQueue[u] = false;
            for (int[] arc : links.get(u)) {
                int v = arc[0];
                int w = arc[1];
                if (visit[v] && d[v] < d[u] + w) {
                    d[v] = d[u] + w;
                    if (!inQueue[v]) {
                        queue.offer(v);
                        inQueue[v] = true;
                        ++enqueue[v];
                    }
                }
            }
        }
        if (!loop)
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