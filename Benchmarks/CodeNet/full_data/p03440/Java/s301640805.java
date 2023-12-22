import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        UnionFind unionFind = new UnionFind(n);
        int[] a = in.nextIntArray(n);
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            unionFind.unite(x, y);
        }
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int parent = unionFind.root(i);
            if (i == parent) {
                map.put(i, new PriorityQueue<>());
            }
            map.get(parent).add(a[i]);
        }
        long ans = 0;
        TreeSet<PriorityQueue<Integer>> query = new TreeSet<>(Comparator.comparingInt(PriorityQueue::peek));
        query.addAll(map.values());
        for (int i = 0; i < map.size() - 1; i++) {
            if (query.size() < 2) {
                out.println("Impossible");
                return;
            }
            PriorityQueue<Integer> first = query.pollFirst();
            PriorityQueue<Integer> second = query.pollFirst();
            ans += first.poll();
            ans += second.poll();
            if (!first.isEmpty() || !second.isEmpty()) {
                if (first.size() < second.size()) {
                    second.addAll(first);
                    query.add(second);
                } else {
                    first.addAll(second);
                    query.add(first);
                }
            }
        }
        out.println(ans);
    }

    static class UnionFind {
        int[] parent;
        int n;

        UnionFind(int n) {
            this.n = n;
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int root(int x) {
            return parent[x] == x ? x : (parent[x] = root(parent[x]));
        }

        void unite(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                n--;
                if (x < y) {
                    parent[y] = x;
                } else {
                    parent[x] = y;
                }
            }
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private static PrintWriter out = new PrintWriter(System.out);

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
    }

    void flush() {
        out.flush();
    }
}
