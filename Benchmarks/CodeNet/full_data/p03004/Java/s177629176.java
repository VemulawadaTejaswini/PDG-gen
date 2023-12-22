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
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        long[] Rs = new long[]{-100000000000L, 100000000000L};
        long[] Ls = new long[]{-100000000000L, 100000000000L};
        long[] Us = new long[]{-100000000000L, 100000000000L};
        long[] Ds = new long[]{-100000000000L, 100000000000L};
        long[] xm = new long[]{-100000000000L, 100000000000L};
        long[] ym = new long[]{-100000000000L, 100000000000L};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();

            for (int i = 0; i < N; i++) {
                long x = in.nextLong();
                long y = in.nextLong();
                String d = in.next();
                switch (d) {
                    case "R":
                        Rs[0] = Math.max(Rs[0], x);
                        Rs[1] = Math.min(Rs[1], x);
                        ym[0] = Math.max(ym[0], y);
                        ym[1] = Math.min(ym[1], y);
                        break;
                    case "L":
                        Ls[0] = Math.max(Ls[0], x);
                        Ls[1] = Math.min(Ls[1], x);
                        ym[0] = Math.max(ym[0], y);
                        ym[1] = Math.min(ym[1], y);
                        break;
                    case "U":
                        xm[0] = Math.max(xm[0], x);
                        xm[1] = Math.min(xm[1], x);
                        Us[0] = Math.max(Us[0], y);
                        Us[1] = Math.min(Us[1], y);
                        break;
                    case "D":
                        xm[0] = Math.max(xm[0], x);
                        xm[1] = Math.min(xm[1], x);
                        Ds[0] = Math.max(Ds[0], y);
                        Ds[1] = Math.min(Ds[1], y);
                        break;
                }
            }

            double low = 0, hi = 1e8;
            while (true) {
                double temp1 = calc(low);
                double temp2 = calc(hi);
                if (Math.abs(temp1 - temp2) < 0.00000000001) {
                    break;
                }
                if (temp1 < temp2) {
                    hi -= (hi - low) / 3;
                } else {
                    low += (hi - low) / 3;
                }
            }
            out.printf("%.9f", calc(low));
        }

        private double calc(double diff) {
            double xmax = Math.max(xm[0], Math.max(Rs[0] + diff, Ls[0] - diff));
            double xmin = Math.min(xm[1], Math.min(Rs[1] + diff, Ls[1] - diff));
            double ymax = Math.max(ym[0], Math.max(Us[0] + diff, Ds[0] - diff));
            double ymin = Math.min(ym[1], Math.min(Us[1] + diff, Ds[1] - diff));
            return (xmax - xmin) * (ymax - ymin);
        }

    }
}

