import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.util.BitSet;
import java.io.BufferedReader;
import java.util.Comparator;
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
        CRemovingCoins solver = new CRemovingCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRemovingCoins {
        int n;
        List<Integer>[] adj;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            adj = new List[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1;
                adj[a].add(b);
                adj[b].add(a);
            }

            BitSet visited = new BitSet();
            visited.set(0);
            int longestPath = longestPath(0, visited)[1];
            boolean answer = (longestPath % 3) != 1;

            out.println(answer ? "First" : "Second");
        }

        private int[] longestPath(int cur, BitSet visited) {
            int[] result = {0, 0};

            PriorityQueue<Integer> childDistances = new PriorityQueue<>(Comparator.reverseOrder());
            for (int next : adj[cur]) {
                if (visited.get(next)) {
                    continue;
                }
                visited.set(next);
                int[] child = longestPath(next, visited);
                result[0] = Math.max(result[0], 1 + child[0]);
                result[1] = Math.max(result[1], child[1]);
                childDistances.add(1 + child[0]);
            }

            int contender = 0;
            if (!childDistances.isEmpty()) {
                contender += childDistances.poll();
            }
            if (!childDistances.isEmpty()) {
                contender += childDistances.poll();
            }

            result[1] = Math.max(result[1], contender);

            return result;
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

