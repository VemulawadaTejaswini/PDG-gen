import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFriendSuggestions solver = new DFriendSuggestions();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFriendSuggestions {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[m];
            int[] b = new int[m];
            int[] friendsKouho = new int[n];
            UnionFindTree uft = new UnionFindTree(n);
            for (int i = 0; i < m; i++) {
                a[i] = in.nextInt() - 1;
                b[i] = in.nextInt() - 1;
                uft.union(a[i], b[i]);
            }

            for (int i = 0; i < n; i++) {
                friendsKouho[i] = uft.getSize(i) - 1;
            }

            // 直接結ばれているものを取り除く
            for (int i = 0; i < m; i++) {
                friendsKouho[a[i]]--;
                friendsKouho[b[i]]--;
            }

            for (int i = 0; i < k; i++) {
                int c = in.nextInt() - 1;
                int d = in.nextInt() - 1;
                if (uft.same(c, d)) {
                    friendsKouho[c]--;
                    friendsKouho[d]--;
                }
            }

            for (int i : friendsKouho) {
                out.print(i + " ");
            }
            out.println();

        }

    }

    static class UnionFindTree {
        private int[] parent;
        private int[] height;
        private int[] size;

        public UnionFindTree(int size) {
            this.parent = new int[size];
            this.height = new int[size];
            this.size = new int[size];

            for (int i = 0; i < size; i++) {
                makeSet(i);
            }
        }

        private void makeSet(int i) {
            parent[i] = i;
            height[i] = 0;
            size[i] = 1;
        }

        public int find(int x) {
            if (x != parent[x]) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {

            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) { //既に結合済み
                return;
            }

            if (height[rootX] > height[rootY]) {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];

            } else if (height[rootX] < height[rootY]) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];

            } else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
                height[rootX]++;
            }
        }

        public int getSize(int x) {
            int rootX = find(x);
            return size[rootX];
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

    }
}

