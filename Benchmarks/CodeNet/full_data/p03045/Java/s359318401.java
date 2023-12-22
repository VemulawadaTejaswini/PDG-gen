import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;
            int z = scan.nextInt()-1;
            uf.merge(x, y);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(uf.parent(i));
        }
        System.out.println(set.size());
    }
    class UnionFind {
        private int[] parent;
        private int[] size;
        UnionFind(int N) {
            this.parent = new int[N];
            this.size = new int[N];
            Arrays.fill(this.parent, -1);
            Arrays.fill(this.size, 1);
        }
        int parent(int x) {
            if (this.parent[x] == -1)  {
                return x;
            }
            return this.parent[x] = this.parent(this.parent[x]);
        }
        int size(int x) {
            int parent = this.parent(x);
            return this.size[parent];
        }
        void merge(int x, int y) {
            int parent_x = this.parent(x);
            int parent_y = this.parent(y);
            if (parent_x == parent_y) {
                return;
            }
            int size_x = this.size(x);
            int size_y = this.size(y);
            if (size_y < size_x) {
                this.parent[parent_y] = parent_x;
                this.size[parent_y] = -1;
                this.size[parent_x] = size_x + size_y;
                return;
            }
            this.parent[parent_x] = parent_y;
            this.size[parent_x] = -1;
            this.size[parent_y] = size_x + size_y;
        }
    }
}
