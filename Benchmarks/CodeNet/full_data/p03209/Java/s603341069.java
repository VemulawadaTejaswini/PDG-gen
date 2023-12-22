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
        ABC115_D solver = new ABC115_D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC115_D {
        static private long[] paties = new long[51];
        static private long[] height = new long[51];

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextLong();
            paties(n, paties);
            height(n, height);
            long ans = answer(n, x);

            out.print(ans);


        }

        private long answer(int n, long x) {
            if (n == 0) {
                if (x <= 0) {
                    return 0;
                } else {
                    return 1;
                }
            }

            if (x <= 1 + height[n - 1]) {
                return answer(n - 1, x - 1);
            } else {
                return paties[n - 1] + 1 + answer(n - 1, x - 2 - height[n - 1]);
            }
        }

        private long paties(int n, long[] paties) {
            if (n == 0) {
                paties[n] = 1;
                return 1;
            } else {
                long p = paties(n - 1, paties);
                paties[n] = 2 * p + 1;
                return 2 * p + 1;
            }
        }

        private long height(int n, long[] height) {
            if (n == 0) {
                height[n] = 1;
                return 1;
            } else {
                long h = height(n - 1, height);
                height[n] = 2 * h + 3;
                return 2 * h + 3;
            }

        }

    }
}

