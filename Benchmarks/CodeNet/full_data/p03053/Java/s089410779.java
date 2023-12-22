package Qa;

import java.util.*;
import java.lang.String;


public class Main {
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
        var step = new int[H][W];
        var starts = new ArrayList<Position>();
        for (int i=0; i<H; i++) {
            for(int j=0; j<W; j++) {
                step[i][j] = INF;
                if (G[i].charAt(j) == '#') {
                    starts.add(new Position(i, j));
                }
            }
        }

        var dx = new int[] {0,1,0,-1};
        var dy = new int[] {1,0,-1,0};

        var que = new ArrayDeque<Position>();

        for (var start : starts) {
            que.addLast(start);
            step[start.x][start.y] = 0;
        }

        int res = 0;
        while (!que.isEmpty()) {
            var pos = que.removeFirst();
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
        var sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        var A = new String[H];
        for (int i=0; i<H; i++) {
            A[i] = sc.next();
        }

        int ans = solve(A);

        System.out.println(ans);
    }
}
