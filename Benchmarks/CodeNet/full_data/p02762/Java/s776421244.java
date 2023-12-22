import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static class UnionFind {
        int[] d;
        UnionFind(int n) {
            d = new int[n];
            Arrays.fill(d, -1);
        }

        int find(int x) {
            if(d[x] < 0) return x;
            return d[x] = find(d[x]);
        }

        boolean unite(int x, int y) {
            x = find(x); y = find(y);
            if(x == y) return false;
            if(d[x] > d[y]) {
                int tmp = x; x = y; y = x;
            }
            d[x] += d[y];
            d[y] = x;
            return true;
        }

        boolean same(int x, int y) { return find(x) == (y); }
        int size(int x) { return -d[find(x)]; }
    }

    static int[] deg = new int[100005];
    static ArrayList<ArrayList<Integer>> to = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();
        UnionFind uf = new UnionFind(n);
        for(int i = 0; i < m; i++) {
            int a, b;
            a = Integer.parseInt(sc.next()); b = Integer.parseInt(sc.next());
            --a; --b;
            deg[a]++; deg[b]++;
            uf.unite(a, b);
        }
        for(int i = 0; i < k; i++) {
            int a, b;
            a = Integer.parseInt(sc.next()); b = Integer.parseInt(sc.next());
            --a; --b;
            to.add(a, new ArrayList<>()); to.get(a).add(b);
            to.add(b, new ArrayList<>()); to.get(b).add(a);
        }
        for(int i = 0; i < n ; i++) {
            int ans = uf.size(i) - 1 - deg[i];
            for(int u : to.get(i)) {
                if(uf.same(i, u)) --ans;
            }
            System.out.printf("%d%c", ans, i==n-1?'\n':' ');
        }
    }
}