import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        List<Integer>[] list = new List[M];
        for (int i = 0; i < M; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            int K = scan.nextInt();
            for (int j = 0; j < K; j++) {
                int L = scan.nextInt()-1;
                list[L].add(i);
            }
        }
        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            if (list[i].size() <= 1) {
                continue;
            }
            for (int j = 1; j < list[i].size(); j++) {
                uf.unite(list[i].get(0), list[i].get(j));
            }
        }
        if (uf.size(0) == N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    class UnionFind {
        private int[] parent;
        private int[] size;
        UnionFind(int N) {
            int[] parent = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
            }
            int[] size = new int[N];
            Arrays.fill(size, 1);
            this.parent = parent;
            this.size = size;
        }
        int find(int x) {
            if (x == this.parent[x]) {
                return x;
            }
            return this.parent[x] = find(this.parent[x]);
        }
        boolean same(int x, int y) {
            return find(x) == find(y);
        }
        void unite(int x, int y) {
            int parent_x = find(x);
            int parent_y = find(y);
            if (parent_x == parent_y) {
                return;
            }
            int size_x = this.size[parent_x];
            int size_y = this.size[parent_y];
            if (size_x < size_y) {
                this.size[parent_y] += this.size[parent_x];
                this.parent[parent_x] = parent_y;
                this.size[parent_x] = -1;
                return;
            }
            this.size[parent_x] += this.size[parent_y];
            this.parent[parent_y] = parent_x;
            this.size[parent_y] = -1;
        }
        int size(int x) {
            int parent_x = find(x);
            return this.size[parent_x];
        }
    }
}
