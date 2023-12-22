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
        TravelingPlan solver = new TravelingPlan();
        solver.solve(1, in, out);
        out.close();
    }

    static class TravelingPlan {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n + 2];
            long distance = 0;

            for (int i = 1; i <= n; i++) {
                int aa = in.nextInt();
                a[i] = aa;
                distance += Math.abs(a[i] - a[i - 1]);
            }
            distance += Math.abs(a[n]);
            a[n + 1] = 0;

            for (int i = 1; i <= n; i++) {
                long result = distance;
                if (0 < a[i]) {
                    if (a[i] <= a[i + 1]) {
                        // 変わらない
                    } else {
                        // 右端
                        if (isSame(a[i], a[i - 1])) {
                            result -= Math.abs(a[i] - a[i - 1]) * 2;
                        } else {
                            result -= Math.abs(a[i]) * 2;
                        }

                    }
                } else {
                    if (a[i] <= a[i + 1]) {
                        // 左端
                        if (isSame(a[i], a[i + 1])) {
                            result -= Math.abs(a[i] - a[i + 1]) * 2;
                        } else {
                            result -= Math.abs(a[i]) * 2;
                        }
                    } else {
                        // 変わらない
                    }
                }
                out.println(result);
            }
        }

        public boolean isSame(int a, int b) {
            return Math.signum(a) == Math.signum(b);
        }

    }
}

