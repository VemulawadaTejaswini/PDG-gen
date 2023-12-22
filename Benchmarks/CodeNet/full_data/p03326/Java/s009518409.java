import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPatisserieABC solver = new DPatisserieABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPatisserieABC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 8 pattern
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<Vec3l>[] cake = new ArrayList[8];
            for (int i = 0; i < 8; i++) {
                cake[i] = new ArrayList<>();
            }
            for (int i = 0; i < n; i++) {
                long x = in.nextLong();
                long y = in.nextLong();
                long z = in.nextLong();
                for (int j = 0; j < 8; j++) {
                    int fx = (j & 1) > 0 ? 1 : -1;
                    int fy = (j & 2) > 0 ? 1 : -1;
                    int fz = (j & 4) > 0 ? 1 : -1;
                    cake[j].add(new Vec3l(x * fx, y * fy, z * fz));
                }
            }

            long max = Long.MIN_VALUE;
            for (int i = 0; i < 8; i++) {
                cake[i].sort(Comparator.comparing(v -> -(v.x + v.y + v.z)));
                long sum = 0;
                for (int j = 0; j < m; j++) {
                    sum += cake[i].get(j).x + cake[i].get(j).y + cake[i].get(j).z;
                }
                max = Math.max(max, sum);
            }
            out.println(max);


        }

    }

    static class Vec3l {
        public long x;
        public long y;
        public long z;

        public Vec3l(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

    }
}

