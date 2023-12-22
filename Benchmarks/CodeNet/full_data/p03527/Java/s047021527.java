import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.util.Map;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] a = in.nextString().chars().map(c -> c - 'a').toArray();
            int m = a.length;
            int[] sub = new int[m + 1];
            sub[0] = a[0];
            for (int i = 1; i < m; i++) {
                sub[i] = (26 + a[i] - a[i - 1]) % 26;
            }
            sub[m] = (26 - a[m - 1]) % 26;

            int n = in.nextInt();
            UnionFind uf = new UnionFind(m + 1);
            for (int i = 0; i <= m / 2; i++) {
                uf.union(i, m - i);
            }
            for (int i = 0; i < n; i++) {
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;
                uf.union(l, r + 1);
            }

            for (List<Integer> list : uf.getGroups()) {
                if (list.stream().mapToInt(x -> sub[x]).sum() % 26 != 0) {
                    out.println("NO");
                    return;
                }
            }
            out.println("YES");
        }

    }

    static class UnionFind {
        private int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            Arrays.fill(parent, -1);
        }

        public boolean union(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                if (parent[y] < parent[x]) {
                    int tmp = y;
                    y = x;
                    x = tmp;
                }
                parent[x] += parent[y];
                parent[y] = x;
                return true;
            }
            return false;
        }

        public int root(int x) {
            return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
        }

        public List<List<Integer>> getGroups() {
            int n = parent.length;
            List<List<Integer>> groups = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int r = root(i);
                if (!map.containsKey(r)) {
                    map.put(r, groups.size());
                    groups.add(new ArrayList<>());
                }
                groups.get(map.get(r)).add(i);
            }
            return groups;
        }


        public String toString() {
            return getGroups().toString();
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
}

