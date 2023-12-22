import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        long q;
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextLong();
        sc.nextLine();
        boolean[] board = new boolean[n*m];
        for (int i = 0; i < n; i++) {
            char[] tmp = sc.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                board[i*m+j] = tmp[j] == '1';
            }
        }
        //printBoard(board, n, m);
        int x1, y1, x2, y2;
        UnionFind uf = new UnionFind(n*m);
        HashSet<Integer> log = new HashSet<>();
        for (int queryNum = 0; queryNum < q; queryNum++) {
            uf.init();
            log.clear();
            x1 = sc.nextInt() - 1;
            y1 = sc.nextInt() - 1;
            x2 = sc.nextInt() - 1;
            y2 = sc.nextInt() - 1;
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    int current = i * m + j;
                    if (board[current]) {
                        for (int dx = -1; dx <= 1; dx++) {
                            for (int dy = -1; dy <= 1; dy++) {
                                if (Math.abs(dx) == Math.abs(dy))
                                    continue;
                                if (i + dx < 0 || i + dx >= n ||
                                        i + dx < x1 || i + dx > x2)
                                    continue;
                                if (j + dy < 0 || j + dy >= m
                                        || j + dy < y1 || j + dy > y2)
                                    continue;
                                int diff = (i + dx) * m + (j + dy);
                                if (board[diff])
                                    uf.unite(current, diff);
                            }
                        }
                    }
                }
            }
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    int cur = i * m + j;
                    if (board[i*m+j]) {
                        int par = uf.getParent(i * m + j);
                        log.add(par);
                    }
                }
            }
            System.out.println(log.size());
        }
    }

    public static void printBoard(boolean[] bs, int n, int m) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                boolean tmp = bs[i*m+j];
                if (tmp)
                    System.out.printf("1");
                else
                    System.out.printf("0");
            }
            System.out.println();
        }
    }

    static class UnionFind {
        int[] par, rank;

        UnionFind(int n) {
            par = new int[n];
            rank = new int[n];
            init();
        }

        public void init() {
            for (int i = 0; i < par.length; i++) {
                par[i] = i;
            }
        }

        public int getParent(int x) {
            if (par[x] == x)
                return x;
            return par[x] = getParent(par[x]);
        }

        public void unite(int x, int y) {
            int _x = getParent(x);
            int _y = getParent(y);
            if (_x == _y) {
                return;
            }
            if (rank[_x] < rank[_y]) {
                par[_x] = _y;
            }
            else {
                par[_y] = _x;
                if (rank[_x] == rank[_y])
                    rank[_x]++;
            }
        }

        public boolean isSameParent(int x, int y) {
            return getParent(x) == getParent(y);
        }
    }
}
