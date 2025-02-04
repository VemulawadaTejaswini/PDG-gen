import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.StringReader;
import java.io.BufferedReader;
import java.io.InputStream;

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
        private final BufferedReader br;
        private String line;
        private int pos;

        public FastScanner(String s) throws IOException {
            this(new StringReader(s));
        }

        public FastScanner(InputStream is) throws IOException {
            this(new InputStreamReader(is, "UTF-8"));
        }

        public FastScanner(Reader reader) throws IOException {
            this(new BufferedReader(reader));
        }

        public FastScanner(BufferedReader reader) throws IOException {
            br = reader;
            line = br.readLine();
            pos = 0;
        }

        public String next() throws IOException {
            if (!skipWhitespace()) {
                return null;
            }

            int start = pos;

            while (pos < line.length()) {
                char c = line.charAt(pos);

                if (c == ' ' || c == '\t') {
                    break;
                }

                pos++;
            }

            return line.substring(start, pos);
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        private boolean skipWhitespace() throws IOException {
            while (line != null) {
                while (pos < line.length()) {
                    char c = line.charAt(pos);

                    if (c != ' ' && c != '\t') {
                        return true;
                    }

                    pos++;
                }

                line = br.readLine();
                pos = 0;
            }

            return false;
        }

    }
}

