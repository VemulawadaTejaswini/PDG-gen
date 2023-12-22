
import java.io.*;
import java.util.*;

public class Main {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Scanner sc = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] p = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            p[i] = in.nextInt();
        }

        List[] g = new List[n + 1];

        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }

        for (int i = 1; i <= m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            g[x].add(y);
            g[y].add(x);
        }

        boolean[] vis = new boolean[n + 1];

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                ind.clear();
                num.clear();
                dfs(i, g, p, vis);

                for (Integer cn : ind) {
                    if (num.contains(cn))
                        ans++;
                }
            }
        }

        System.out.println(ans);
    }

    Set<Integer> ind = new HashSet<>();
    Set<Integer> num = new HashSet<>();

    void dfs(int u, List[] g, int[] p, boolean[] vis) {

        ind.add(u);
        num.add(p[u]);

        vis[u] = true;

        for (int i = 0; i < g[u].size(); i++) {
            int v = (int) g[u].get(i);

            if (!vis[v])
                dfs(v, g, p, vis);
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        Main solver = new Main();
        solver.solve(1, in, out);
        out.close();
    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}
