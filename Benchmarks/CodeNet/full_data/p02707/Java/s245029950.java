import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.util.function.IntFunction;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CManagement solver = new CManagement();
        solver.solve(1, in, out);
        out.close();
    }

    static class CManagement {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.readInt();

            CManagement.TreeAlgo treeAlgo = new CManagement.TreeAlgo(n);
            for (int i = 0; i < n - 1; i++) {
                treeAlgo.addEdge(i + 1, in.readInt() - 1);
            }

            treeAlgo.dfsCountChild(0, 0);

            for (int i = 0; i < n; i++) {
                out.println(treeAlgo.children[i]);
            }

        }

        static class TreeAlgo {
            private int n;
            private ArrayList<Integer>[] edges;
            int[] depth;
            int[] children;
            private boolean[] used;

            public TreeAlgo(int n) {
                this.n = n;
                this.edges = Utils.makeArray(n, ArrayList::new);
                this.depth = new int[n];
                this.children = new int[n];
                reset();
            }

            void reset() {
                this.used = new boolean[n];
            }

            void addEdge(int a, int b) {
                edges[a].add(b);
                edges[b].add(a);
            }

            int dfsCountChild(int node, int curDepth) {
                depth[node] = curDepth;
                used[node] = true;

                int res = 0;
                for (int target : edges[node]) {
                    if (!used[target]) {
                        dfsCountChild(target, curDepth + 1);
                        res++;
                    }
                }
                children[node] = res;
                return res;
            }

        }

    }

    static final class Utils {
        private Utils() {
        }

        public static <T> T[] makeArrayInd(int n, IntFunction<T> creator) {
            if (n > 0) {
                T first = creator.apply(0);
                T[] res = (T[]) Array.newInstance(first.getClass(), n);
                res[0] = first;

                for (int i = 1; i < n; i++) {
                    res[i] = creator.apply(i);
                }

                return res;
            } else {
                return (T[]) new Object[0];
            }
        }

        public static <T> T[] makeArray(int n, Supplier<T> creator) {
            return makeArrayInd(n, value -> creator.get());
        }

    }

    static class FastScanner {
        private StringTokenizer st;
        private BufferedReader in;

        public FastScanner(final InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
        }

        public String readToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(readToken());
        }

    }
}

