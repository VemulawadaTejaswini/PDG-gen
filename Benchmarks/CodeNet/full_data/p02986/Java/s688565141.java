import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FColorfulTree solver = new FColorfulTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FColorfulTree {
        List<Integer>[] adj;
        int[][] color;
        int[][] dist;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();

            color = new int[n][n];
            dist = new int[n][n];
            adj = new List[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                int c = in.nextInt() - 1;
                int d = in.nextInt();
                adj[a].add(b);
                adj[b].add(a);
                color[a][b] = color[b][a] = c;
                dist[a][b] = dist[b][a] = d;
            }

            LowestCommonAncestor lca = new LowestCommonAncestor(adj, 0);
            //        System.out.println(Arrays.toString(lca.tour));

            LowestCommonAncestor.Visit[] tour = lca.tour;
            int T = lca.tour.length;

            IntSegmentTree distance = new IntSegmentTree(T - 1, Integer::sum, 0);
            IntSegmentTree[] countColor = new IntSegmentTree[n];
            for (int i = 0; i < n; i++) {
                countColor[i] = new IntSegmentTree(T - 1, Integer::sum, 0);
            }
            IntSegmentTree[] distColor = new IntSegmentTree[n];
            for (int i = 0; i < n; i++) {
                distColor[i] = new IntSegmentTree(T - 1, Integer::sum, 0);
            }

            // distance[i] = between i and i+1

            for (int i = 0; i + 1 < T; i++) {
                LowestCommonAncestor.Visit a = tour[i];
                LowestCommonAncestor.Visit b = tour[i + 1];
                int mult = 1;
                if (a.depth > b.depth) {
                    mult = -1;
                }
                distance.update(i, dist[a.node][b.node] * mult);
                countColor[color[a.node][b.node]].update(i, 1 * mult);
                distColor[color[a.node][b.node]].update(i, dist[a.node][b.node] * mult);
            }

            //        System.out.println(Arrays.toString(distance.value));
            //        System.out.println(Arrays.toString(distance.value));
            //        for (int i = 0; i < T; i++) {
            //            System.out.println(tour[i] + "\t" + (i + 1 < T ? distance.get(i) : ""));
            //        }

            for (int query = 0; query < q; query++) {
                int color = in.nextInt() - 1;
                int newDist = in.nextInt();
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;

                int i = lca.pos[u];
                int j = lca.pos[v];
                if (j < i) {
                    int t = i;
                    i = j;
                    j = t;
                }

                //            System.out.println(i + " " + j);
                //            System.out.println(tour[i] + " " + tour[j]);

                int answer = Math.abs(distance.query(0, i)) + Math.abs(distance.query(0, j));
                int coloredEdges = Math.abs(countColor[color].query(0, i)) + Math.abs(countColor[color].query(0, j));
                int coloredDist = Math.abs(distColor[color].query(0, i)) + Math.abs(distColor[color].query(0, j));
                answer -= coloredDist;
                answer += coloredEdges * newDist;

                out.println(answer);
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class IntSegmentTree {
        public int size;
        public int[] value;
        protected final IntSegmentTree.Combiner combiner;
        protected final int identityElement;

        public IntSegmentTree(int size, IntSegmentTree.Combiner combiner, int identityElement) {
            this.size = size;
            value = new int[2 * size];
            Arrays.fill(value, identityElement);
            this.combiner = combiner;
            this.identityElement = identityElement;
        }

        protected int combine(int a, int b) {
            return combiner.combine(a, b);
        }

        public void update(int i, int v) {
            i += size;
            value[i] = v;
            while (i > 1) {
                i /= 2;
                value[i] = combine(value[2 * i], value[2 * i + 1]);
            }
        }

        public int query(int i, int j) {
            int res_left = identityElement, res_right = identityElement;
            for (i += size, j += size; i < j; i /= 2, j /= 2) {
                if ((i & 1) == 1)
                    res_left = combine(res_left, value[i++]);
                if ((j & 1) == 1)
                    res_right = combine(value[--j], res_right);
            }
            return combine(res_left, res_right);
        }

        public interface Combiner {
            int combine(int a, int b);

        }

    }

    static class LowestCommonAncestor {
        public int[] depth;
        public int[] pos;
        public LowestCommonAncestor.Visit[] tour;

        public LowestCommonAncestor(List<Integer>[] adj, int root) {
            int n = adj.length;
            depth = new int[n];
            pos = new int[n];
            Arrays.fill(pos, -1);

            ArrayList<LowestCommonAncestor.Visit> tour = new ArrayList<>();

            dfs(root, tour, -1, adj);

            this.tour = new LowestCommonAncestor.Visit[tour.size()];
            for (int i = 0; i < this.tour.length; i++) {
                this.tour[i] = tour.get(i);
            }
        }

        void dfs(int root, ArrayList<LowestCommonAncestor.Visit> tour, int parent, List<Integer>[] adj) {
            pos[root] = tour.size();
            tour.add(new LowestCommonAncestor.Visit(root, depth[root]));
            for (int next : adj[root]) {
                if (next == parent)
                    continue;
                depth[next] = depth[root] + 1;
                dfs(next, tour, root, adj);
                tour.add(new LowestCommonAncestor.Visit(root, depth[root]));
            }
        }

        public static class Visit {
            public final int node;
            public final int depth;

            public Visit(int node, int depth) {
                this.node = node;
                this.depth = depth;
            }

            public String toString() {
                return "Visit{" + "node=" + node + ", depth=" + depth + '}';
            }

        }

    }
}

