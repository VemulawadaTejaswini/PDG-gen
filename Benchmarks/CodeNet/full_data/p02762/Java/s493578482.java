import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFriendSuggestions solver = new DFriendSuggestions();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFriendSuggestions {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();
            DFriendSuggestions.pair[] arr = new DFriendSuggestions.pair[m];

            DFriendSuggestions.UnionFindDisjointSet ufs = new DFriendSuggestions.UnionFindDisjointSet(n);
            int[] degree = new int[n];
            Arrays.fill(degree, 1);
            for (int i = 0; i < m; i++) {
                arr[i] = new DFriendSuggestions.pair(s.nextInt() - 1, s.nextInt() - 1);
                ufs.union(arr[i].first, arr[i].second);
                degree[arr[i].first]++;
                degree[arr[i].second]++;
            }

            int[] ans = new int[n];
            DFriendSuggestions.pair[] arr1 = new DFriendSuggestions.pair[k];
            HashMap<Integer, ArrayList<Integer>> enemies = new HashMap<>();
            for (int i = 0; i < k; i++) {
                arr1[i] = new DFriendSuggestions.pair(s.nextInt() - 1, s.nextInt() - 1);
                ArrayList<Integer> currEnemies = enemies.getOrDefault(arr1[i].first, new ArrayList<>());
                currEnemies.add(arr1[i].second);
                enemies.put(arr1[i].first, currEnemies);
                currEnemies = enemies.getOrDefault(arr1[i].second, new ArrayList<>());
                currEnemies.add(arr1[i].first);
                enemies.put(arr1[i].second, currEnemies);
            }

            for (int i = 0; i < n; i++) {
                int root = ufs.root(i);
                ans[i] = ufs.size[root] - degree[i];
            }

            for (int i = 0; i < k; i++) {
                DFriendSuggestions.pair p = arr1[i];
                if (ufs.root(p.first) == ufs.root(p.second)) {
                    ans[p.first]--;
                    ans[p.second]--;
                }
            }

            out.println(DFriendSuggestions.arrays.printArr(ans));
        }

        private static class pair {
            int first;
            int second;

            public pair(int first, int second) {
                this.first = first;
                this.second = second;
            }

        }

        private static class arrays {
            static StringBuilder printArr(int[] arr) {
                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < arr.length; i++) {
                    ans.append(arr[i] + " ");
                }
                return ans;
            }

        }

        private static class UnionFindDisjointSet {
            int[] parent;
            int[] size;
            int n;
            int size1;
            HashSet<Integer> roots = new HashSet<>();

            public UnionFindDisjointSet(int n) {
                this.n = n;
                this.parent = new int[n];
                this.size = new int[n];
                for (int i = 0; i < n; i++) {
                    parent[i] = i;
                    roots.add(i);
                }

                for (int i = 0; i < n; i++) {
                    size[i] = 1;
                }

                this.size1 = n;

            }

            private int root(int b) {
                if (parent[b] != b) {
                    return parent[b] = root(parent[b]);
                }
                return b;
            }

            private void union(int a, int b) {
                int rootA = root(a);
                int rootB = root(b);
                if (rootA == rootB) {
                    return;
                }

                if (size[rootA] < size[rootB]) {
                    roots.remove(parent[rootA]);
                    parent[rootA] = parent[rootB];
                    size[rootB] += size[rootA];
                } else {
                    roots.remove(parent[rootB]);
                    parent[rootB] = parent[rootA];
                    size[rootA] += size[rootB];
                }
                size1--;
//            System.out.println(Arrays.toString(parent));
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

