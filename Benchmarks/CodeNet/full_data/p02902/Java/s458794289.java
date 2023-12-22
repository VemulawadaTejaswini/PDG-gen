import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jenish
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FPure solver = new FPure();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPure {
        ArrayList<Integer>[] g;
        boolean[] visited;
        HashSet<Integer> ans;
        HashSet<Integer> stack;

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int m = in.scanInt();

            visited = new boolean[n + 1];
            g = new ArrayList[n + 1];

            for (int i = 0; i <= n; i++) g[i] = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int a = in.scanInt();
                int b = in.scanInt();
                g[a].add(b);
            }

            boolean iscycle = false;

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    stack = new HashSet<>();
                    iscycle |= dfs(i);
                }
            }


            if (!iscycle) {
                out.println(-1);
            } else {
                out.println(ans.size());
                for (int kk : ans) out.println(kk);
            }
        }

        boolean dfs(int node) {
            visited[node] = true;
            stack.add(node);
            for (int k : g[node]) {
                if (!visited[k]) {
                    if (dfs(k)) return true;
                } else {
                    if (stack.contains(k)) {
                        ans = new HashSet<>();
                        for (int pp : stack) ans.add(pp);
                        return true;
                    }
                }
            }
            stack.remove(node);
            return false;
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int INDEX;
        private BufferedInputStream in;
        private int TOTAL;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (INDEX >= TOTAL) {
                INDEX = 0;
                try {
                    TOTAL = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TOTAL <= 0) return -1;
            }
            return buf[INDEX++];
        }

        public int scanInt() {
            int I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

