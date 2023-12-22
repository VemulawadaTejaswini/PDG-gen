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
import java.io.UnsupportedEncodingException;
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

        public void solve(int testNumber) throws InterruptedException {
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

            Thread thread = new Thread(null, this::solve, "solution", 1 << 24);
            thread.setUncaughtExceptionHandler((t, e) -> {
                throw new RuntimeException(e);
            });
            thread.start();
            thread.join();

            int ans = 0;
            if (parent[0] != 0) {
                ans++;
            }

            for (int v = 1; v < n; v++) {
                if (parent[v] != 0 && depth[v] == 0) {
                    ans++;
                }
            }

            out.println(ans);
        }

        private void solve() {
            calcDepth(0);
        }

        private int calcDepth(int v) {
            int ans = 0;
            for (int u : children[v]) {
                ans = Math.max(ans, calcDepth(u));
            }

            return depth[v] = (ans + 1) % maxHeight == 0 ? 0 : 1 + ans;
        }

    }

    static class FastScanner {
        private final BufferedReader br;
        private String line;
        private int pos;

        public FastScanner(String s) {
            this(new StringReader(s));
        }

        public FastScanner(InputStream is) throws UnsupportedEncodingException {
            this(new InputStreamReader(is, "US-ASCII"));
        }

        public FastScanner(Reader reader) {
            this(new BufferedReader(reader));
        }

        public FastScanner(BufferedReader reader) {
            br = reader;
            try {
                line = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            pos = 0;
        }

        public String next() {
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        private boolean skipWhitespace() {
            while (line != null) {
                while (pos < line.length()) {
                    char c = line.charAt(pos);

                    if (c != ' ' && c != '\t') {
                        return true;
                    }

                    pos++;
                }

                try {
                    line = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                pos = 0;
            }

            return false;
        }

    }
}

