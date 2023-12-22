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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            int s_left[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                s_left[i + 1] = s_left[i] + a[i];
            }

            int ptr_l = 0;
            int ptr_r = n - 1;
            long sum_l = 0;
            long sum_r = 0;

            while (ptr_l <= ptr_r) {
                if (sum_l <= sum_r) {
                    sum_l += a[ptr_l];
                    ptr_l++;
                } else {
                    sum_r += a[ptr_r];
                    ptr_r--;
                }
            }

            long ans = Math.abs(sum_l - sum_r);
            // 出力
            out.println(ans);

        }

    }
}

