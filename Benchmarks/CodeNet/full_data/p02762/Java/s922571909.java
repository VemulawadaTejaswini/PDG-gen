import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;

public class Main {

    static class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        private int root(int x) {
            if (parent[x] == x) {
                return x;
            }
            return parent[x] = root(parent[x]);
        }

        private void union(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry) {
                return;
            }
            parent[rx] = ry;
        }

        private boolean isSame(int x, int y) {
            return root(x) == root(y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        UnionFind uf = new UnionFind(n + 1);
        Map<Integer, Set<Integer>> friends = new HashMap<>();
        Map<Integer, Set<Integer>> blocks = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            friends.put(i, new HashSet<>());
            blocks.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            friends.get(a).add(b);
            friends.get(b).add(a);
            uf.union(a, b);
        }
        for (int i = 0; i < k; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (!uf.isSame(c, d)) {
                continue;
            }
            blocks.get(c).add(d);
            blocks.get(d).add(c);
        }

        List<Integer> ans = new ArrayList<>();
        int[] groupSize = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            groupSize[uf.root(i)]++;
        }
        for (int i = 1; i <= n; i++) {
            ans.add(groupSize[uf.root(i)] - (friends.get(i).size() + blocks.get(i).size()) - 1);
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            sj.add(String.valueOf(ans.get(i)));
        }
        System.out.println(sj);
    }

}
