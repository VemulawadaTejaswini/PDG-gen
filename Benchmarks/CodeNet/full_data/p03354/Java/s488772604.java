import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main d = new Main();
        d.solve();
    }


    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        int m = scan.nextInt();
        UnionTree edges = new UnionTree(n);
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt() - 1;
        }
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            edges.unite(x, y);
        }
        System.out.println(solve(n, data, edges));
    }

    public static int solve(int n, int[] data, UnionTree edges) {
        int[] check = new int[n];
        for(int i = 0; i < n; i++) {
            check[data[i]] = i;
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if (i == data[i]) {
                count++;
                continue;
            }
            if (edges.same(i, check[i])) {
                count++;
            }
        }
        return count;
    }

    class UnionTree {
        private int[] parents;
        public UnionTree(int n) {
            this.parents = new int[n];
            Arrays.fill(parents, -1);
        }
        public boolean same(int x, int y) {
            return this.root(x) == this.root(y);
        }

        public void unite(int x, int y) {
            int parent_x = root(x);
            int parent_y = root(y);
            if (parent_x == parent_y) {
                return;
            }
            if (this.parents[parent_x] < this.parents[parent_y]) {
                this.parents[parent_x] += this.parents[parent_y];
                this.parents[parent_y] = parent_x;
            } else {
                this.parents[parent_y] += this.parents[parent_x];
                this.parents[parent_x] = parent_y;
            }
        }

        public int root(int x) {
            if (this.parents[x] < 0) {
                return x;
            }
            return this.root(this.parents[x]);
        }
    }
}
