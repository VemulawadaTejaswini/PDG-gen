import java.util.*;

public class Main {

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    static class Pair {
        int h, w;

        public Pair(int h, int w) {
            this.h = h;
            this.w = w;
        }
    }

    static void bfs() {
        visited = new boolean[H][W];
        visited[0][0] = true;
        prev = new Pair[H][W];
        prev[0][0] = new Pair(-1, -1);

        Deque<Pair> que = new ArrayDeque<>();
        que.offer(new Pair(0, 0));

        while (!que.isEmpty()) {
            Pair pair = que.poll();
            int ch = pair.h;
            int cw = pair.w;
            visited[ch][cw] = true;
            if (ch == H-1 && cw == W-1) break;
            for (int dir = 0; dir < 4; ++dir) {
                int nh = ch + dy[dir];
                int nw = cw + dx[dir];

                if (nh < 0 || nh >= H || nw < 0 || nw >= W) continue;
                if (grid[nh][nw] == '#') continue;
                if (visited[nh][nw]) continue;

                prev[nh][nw] = pair;
                que.offer(new Pair(nh, nw));
            }
        }
    }

    static int H;
    static int W;
    static int res = 1;
    static List<List<Edge>> graph;
    static boolean[][] visited;
    static char[][] grid;
    static Pair[][] prev;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = Integer.parseInt(sc.next());
        W = Integer.parseInt(sc.next());
        grid = new char[H][W];
        for (int i = 0; i < H; ++i) grid[i] = sc.next().toCharArray();
        int black = 0;
        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                if (grid[i][j] == '#') ++black;
            }
        }

        bfs();

        if (visited[H-1][W-1]) {
            int h = H - 1;
            int w = W - 1;
            while (true) {
                Pair pair = prev[h][w];
                if (pair.h == -1 && pair.w == -1) break;
                else ++res;
                h = pair.h;
                w = pair.w;
            }
//            System.out.println(res);
            System.out.println((H * W - black - res));
        }
        else
            System.out.println(-1);
    }
}