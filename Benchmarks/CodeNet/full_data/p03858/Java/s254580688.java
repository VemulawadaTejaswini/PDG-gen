import java.util.Scanner;

/**
 * Created by zzt on 17-1-16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[][] pinholes = new int[N][2];
        for (int i = 0; i < N; i++) {
            pinholes[i][0] = scanner.nextInt();
            pinholes[i][1] = scanner.nextInt();
        }
        int baseD = distance(pinholes[a - 1], pinholes[b - 1]);

        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (distance(pinholes[i], pinholes[j]) == baseD)
                    uf.union(i, j);
            }
        }
        int pairs = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (distance(pinholes[i], pinholes[j]) == baseD
                        && uf.connected(i,a))
                    pairs++;
            }
        }
        System.out.println(pairs);
    }

    static int distance(int[] p, int[] q) {
        return Math.abs(p[0] - q[0]) + Math.abs(p[1] - q[1]);
    }

    static class UnionFind {
        private int[] id;
        private int count;
        private int[] sz;

        public UnionFind(int n) {
            count = n;
            id = new int[n];
            sz = new int[n];
            for (int i = 0; i < n; i++) {
                id[i] = i;
                sz[i] = 1;
            }
        }

        public int count() {
            return count;
        }

        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }

        public int find(int p) {
            while (p != id[p]) {
                id[p] = id[id[p]];
                p = id[p];
            }
            return p;
        }

        public void union(int p, int q) {
            int i = find(p);
            int j = find(q);

            if (i == j)
                return;
            if (sz[i] < sz[j]) {
                id[i] = j;
                sz[j] += sz[i];
            } else {
                id[j] = id[i];
                sz[i] += sz[j];
            }
            count--;
        }

        public int size(int p) {
            return sz[find(p)];
        }
    }
}