import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Denis Nedelyaev
 */
public class Main {
    public static void main(String[] args) throws Exception {
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        AtD solver = new AtD(System.in, out);
        solver.solve(1);
        out.close();
    }
 
    static class AtD {
        private final PrintWriter out;
        private List<Integer>[] children;
        private int maxHeight;
        private int[] depth;
 
        public AtD(InputStream inputStream, PrintWriter out) {
            in = inputStream;
            size = 0;
            this.out = out;
        }
 
        public void solve(int testNumber) throws InterruptedException {
            int n = nextInt();
            maxHeight =nextInt();
            int[] parent = new int[n];
 
            for (int i = 0; i < n; i++) {
                parent[i] = nextInt() - 1;
            }
 
            children = new List[n];
            for (int i = 0; i < n; i++) {
                children[i] = new ArrayList<>();
            }
            for (int i = 1; i < n; i++) {
                children[parent[i]].add(i);
            }
 
            depth = new int[n];
 
            Thread thread = new Thread(null, () -> calcDepth(0), "solution", 1 << 24);
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
 
        private int calcDepth(int v) {
            int ans = 0;
            for (int u : children[v]) {
                ans = Math.max(ans, calcDepth(u));
            }
 
            return depth[v] = ans + 1 == maxHeight ? 0 : 1 + ans;
        }
 
        private final InputStream in;
        private byte[] buffer = new byte[4096];
        private int pos = 0;
        private int size;
 
        public FastScanner(InputStream inputStream) throws IOException {
            in = inputStream;
            size = 0;
        }
 
        public int nextInt() {
            int c = skipWhitespace();
 
            int ans = 0;
 
            while (c > ' ') {
                ans *= 10;
                ans += c - '0';
                c = nextChar();
            }
 
            return ans;
        }
 
        private int skipWhitespace() {
            while (true) {
                int c = nextChar();
                if (c > ' ' || c == -1) {
                    return c;
                }
            }
        }
 
        private int nextChar() {
            if (pos >= size) {
                try {
                    size = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (size <= 0) {
                    return -1;
                }
                pos = 0;
            }
            return buffer[pos++];
        }
 
    }
}