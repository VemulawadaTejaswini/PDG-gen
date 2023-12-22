import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int scanInt() {
        return Integer.parseInt(scanner.next());
    }

    public static void main(String[]$) {
        int n = scanInt();
        int m = scanInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanInt() - 1;
        }

        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            unionFind.unite(scanInt() - 1, scanInt() - 1);
        }

        int ans = 0;
        for (int parent : unionFind.parents()) {
            Set<Integer> children = unionFind.children(parent);
            Set<Integer> set = new HashSet<>();
            for (int child : children) {
                set.add(p[child]);
            }

            for (int child : children) {
                if (set.contains(child)) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    static class UnionFind {
        private int[] parent;
        private Set<Integer> parents;
        private Set<Integer>[] children;

        UnionFind(int n) {
            parent = new int[n];
            parents = new HashSet<>();
            children = new Set[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                parents.add(i);
                children[i] = new HashSet<>();
                children[i].add(i);
            }
        }

        int root(int x) {
            while (parent[x] != x) {
                x = parent[x] = parent[parent[x]];
            }
            return x;
        }

        void unite(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                if (children[x].size() < children[y].size()) {
                    parent[y] = x;
                    parents.remove(y);
                    children[x].addAll(children[y]);
                } else {
                    parent[x] = y;
                    parents.remove(x);
                    children[y].addAll(children[x]);
                }
            }
        }

        Set<Integer> parents() {
            return parents;
        }

        Set<Integer> children(int x) {
            return children[root(x)];
        }
    }
}