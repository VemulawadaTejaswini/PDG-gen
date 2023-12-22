import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        if ((n & -n) == n)
            writer.println("No");
        else {
            writer.println("Yes");
            ArrayList<int[]> ans = new ArrayList<>(2 * n);
            ans.add(new int[]{n + 1, n + 2});
            for (int i = 2; i < n; i += 2) {
                ans.add(new int[]{1, i});
                ans.add(new int[]{i, i + 1});
                ans.add(new int[]{1, n + i + 1});
                ans.add(new int[]{n + i, n + i + 1});
            }

            if (n % 2 == 0) {
                for (int i = 2; i < n; ++i) {
                    if ((n ^ i ^ 1) < n) {
                        int t = n ^ i ^ 1;
                        ans.add(new int[]{i % 2 == 0 ? i : n + i, n});
                        ans.add(new int[]{t % 2 == 0 ? t : n + t, n + n});
                        break;
                    }
                }
            }

            for (int[] edge : ans) {
                writer.println(edge[0] + " " + edge[1]);
            }
        }

        writer.close();
    }

    private static int dfs(int u, Arc[] arcs, int[] head, int[] visited, ArrayList<Arc> ans) {
        visited[u] = 1;
        int outDegree = 0;
        for (int idx = head[u]; idx != -1; ) {
            Arc arc = arcs[idx];
            int v = arc.to;
            switch (visited[v]) {
                case 0:
                    int vOutDegree = dfs(v, arcs, head, visited, ans);
                    if (vOutDegree % 2 == 0) {
                        ans.add(new Arc(u, v));
                        ++outDegree;
                    } else
                        ans.add(new Arc(v, u));
                    break;
                case 2:
                    ans.add(new Arc(u, v));
                    ++outDegree;
                    break;
            }
            idx = arc.next;
        }
        visited[u] = 2;
        return outDegree;
    }

    private static class Arc {
        int from, to, next;

        Arc(int from, int to) {
            this(from, to, -1);
        }

        Arc(int from, int to, int next) {
            this.from = from;
            this.to = to;
            this.next = next;
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