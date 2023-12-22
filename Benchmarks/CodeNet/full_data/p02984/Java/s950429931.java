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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            int[] ans = new int[N];
            calc(N, A, ans, 0);
            StringBuilder sb = new StringBuilder();
            for (int a : ans) {
                sb.append(a).append(' ');
            }
            out.println(sb.toString().trim());
        }

        private boolean calc(int N, int[] A, int[] ans, int m) {
            if (m == N) {
                return check(A);
            }
            int li = m - 1;
            if (li < 0) {
                li = N - 1;
            }
            int ri = m;
            int rain = Math.min(A[li], A[ri]) * 2;
            for (int i = rain; i >= 0; i -= 2) {
                int r = i / 2;
                A[li] -= r;
                A[ri] -= r;
                if (calc(N, A, ans, m + 1)) {
                    ans[m] = i;
                    return true;
                }
                A[li] += r;
                A[ri] += r;
            }
            return false;
        }

        private boolean check(int[] A) {
            for (int n : A) {
                if (n > 0) {
                    return false;
                }
            }
            return true;
        }

    }
}

