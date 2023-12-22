import java.util.Scanner;


public class Main {
    public static class UnionFindTree {
        private int[] parent;
        public UnionFindTree(int n) {
            parent = new int[n];
            for(int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int root(int a) {
            if (parent[a] == a) {
                return a;
            } else {
                int b = root(parent[a]); //圧縮経路
                parent[a] = b;
                return b;
            }
        }

        public void union(int a, int b) {
            int aa = root(a);
            int bb = root(b);
            if ( aa == bb) return;
            parent[aa] = bb;
        }

        public boolean same(int a, int b) {
            return root(a) == root(b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] p = new int[N];
        for(int i = 0; i < N; i++) {
            p[i] = scanner.nextInt() - 1;
        }

        UnionFindTree ut = new UnionFindTree(N);
        for(int j = 0; j < M; j++) {
            ut.union(scanner.nextInt() - 1, scanner.nextInt() - 1);
        }

        int ret = 0;
        for(int i = 0; i < N; i++) {
            if(ut.same(i, p[i])) ret++;
        }
        System.out.println(ret);
    }
}
