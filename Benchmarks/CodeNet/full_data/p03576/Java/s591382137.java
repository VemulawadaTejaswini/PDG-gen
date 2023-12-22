import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n, k;
    long[] xs, ys;
    long[] sxs, sys;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        xs = new long[n];
        ys = new long[n];
        sxs = new long[n];
        sys = new long[n];
        for (int i = 0; i < n; i++){
            xs[i] = sc.nextLong();
            ys[i] = sc.nextLong();
            sxs[i] = xs[i];
            sys[i] = ys[i];
        }
    }

    private void solve() {
        Arrays.sort(sxs);
        Arrays.sort(sys);
        int[][] cnts = new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            long x = xs[i];
            long y = ys[i];
            int ix = bs(sxs, x) + 1;
            int iy = bs(sys, y) + 1;
            cnts[iy][ix] = 1;
        }
        for (int i = 0; i < cnts.length; i++) {
            for (int j = 1; j < cnts.length; j++) {
                cnts[i][j] += cnts[i][j-1];
            }
        }
        for (int i = 1; i < cnts.length; i++) {
            for (int j = 0; j < cnts.length; j++) {
                cnts[i][j] += cnts[i-1][j];
            }
        }
        long ans = (sxs[n-1] - sxs[0]) * (sys[n-1] - sys[0]);
        for (int lx = 0; lx < n; lx++) {
            for (int ux = lx + 1; ux < n; ux++) {
                for (int ly = 0; ly < n; ly++) {
                    for (int uy = ly + 1; uy < n; uy++) {
                        int num = cnts[uy+1][ux+1] + cnts[ly][lx] - cnts[uy+1][lx] - cnts[ly][ux+1];
                        if (num >= k) {
                            long tmp = (sxs[ux] - sxs[lx]) * (sys[uy] - sys[ly]);
                            ans = Math.min(ans, tmp);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private int bs(long[] src, long trg) {
        int l = 0;
        int r = src.length;
        while (r > l) {
            int mid = (l + r) / 2;
            if (src[mid] >= trg) {
                r = mid;
            }
            else
                l = mid + 1;
        }
        return l;
    }

}
