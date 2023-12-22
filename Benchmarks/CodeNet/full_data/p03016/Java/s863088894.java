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
        FTakahashisBasicsInEducationAndLearning solver = new FTakahashisBasicsInEducationAndLearning();
        solver.solve(1, in, out);
        out.close();
    }

    static class FTakahashisBasicsInEducationAndLearning {
        long m = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long l = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            m = in.nextLong();

            long res = solve(l, a % m, b % m);
            out.println(res);
        }

        private long solve(long l, long a, long b) {
            long res = 0;
            int max = 19;
            long pos[] = new long[max];
            long left = 0;
            long right = l;
            long target = 1;
            long mid = 0;
            for (int k = 0; k < max; k++) {
                left = mid;
                right = l;
                long found = -1;
                while (left < right) {
                    mid = (left + right) / 2;
                    if (a + b * mid > target) {
                        found = mid;
                        right = mid - 1;
                    } else if (a + b * mid < target) {
                        left = mid + 1;
                    } else {
                        found = mid;
                        right = mid - 1;
                    }
                }
                pos[k] = found;

                target *= 10;
            }

            boolean isDone = false;
            long x = 0;
            long s = a;
            for (int i = 0; i < max - 1; i++) {
                long res2 = 0;
                long res1 = 0;

                if (pos[i + 1] == -1) {
                    isDone = true;
                    pos[i + 1] = l;
                }

                long[][] init = getInitMatrix(x, s, i, b);
                long[][] matrix = powMatrix(init, pos[i + 1] - pos[i]);
                long sOld = s;
                long xOld = x;
                x = matrix[0][0] * xOld;
                x %= m;
                x += matrix[0][1] * sOld;
                x %= m;
                x += matrix[0][2];
                x %= m;

                s = matrix[1][0] * xOld;
                s %= m;
                s += matrix[1][1] * sOld;
                s %= m;
                s += matrix[1][2];
                s %= m;

                if (isDone)
                    break;
            }
            return x;
        }

        private long[][] powMatrix(long[][] init, long n) {
            if (n == 0)
                return new long[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
            long[][] tmp = powMatrix(init, n / 2);
            long[][] res = multMatrix(tmp, tmp);
            if (n % 2 == 0)
                return res;
            else
                return multMatrix(res, init);
        }

        private long[][] multMatrix(long[][] m1, long[][] m2) {
            long[][] res = new long[3][3];
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++) {
                    res[i][j] = m1[i][0] * m2[0][j];
                    res[i][j] %= m;
                    res[i][j] += m1[i][1] * m2[1][j];
                    res[i][j] %= m;
                    res[i][j] += m1[i][2] * m2[2][j];
                    res[i][j] %= m;
                }
            return res;
        }

        private long[][] getInitMatrix(long x, long s, int d, long b) {
            long tmp = 1;
            for (int i = 0; i <= d; i++) {
                tmp *= 10;
                tmp %= m;
            }
            return new long[][]{{tmp, 1, 0}, {0, 1, b}, {0, 0, 1}};
        }

    }
}

