import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        Graph graph;
        boolean flg = false;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            graph = new Graph(n);
            for (int i = 0; i < m; i++) {
                int from = in.nextInt() - 1;
                int to = in.nextInt() - 1;

                graph.addUndirectedEdge(from, to);
            }

            int[] no = new int[n];
            rec(no, 0, 1);

            if (flg) {
                long ans = (long) n * (n - 1) / 2 - m;
                out.println(ans);
            } else {
                long cnt1 = 0;
                long cnt2 = 0;
                for (int i = 0; i < n; i++) {
                    if (no[i] == 1) {
                        cnt1++;
                    } else if (no[i] == 2) {
                        cnt2++;
                    } else {
                        throw new RuntimeException();
                    }
                }

                out.println(cnt1 * cnt2 - m);
            }
        }

        void rec(int[] no, int x, int tmpNo) {
            no[x] = tmpNo;
            List<Integer> list = new ArrayList<>();
            for (int to : graph.get(x)) {
                if (no[to] == 0) {
                    list.add(to);
                } else {
                    if (no[to] == tmpNo) {
                        flg = true;
                    }
                }
            }

            for (int to : list) {
                no[to] = 3 - tmpNo;
                rec(no, to, 3 - tmpNo);
            }
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }

    static class Graph {
        int n;
        ArrayList<Integer>[] G;

        public Graph(int n) {
            this.n = n;
            G = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                G[i] = new ArrayList<>();
            }
        }

        public void addUndirectedEdge(int from, int to) {
            G[from].add(to);
            G[to].add(from);
        }

        public ArrayList<Integer> get(int from) {
            return G[from];
        }

    }
}

