import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
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
        DConnectivity solver = new DConnectivity();
        solver.solve(1, in, out);
        out.close();
    }

    static class DConnectivity {
        UnionFind roads;
        UnionFind rails;
        int n;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            roads = new UnionFind(n);
            rails = new UnionFind(n);

            int k = in.nextInt(), l = in.nextInt();
            for (int i = 0; i < k; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                roads.union(a, b);
            }
            for (int i = 0; i < l; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                rails.union(a, b);
            }

            HashMap<Long, Integer> count = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long h = hash(i);
                count.put(h, count.getOrDefault(h, 0) + 1);
            }

            for (int i = 0; i < n; i++) {
                int answer = count.get(hash(i));
                out.println(answer);
            }
        }

        long hash(long a, long b, long n) {
            return a * (n + 5) + b;
        }

        long hash(int i) {
            return hash(roads.rep(i), rails.rep(i), n);
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

    static class UnionFind {
        private int[] __rep;
        private int[] __size;

        public UnionFind(int n) {
            __rep = new int[n];
            __size = new int[n];
            for (int i = 0; i < n; i++) {
                __rep[i] = i;
                __size[i] = 1;
            }
        }

        public int rep(int x) {
            if (__rep[x] == x) {
                return x;
            }

            int r = rep(__rep[x]);
            __rep[x] = r;
            return r;
        }

        public int size(int x) {
            return __size[rep(x)];
        }

        public void union(int x, int y) {
            x = rep(x);
            y = rep(y);

            if (x == y) {
                return;
            }

            if (size(x) < size(y)) {
                int t = x;
                x = y;
                y = t;
            }

            // now size(x) >= size(y)

            __rep[y] = x;
            __size[x] += __size[y];
        }

    }
}

