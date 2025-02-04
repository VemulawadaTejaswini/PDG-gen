package main.tasks;

import lib.io.MyInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskD {
    public void solve(int testNumber, MyInput in, PrintWriter out) {
        h = in.nextInt();
        w = in.nextInt();
        n = in.nextInt();
        a = in.nextIntArray(n);
        ans = new int[h][w];
        int[] dx = new int[]{1,0,-1,0,};
        int[] dy = new int[]{0,1,0,-1,};
        for (int i = 0, x = -1, y = 0, d = 0; i < n; ) {
            while (true) {
                x += dx[d];
                y += dy[d];
                if (x < 0 || x >= w || y < 0 || y >= h || ans[y][x] != 0) {
                    x -= dx[d];
                    y -= dy[d];
                    d = (d+1)%4;
                } else {
                    break;
                }
            }
            ans[y][x] = i+1;
            if (--a[i] == 0) i++;
//            dump(i, x, y);
        }

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                out.print(ans[y][x] + (x==w-1?"\n":" "));
            }
        }
    }

    int n;
    int[] a;
    int w, h;
    int[][] ans;
    static void dump(Object... o) { System.err.println(Arrays.deepToString(o)); }
}
