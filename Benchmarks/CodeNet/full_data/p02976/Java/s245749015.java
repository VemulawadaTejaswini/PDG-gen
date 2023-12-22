import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        B_EvenDegrees solver = new B_EvenDegrees();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_EvenDegrees {
        int n;
        final int MAX_EDGES = 1000000;
        int[] firstEdge;
        int[] lastEdge;
        int[] nextEdge = new int[MAX_EDGES];
        int[] edgeDst = new int[MAX_EDGES];
        int numEdges;
        boolean[] deadEdge = new boolean[MAX_EDGES];
        List<Integer> eulerTour = new ArrayList<>();

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            n = in.nextInt();
            int m = in.nextInt();
            firstEdge = new int[n];
            Arrays.fill(firstEdge, -1);
            lastEdge = new int[n];
            int[] deg = new int[n];
            Set<String> initial = new HashSet<>();
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                addEdge(a, b);
                ++deg[a];
                ++deg[b];
                if (a != b) {
                    addEdge(b, a);
                } else {
                    throw new AssertionError();
                }
                initial.add((a + 1) + " " + (b + 1));
                initial.add((b + 1) + " " + (a + 1));
            }
            List<Integer> odd = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (deg[i] % 2 == 1) {
                    odd.add(i);
                }
            }
            for (int i = 0; i < odd.size(); i += 2) {
                int a = odd.get(i);
                int b = odd.get(i + 1);
                addEdge(a, b);
                addEdge(b, a);
                ++deg[a];
                ++deg[b];
            }

            for (int i = 0; i < n; i++) {
                lastEdge[i] = firstEdge[i];
            }
            buildEulerTour(odd.isEmpty() ? 0 : odd.get(0));
//        out.println(eulerTour);

            List<String> ans = new ArrayList<>();
            for (int i = 1; i + 1 < eulerTour.size(); i += 2) {
                int o = eulerTour.get(i);
                int a = eulerTour.get(i - 1);
                int b = eulerTour.get(i + 1);
                if (!initial.contains((o + 1) + " " + (a + 1)) || !initial.contains((o + 1) + " " + (b + 1))) {
                    ans.add((a + 1) + " " + (o + 1));
                    ans.add((b + 1) + " " + (o + 1));
                } else {
                    ans.add((o + 1) + " " + (a + 1));
                    ans.add((o + 1) + " " + (b + 1));
                }
            }
//        out.println(ans);
            List<String> nAns = new ArrayList<>();
            for (String s : ans) {
                if (initial.contains(s)) {
                    nAns.add(s);
                }
            }
            ans = nAns;
            if (ans.size() != m) {
                out.println(-1);
                return;
            }
            for (String s : ans) {
                out.println(s);
            }
        }

        private void addEdge(int a, int b) {
            int e = numEdges++;
            nextEdge[e] = firstEdge[a];
            firstEdge[a] = e;
            edgeDst[e] = b;
        }

        private void buildEulerTour(int v) {
            while (true) {
                int e = lastEdge[v];
                if (e < 0) {
                    break;
                }
                lastEdge[v] = nextEdge[lastEdge[v]];
                if (deadEdge[e]) {
                    continue;
                }
                deadEdge[e] = true;
                deadEdge[e ^ 1] = true;
                buildEulerTour(edgeDst[e]);
            }
            eulerTour.add(v);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

