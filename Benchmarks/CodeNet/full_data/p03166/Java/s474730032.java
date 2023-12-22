import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.util.Deque;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        G solver = new G();
        solver.solve(1, in, out);
        out.close();
    }

    static class G {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int M = in.Int();
            int[] dp = new int[N + 1];
            List<G.Node> nodes = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {
                G.Node node = new G.Node(i + 1);
                nodes.add(node);
            }
            boolean[] f = new boolean[N];
            for (int i = 0; i < M; i++) {
                int x = in.Int();
                int y = in.Int();
                nodes.get(x - 1).out.add(y);
                nodes.get(y - 1).in++;
                f[y - 1] = true;
            }
            List<G.Node> list = new ArrayList<>(N);
            Deque<G.Node> que = new ArrayDeque<>(N);
            for (G.Node node : nodes) {
                if (node.in != 0) continue;
                que.add(node);
            }
            while (!que.isEmpty()) {
                G.Node node = que.poll();
                list.add(node);
                for (int y : node.out) {
                    nodes.get(y - 1).in--;
                    if (nodes.get(y - 1).in == 0) {
                        que.add(nodes.get(y - 1));
                    }
                }
            }
            for (G.Node node : list) {
                for (int i : node.out) {
                    dp[i] = Math.max(dp[i], dp[node.n] + 1);
                }
            }
            out.println(dp[list.get(N - 1).n]);
        }

        static class Node {
            int n;
            int in;
            List<Integer> out = new ArrayList<>();

            Node(int n) {
                this.n = n;
            }

        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
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

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

