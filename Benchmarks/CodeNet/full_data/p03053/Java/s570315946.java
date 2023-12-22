import java.util.*;
import java.lang.String;


class Main {
    static class Position {
        public Position(int x, int y) {
            this.x = x; this.y = y;
        }
        public int x;
        public int y;
    }

    static int solve(String[] G) {
        int H = G.length;
        int W = G[0].length();
        int INF = Integer.MAX_VALUE/2;
        int[][] step = new int[H][W];
        ArrayList<Position> starts = new ArrayList<Position>();
        for (int i=0; i<H; i++) {
            for(int j=0; j<W; j++) {
                step[i][j] = INF;
                if (G[i].charAt(j) == '#') {
                    starts.add(new Position(i, j));
                }
            }
        }

        int[] dx = new int[] {0,1,0,-1};
        int[] dy = new int[] {1,0,-1,0};

        ArrayDeque<Position> que = new ArrayDeque<Position>();

        for (int i = 0; i < starts.size(); i++) {
            que.addLast(starts.get(i));
            step[starts.get(i).x][starts.get(i).y] = 0;
        }

        int res = 0;
        while (!que.isEmpty()) {
            Position pos = que.removeFirst();
            int x = pos.x; int y = pos.y;
            for (int i=0; i<dx.length; i++) {
                int nx = x + dx[i]; int ny = y + dy[i];
                if (nx<0 || H<=nx || ny<0 || W<=ny) {
                    continue;
                }

                if (step[nx][ny] > step[x][y] + 1) {
                    step[nx][ny] = step[x][y] + 1;
                    que.addLast(new Position(nx, ny));
                    res = Math.max(res, step[nx][ny]);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        String[] A = new String[H];
        for (int i=0; i<H; i++) {
            A[i] = sc.next();
        }

        int ans = solve(A);

        System.out.println(ans);
    }
}
