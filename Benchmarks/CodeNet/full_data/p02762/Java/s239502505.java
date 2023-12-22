import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFriendSuggestions solver = new DFriendSuggestions();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFriendSuggestions {
        static DFriendSuggestions.Subset[] subsets;

        static int find(int i) {
            if (subsets[i].parent != i)
                subsets[i].parent = find(subsets[i].parent);
            return subsets[i].parent;
        }

        static void union(int x, int y) {
            int xroot = find(x);
            int yroot = find(y);

            if (subsets[xroot].rank < subsets[yroot].rank) {
                subsets[xroot].parent = yroot;
                subsets[yroot].size += subsets[xroot].size;
            } else if (subsets[yroot].rank < subsets[xroot].rank) {
                subsets[yroot].parent = xroot;
                subsets[xroot].size += subsets[yroot].size;
            } else {
                subsets[xroot].parent = yroot;
                subsets[yroot].size += subsets[xroot].size;
                subsets[yroot].rank++;
            }
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            subsets = new DFriendSuggestions.Subset[n];
            int[] deg = new int[n];
            for (int i = 0; i < n; i++) {
                subsets[i] = new DFriendSuggestions.Subset();
                subsets[i].parent = i;
                subsets[i].size = 1;
                subsets[i].rank = 1;
            }
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;
                deg[u]++;
                deg[v]++;
                if (find(u) != find(v)) {
                    union(u, v);
                }
            }
            long[] ans = new long[n];
            for (int i = 0; i < n; i++) {
                ans[i] = subsets[find(i)].size - 1 - deg[i];
            }
            for (int i = 0; i < k; i++) {
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;
                if (find(u) == find(v)) {
                    ans[u]--;
                    ans[v]--;
                }
            }
            for (long i : ans) {
                out.print(i + " ");
            }
            out.println();
        }

        static class Subset {
            int parent;
            int rank;
            int size;

        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

