import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.BitSet;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStreamReader;
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

            for (int i = 0; i < m; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                adj[u].add(v);
            }

            HashSet<Integer>[] newAdj = new HashSet[n];
            for (int i = 0; i < n; i++) {
                newAdj[i] = new HashSet<>();
            }
            for (int i = 0; i < n; i++) {
                newAdj[i].add(i);
            }

            expand(adj, newAdj);
            expand(adj, newAdj);
            expand(adj, newAdj);

            int s = in.nextInt() - 1, t = in.nextInt() - 1;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.addLast(s);
            BitSet visited = new BitSet();
            visited.set(s);
            int[] dist = new int[n];
            dist[s] = 0;
            while (!q.isEmpty()) {
                int cur = q.pollFirst();
                for (int next : newAdj[cur]) {
                    if (visited.get(next))
                        continue;

                    visited.set(next);
                    dist[next] = dist[cur] + 1;
                    q.addLast(next);
                }
            }

            int answer = visited.get(t) ? dist[t] : -1;
            out.println(answer);
        }

        private void expand(HashSet<Integer>[] adj, HashSet<Integer>[] newAdj) {
            HashSet<Integer>[] oldAdj = new HashSet[n];
            for (int i = 0; i < n; i++) {
                oldAdj[i] = new HashSet<>(newAdj[i]);
                newAdj[i].clear();
            }

            for (int i = 0; i < n; i++) {
                HashSet<Integer> reachable = new HashSet<>();
                for (int next : oldAdj[i]) {
                    for (int nextnext : adj[next]) {
                        newAdj[i].add(nextnext);
                    }
                }
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

