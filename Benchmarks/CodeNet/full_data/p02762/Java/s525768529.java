import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        UnionFindTree uf = new UnionFindTree(n);
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            if (map.containsKey(a)) {
                map.get(a).add(b);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(b);
                map.put(a, set);
            }
            if (map.containsKey(b)) {
                map.get(b).add(a);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(a);
                map.put(b, set);
            }
            uf.unite(a, b);
        }
        for (int i = 0; i < k; i++) {
            int c = Integer.parseInt(sc.next()) - 1;
            int d = Integer.parseInt(sc.next()) - 1;
            if (!uf.same(c, d)) {
                continue;
            }
            if (map.containsKey(c)) {
                map.get(c).add(d);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(d);
                map.put(c, set);
            }
            if (map.containsKey(d)) {
                map.get(d).add(c);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(c);
                map.put(d, set);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = uf.size(i) - 1;
            if (map.containsKey(i)) {
                num -= map.get(i).size();
            }
            sb.append(num);
            sb.append(" ");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb.toString());
    }

    private static class UnionFindTree {

        int[] parent;
        int[] rank;
        int[] size;


        public UnionFindTree(int n) {
            this.parent = new int[n];
            this.rank = new int[n];
            this.size = new int[n];

            for (int i = 0; i < n; i++) {
                makeSet(i);
            }
        }

        public void makeSet(int i) {
            parent[i] = i;
            rank[i] = 0;
            size[i] = 1;
        }

        public void unite(int x, int y) {
            int xRoot = find(x);
            int yRoot = find(y);
            if (xRoot == yRoot) {
                return;
            }
            if (rank[xRoot] > rank[yRoot]) {
                parent[yRoot] = xRoot;
                size[xRoot] += size[yRoot];

            } else if (rank[xRoot] < rank[yRoot]) {
                parent[xRoot] = yRoot;
                size[yRoot] += size[xRoot];
            } else {
                parent[yRoot] = xRoot;
                rank[xRoot]++;
                size[xRoot] += size[yRoot];
            }
        }

        public int find(int i) {
            if (i != parent[i]) {
                parent[i] = find(parent[i]);
            }
            return parent[i];
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

        public int size(int i) {
            return size[find(i)];
        }
    }
}