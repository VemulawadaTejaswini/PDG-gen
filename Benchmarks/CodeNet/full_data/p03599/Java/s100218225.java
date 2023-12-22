import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        SugarWater solver = new SugarWater();
        solver.solve(1, in, out);
        out.close();
    }

    static class SugarWater {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        double max = 0;
        int sugar;
        int water;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            e = in.nextInt(); // キャパ
            f = in.nextInt(); // Max濃度
            double limit = (double) e / (e + 100);

            for (int aa = 0; aa <= 30; aa++) {
                for (int bb = 0; bb <= 30; bb++) {
                    if (aa == 0 && bb == 0) {
                        continue;
                    }
                    for (int cc = 0; cc <= 100; cc++) {
                        for (int dd = 0; dd <= 100; dd++) {
                            int water = (aa * a * 100) + (bb * b * 100);
                            int sugar = (cc * c) + (dd * d);
                            if (f < sugar + water) {
                                continue;
                            }
                            if (limit < (double) sugar / (sugar + water)) {
                                continue;
                            }
                            double kosa = (double) 100 * sugar / (water + sugar);
                            if (max < kosa) {
                                max = kosa;
                                this.sugar = sugar;
                                this.water = water;
                            }
                        }
                    }
                }
            }

            if (max > 0) {
                out.println(sugar + water + " " + sugar);

            } else {
                out.println(100 * a + " " + 0);
            }

        }

    }
}

