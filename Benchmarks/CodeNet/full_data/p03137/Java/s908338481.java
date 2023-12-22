import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());

            if (n >= m) {
                out.println(0);
                return;
            }
            int[] x = new int[m];
            for (int i = 0; i < m; i++) {
                x[i] = Integer.parseInt(in.next());
            }
            Arrays.sort(x);
            int[] diff = new int[m];
            for (int i = 0; i < m - 1; i++) {
                diff[i] = Math.abs(x[i] - x[i + 1]);
            }
            Arrays.sort(diff);

            int tmp = 0;
            for (int i = 1; i < n; i++) {
                tmp += diff[m - i];
            }
            // 出力
            out.println(x[m - 1] - x[0] - tmp);

        }

    }
}

