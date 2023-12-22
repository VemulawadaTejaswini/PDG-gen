import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.BitSet;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        EHopscotchAddict solver = new EHopscotchAddict();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHopscotchAddict {
        int n;
        int m;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();

            HashSet<Integer>[] adj = new HashSet[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new HashSet<>();
            }
            EHopscotchAddict.Edge[] e = new EHopscotchAddict.Edge[m];

            for (int i = 0; i < m; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                e[i] = new EHopscotchAddict.Edge(u, v);
                adj[u].add(i);
            }

            HashSet<Integer>[] newAdj = new HashSet[n];
            for (int i = 0; i < n; i++) {
                newAdj[i] = new HashSet<>();
            }
            List<EHopscotchAddict.Edge> newE = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                newE.add(new EHopscotchAddict.Edge(i, i));
                newAdj[i].add(i);
            }

            expand(adj, e, newAdj, newE);
            expand(adj, e, newAdj, newE);
            expand(adj, e, newAdj, newE);

            int s = in.nextInt() - 1, t = in.nextInt() - 1;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.addLast(s);
            BitSet visited = new BitSet();
            visited.set(s);
            int[] dist = new int[n];
            dist[s] = 0;
            while (!q.isEmpty()) {
                int cur = q.pollFirst();
                for (int e1 : newAdj[cur]) {
                    EHopscotchAddict.Edge curEdge = newE.get(e1);
                    int nextNode = curEdge.u + curEdge.v - cur;
                    if (visited.get(nextNode))
                        continue;

                    visited.set(nextNode);
                    dist[nextNode] = dist[cur] + 1;
                    q.addLast(nextNode);
                }
            }

            int answer = visited.get(t) ? dist[t] : -1;
            out.println(answer);
        }

        private void expand(HashSet<Integer>[] adj, EHopscotchAddict.Edge[] e, HashSet<Integer>[] newAdj, List<EHopscotchAddict.Edge> newE) {
            HashSet<Integer>[] oldAdj = new HashSet[n];
            for (int i = 0; i < n; i++) {
                oldAdj[i] = new HashSet<>(newAdj[i]);
                newAdj[i].clear();
            }
            List<EHopscotchAddict.Edge> oldE = new ArrayList<>(newE);
            newE.clear();

            for (int i = 0; i < n; i++) {
                HashSet<Integer> reachable = new HashSet<>();
                for (int e1 : oldAdj[i]) {
                    EHopscotchAddict.Edge curEdge = oldE.get(e1);
                    int nextNode = curEdge.u + curEdge.v - i;
                    for (int e2 : adj[nextNode]) {
                        EHopscotchAddict.Edge secondEdge = e[e2];
                        int nextNext = secondEdge.u + secondEdge.v - nextNode;
                        reachable.add(nextNext);
                    }
                }

                for (int x : reachable) {
                    newE.add(new EHopscotchAddict.Edge(i, x));
                    newAdj[i].add(newE.size() - 1);
                }
            }
        }

        static class Edge {
            final int u;
            final int v;

            Edge(int u, int v) {
                this.u = u;
                this.v = v;
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
}

