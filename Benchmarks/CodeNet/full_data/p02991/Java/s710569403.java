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

            HashSet<Integer>[] adj = new HashSet[3 * n];
            for (int i = 0; i < 3 * n; i++) {
                adj[i] = new HashSet<>();
            }

            for (int i = 0; i < m; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                adj[u].add(v + n);
                adj[u + n].add(v + 2 * n);
                adj[u + 2 * n].add(v);
            }

            int s = in.nextInt() - 1, t = in.nextInt() - 1;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.addLast(s);
            BitSet visited = new BitSet();
            visited.set(s);
            int[] dist = new int[3 * n];
            dist[s] = 0;
            while (!q.isEmpty()) {
                int cur = q.pollFirst();
                for (int next : adj[cur]) {
                    if (visited.get(next))
                        continue;

                    visited.set(next);
                    dist[next] = dist[cur] + 1;
                    q.addLast(next);
                }
            }

            int answer = visited.get(t) ? dist[t] : -3;
            out.println(answer / 3);
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

