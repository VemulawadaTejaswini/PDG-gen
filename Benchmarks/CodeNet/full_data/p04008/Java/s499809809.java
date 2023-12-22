import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Denis Nedelyaev
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AtD solver = new AtD(in, out);
        solver.solve(1);
        out.close();
    }

    static class AtD {
        private final FastScanner in;
        private final PrintWriter out;
        private List<Integer>[] children;
        private int maxHeight;
        private int[] depth;
        private int[] parent;

        public AtD(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) throws IOException, InterruptedException {
            Thread thread = new Thread(null, () -> {
                try {
                    solve();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }, "solution", 1 << 24);
            thread.setUncaughtExceptionHandler((t, e) -> {
                throw new RuntimeException(e);
            });
            thread.start();
            thread.join();
        }

        private void solve() throws IOException {
            int n = in.nextInt();
            maxHeight = in.nextInt();
            parent = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = in.nextInt() - 1;
            }

            children = new List[n];
            for (int i = 0; i < n; i++) {
                children[i] = new ArrayList<>();
            }
            for (int i = 1; i < n; i++) {
                children[parent[i]].add(i);
            }

            depth = new int[n];
            calcDepth(0);

            out.println((parent[0] == 0 ? 0 : 1) + calc(0));
        }

        private int calcDepth(int v) {
            int ans = 0;
            for (int u : children[v]) {
                ans = Math.max(ans, calcDepth(u));
            }

            return depth[v] = (ans + 1) % maxHeight == 0 ? 0 : 1 + ans;
        }

        private int calc(int v) {
            int ans = 0;

            if (v != 0 && parent[v] != 0 && depth[v] == 0) {
                ans++;
            }

            for (int u : children[v]) {
                ans += calc(u);
            }

            return ans;
        }

    }

    static class FastScanner {
        private final BufferedInputStream in;

        public FastScanner(InputStream inputStream) throws IOException {
            this(new BufferedInputStream(inputStream));
        }

        public FastScanner(BufferedInputStream inputStream) throws IOException {
            in = inputStream;
        }

        public int nextInt() throws IOException {
            skipWhitespace();

            int ans = 0;

            while (true) {
                int c = in.read();
                if (c <= ' ') {
                    break;
                }
                ans *= 10;
                ans += c - '0';
            }

            return ans;
        }

        private void skipWhitespace() throws IOException {
            while (true) {
                in.mark(1);
                int c = in.read();
                if (c > ' ' || c == -1) {
                    in.reset();
                    break;
                }
            }
        }

    }
}

