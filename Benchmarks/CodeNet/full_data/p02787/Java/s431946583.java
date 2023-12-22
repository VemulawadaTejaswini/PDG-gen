import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static class R {
        public int a;
        public int b;
        public R(int a, int b) { this.a = a; this.b = b; }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<R> l = new ArrayList<>();
        int h = s.nextInt();
        int n = s.nextInt();
        int maxa = 0;
        for (int i = 0; i < n; ++i) {
            int ai = s.nextInt();
            int bi = s.nextInt();
            l.add(new R(ai, bi));
            maxa = Math.max(maxa, ai);
        }

        int maxh = h + maxa;
        long[][] f = new long[n][maxh + 1];
        for (int j = 1; j <= (int)Math.ceil(1.0 * h / l.get(0).a); ++j) {
            f[0][l.get(0).a * j] = l.get(0).b * j;
        }

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j <= maxh; ++j) {
                int maxk = (int)(j / l.get(i).a);
                for (int k = 0; k < maxk; ++k) {
                    if (j < k * l.get(i).a) continue;
                    if (f[i - 1][j - k * l.get(i).a] == 0) continue;

                    long f1 = f[i - 1][j - k * l.get(i).a] + k * l.get(i).b;
                    f[i][j] = f[i][j] == 0 ? f1 : Math.min(f[i][j], f1);
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
        for (int i = h; i <= maxh; ++i) {
            if (f[n - 1][i] > 0) minf = Math.min(minf, f[n - 1][i]);
        }

        System.out.println(minf);
    }
}
