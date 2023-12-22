import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int inf = 100000000;

            Task.Path[][] g = new Task.Path[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    g[i][j] = new Task.Path(inf);

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                int c = in.nextInt();
                Task.Path p = new Task.Path(c);
                g[a][b] = p;
                g[b][a] = p;
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (g[i][j].getC() > g[i][k].getC() + g[k][j].getC()) {
                            Task.Path p = new Task.Path(g[i][k], g[k][j]);
                            g[i][j] = p;
                            g[j][i] = p;
                        }
                    }
                }
            }

            Set<Task.Path> passed = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (g[i][j].getC() != inf)
                        passed.addAll(g[i][j].getPaths());
                }
            }
            out.println(m - passed.size());
        }

        static class Path {
            private int c;
            private Set<Task.Path> paths = new HashSet<>();

            Path(int c) {
                this.c = c;
                paths.add(this);
            }

            Path(Task.Path p1, Task.Path p2) {
                this.c = p1.c + p2.c;
                paths.addAll(p1.paths);
                paths.addAll(p2.paths);
            }

            public int getC() {
                return c;
            }

            public Set<Task.Path> getPaths() {
                return paths;
            }

        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }
}

