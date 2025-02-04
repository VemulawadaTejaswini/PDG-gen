
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    int H, W;
    long[][] sum;

    void run() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        sum = new long[H + 1][W + 1];

        for (int i = 1; i <= H; i++) {
            String s = sc.next();
            for (int j = 1; j <= W; j++) {
                sum[i][j] = s.charAt(j - 1) == '.' ? 1 : 100000;
                sum[i][j] += -sum[i - 1][j - 1] + sum[i - 1][j] + sum[i][j - 1];
            }
        }
        for (long[] a: sum) debug(a);
        mem = new int[W + 1][H + 1][W + 1][H + 1];
        for (int[][][] a: mem) for (int[][] b: a) for (int[] c: b) Arrays.fill(c, -1);
        System.out.println(solve(1, 1, W, H));
    }
    int[][][][] mem;
    int solve(int sx, int sy, int ex, int ey) {
//        debug("start", sx, sy, ex, ey, mem[sx][sy][ex][ey], area(sx, sy, ex, ey));
        if (mem[sx][sy][ex][ey] >= 0) return mem[sx][sy][ex][ey];
        long area = area(sx, sy, ex, ey);
        if (area == (ex - sx + 1) * (ey - sy + 1) || area == (ex - sx + 1) * (ey - sy + 1) * 100000) {
            mem[sx][sy][ex][ey] = 0;
//            debug("init", sx, sy, ex, ey, mem[sx][sy][ex][ey], area(sx, sy, ex, ey));
            return 0;
        }
        int ret = H * W;
        for (int x = sx; x < ex; x++) {
            ret = Math.min(ret, Math.max(solve(sx, sy, x, ey), solve(x + 1, sy, ex, ey)));
        }
        for (int y = sy; y < ey; y++) {
            ret = Math.min(ret, Math.max(solve(sx, sy, ex, y), solve(sx, y + 1, ex, ey)));
        }
        mem[sx][sy][ex][ey] = ret + 1;
//        debug("end", sx, sy, ex, ey, ret, mem[sx][sy][ex][ey], area(sx, sy, ex, ey));
        return ret + 1;
    }

    long area(int sx, int sy, int ex, int ey) {
        return sum[ey][ex] + sum[sy - 1][sx - 1] - sum[ey][sx - 1] - sum[sy - 1][ex];
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
