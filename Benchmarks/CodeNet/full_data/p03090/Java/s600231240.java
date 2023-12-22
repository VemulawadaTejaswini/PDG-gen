import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStreamReader;
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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();

            List<Edge> ans = new LinkedList<>();
            int mid = n + 1;
            if (n % 2 == 1)
                mid = n;
            for (int i = 1; i <= n; i++) {
                if (n % 2 == 1 && i == n) {
                    break;
                }
                for (int j = i + 1; j <= n; j++) {
                    if (j == mid - i)
                        continue;
                    ans.add(new Edge(i, j));
                }
            }
            out.println(ans.size());
            for (Edge edge : ans) {
                out.println(edge.a + " " + edge.b);
            }
        }

        class Edge {
            int a;
            int b;

            public Edge(int a, int b) {
                this.a = a;
                this.b = b;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int ni() {
            return Integer.parseInt(ns());
        }

    }
}

