import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int L = scan.nextInt();
        UnionFind road = new UnionFind(N);
        UnionFind train = new UnionFind(N);
        for (int i = 0; i < K; i++) {
            int p = scan.nextInt() - 1;
            int q = scan.nextInt() - 1;
            road.merge(p, q);
        }
        for (int i = 0; i < L; i++) {
            int p = scan.nextInt() - 1;
            int q = scan.nextInt() - 1;
            train.merge(p, q);
        }
        int[] answers = new int[N];
        HashMap<String, Set<Integer>> cache = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int r_p = road.parent(i);
            int t_p = train.parent(i);
            String key = r_p + "_" + t_p;
            if (cache.containsKey(key)) {
                answers[i] = cache.get(key).size();
                continue;
            }
            Set<Integer> r = road.neighbors(r_p);
            Set<Integer> t = train.neighbors(t_p);
            Set<Integer> set = new HashSet<>();
            Set<Integer> x = r.size() < t.size() ? r : t;
            Set<Integer> y = r.size() < t.size() ? t : r;
            for (int z : x) {
                if (y.contains(z)) {
                    set.add(z);
                }
            }
            cache.put(key, set);
            answers[i] = set.size();
        }
        System.out.println(Arrays.stream(answers).mapToObj(i -> Integer.toString(i)).collect(Collectors.joining(" ")));
    }
    class UnionFind {
        private int[] par;
        private Set<Integer>[] neighbors;
        UnionFind(int N) {
            this.par = new int[N];
            for (int i = 0; i < N; i++) {
                par[i] = i;
            }
            this.neighbors = new HashSet[N];
            for (int i = 0; i < N; i++) {
                this.neighbors[i] = new HashSet<>();
                this.neighbors[i].add(i);
            }
        }
        int parent(int N) {
            if (this.par[N] == N) {
                return N;
            }
            return this.par[N] = parent(this.par[N]);
        }
        boolean same(int x, int y) {
            int parent_x = parent(x);
            int parent_y = parent(y);
            return parent_x == parent_y;
        }
        void merge(int x, int y) {
            int parent_x = parent(x);
            int parent_y = parent(y);
            if (parent_x == parent_y) {
                return;
            }
            int size_x = this.neighbors[parent_x].size();
            int size_y = this.neighbors[parent_y].size();
            if (size_x < size_y) {
                this.par[parent_x] = parent_y;
                this.neighbors[parent_y].addAll(this.neighbors[parent_x]);
                this.neighbors[parent_x] = new HashSet<>();
                return;
            }
            this.par[parent_y] = parent_x;
            this.neighbors[parent_x].addAll(this.neighbors[parent_y]);
            this.neighbors[parent_y] = new HashSet<>();
        }
        Set<Integer> neighbors(int N) {
            return this.neighbors[parent(N)];
        }
    }
}
