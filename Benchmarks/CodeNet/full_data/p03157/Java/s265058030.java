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
        int H = scan.nextInt();
        int W = scan.nextInt();
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            String s = scan.next();
            map[i] = s.toCharArray();
        }
        UnionFind union = new UnionFind(H, W, map);
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (j + 1 < W && is_connect(map, i, j, i, j+1)) {
                    union.unite(i * W + j, i * W + j + 1);
                }
                if (i + 1 < H && is_connect(map, i, j, i+1, j)) {
                    union.unite(i * W + j, (i + 1) * W + j);
                }
            }
        }
        long answer = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i][j] == '#') {
                    answer += union.white(i * W + j);
                }
            }
        }
        System.out.println(answer);
    }
    private boolean is_connect(char[][] map, int x1, int y1, int x2, int y2) {
        if (map[x1][y1] == '#' && map[x2][y2] == '.') {
            return true;
        }
        return map[x1][y1] == '.' && map[x2][y2] == '#';
    }
    class UnionFind {
        private int H;
        private int W;
        private char[][] map;
        private int[] size;
        private int[] parent;
        private int[] white;
        UnionFind(int H, int W, char[][] map) {
            this.H = H;
            this.W = W;
            int N = H * W;
            this.map = map;
            this.size = new int[N];
            Arrays.fill(this.size, 0);
            this.parent = new int[N];
            for (int i = 0; i < N; i++) {
                this.parent[i] = i;
            }
            this.white = new int[N];
            Arrays.fill(this.white, 0);
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (map[i][j] == '.') {
                        this.white[i * W + j] = 1;
                    }
                }
            }
        }
        int white(int i) {
            int x = find(i);
            return this.white[x];
        }
        int find(int i) {
            if (this.parent[i] == i) {
                return i;
            }
            return this.parent[i] = find(this.parent[i]);
        }
        boolean same(int i, int j) {
            return find(i) == find(j);
        }
        void unite(int i, int j) {
            int x = this.find(i);
            int y = this.find(j);
            if (x == y) {
                return;
            }
            if (this.size[x] < this.size[y]) {
                this.size[y] += this.size[x];
                this.white[y] += this.white[x];
                this.size[x] = 0;
                this.white[x] = 0;
                this.parent[x] = y;
                return;
            }
            this.size[x] += this.size[y];
            this.white[x] += this.white[y];
            this.size[y] = 0;
            this.white[y] = 0;
            this.parent[y] = x;
        }
    }
}
