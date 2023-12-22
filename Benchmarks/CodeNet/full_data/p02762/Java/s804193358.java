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
        int K = scan.nextInt();
        HashMap<Integer, List<Integer>> real = new HashMap<>();
        UnionFind good = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            if (!real.containsKey(a)) {
                real.put(a, new ArrayList<>());
            }
            if (!real.containsKey(b)) {
                real.put(b, new ArrayList<>());
            }
            real.get(a).add(b);
            real.get(b).add(a);
            good.unit(a, b);
        }
        HashMap<Integer, List<Integer>> bad = new HashMap<>();
        for (int i = 0; i < K; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            if (!good.same(a, b)) {
                continue;
            }
            if (!bad.containsKey(a)) {
                bad.put(a, new ArrayList<>());
            }
            if (!bad.containsKey(b)) {
                bad.put(b, new ArrayList<>());
            }
            bad.get(a).add(b);
            bad.get(b).add(a);
        }
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int candidates = good.size(i) - 1 - real.getOrDefault(i, new ArrayList<>()).size() - bad.getOrDefault(i, new ArrayList<>()).size();
            ans[i] = candidates;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]);
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
    class UnionFind {
        private int[] parent;
        private int[] size;
        UnionFind(int N) {
            int[] parent = new int[N];
            int[] size = new int[N];
            Arrays.fill(size, 1);
            for (int i = 0; i < N; i++) {
                parent[i] = i;
            }
            this.parent = parent;
            this.size = size;
        }
        int find(int x) {
            if (this.parent[x] == x) {
                return x;
            }
            return this.parent[x] = find(this.parent[x]);
        }
        boolean same(int x, int y) {
            return find(x) == find(y);
        }
        void unit(int x, int y) {
            int parent_x = find(x);
            int parent_y = find(y);
            if (parent_x == parent_y) {
                return;
            }
            if (this.size[parent_x] < this.size[parent_y]) {
                this.parent[parent_x] = parent_y;
                this.size[parent_y] += this.size[parent_x];
                this.size[parent_x] = 0;
                return;
            }
            this.parent[parent_y] = parent_x;
            this.size[parent_x] += this.size[parent_y];
            this.size[parent_y] = 0;
        }
        int size(int x) {
            int parent_x = find(x);
            return this.size[parent_x];
        }
    }
}
