import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static class R {
        public int a;
        public int b;
        public R(int a, int b) { this.a = a; this.b = b; }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int n = s.nextInt();
        R[] l = new R[n];
        int maxa = 0;
        for (int i = 0; i < n; ++i) {
            int ai = s.nextInt();
            int bi = s.nextInt();
            l[i] = new R(ai, bi);
            maxa = Math.max(maxa, ai);
        }

        int maxh = h + maxa + 1;
        long[][] f = new long[n][maxh];

        for (int i = 0; i < n; ++i) {
            Arrays.fill(f[i], Long.MAX_VALUE);
        }

        for (int j = 1; j <= (int)(1.0 * maxh / l[0].a); ++j) {
            f[0][l[0].a * j] = l[0].b * j;
        }

        for (int i = 1; i < n; ++i) {
            for (int j = l[i].a; j < maxh; ++j) {
                if (f[i][j - l[i].a] != Long.MAX_VALUE) {
                    f[i][j] = f[i][j - l[i].a] + l[i].b;
                }

                if (f[i - 1][j] != Long.MAX_VALUE) {
                    f[i][j] = f[i][j] == 0 ? f[i - 1][j] : Math.min(f[i][j], f[i - 1][j]);
                }
            }
        }

//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < maxh; ++j) {
//                System.out.print(f[i][j] + " ");
//            }
//            System.out.println();
//        }

        long minf = Long.MAX_VALUE;
        for (int i = h; i < maxh; ++i) {
            if (f[n - 1][i] != Long.MAX_VALUE) minf = Math.min(minf, f[n - 1][i]);
        }

        System.out.println(minf);
    }
}
