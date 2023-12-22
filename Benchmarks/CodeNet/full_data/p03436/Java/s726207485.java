import java.util.*;

public class Main {

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
        dist = new int[H][W];
        dist[0][0] = 1;

        Deque<Pair> que = new ArrayDeque<>();
        que.offer(new Pair(0, 0));

        while (!que.isEmpty()) {
            Pair pair = que.poll();
            if (pair.h == H-1 && pair.w == W-1) break;

            for (int dir = 0; dir < 4; ++dir) {
                int nh = pair.h + dy[dir];
                int nw = pair.w + dx[dir];

                if (nh < 0 || nh >= H || nw < 0 || nw >= W) continue;
                if (visited[nh][nw]) continue;
                if (grid[nh][nw] == '#') continue;

                dist[nh][nw] = dist[pair.h][pair.w] + 1;
                visited[nh][nw] = true;
                que.offer(new Pair(nh, nw));
            }
        }
    }

    static int H;
    static int W;
    static boolean[][] visited;
    static char[][] grid;
    static int[][] dist;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = Integer.parseInt(sc.next());
        W = Integer.parseInt(sc.next());
        int white = 0;
        grid = new char[H][W];
        for (int i = 0; i < H; ++i) {
            grid[i] = sc.next().toCharArray();
            for (int j = 0; j < W; ++j) {
                if (grid[i][j] == '.') ++white;
            }
        }

        bfs();

        if (visited[H-1][W-1])
            System.out.println(white - dist[H-1][W-1]);
        else
            System.out.println(-1);
    }
}