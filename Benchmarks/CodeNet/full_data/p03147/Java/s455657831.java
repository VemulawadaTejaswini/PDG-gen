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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        static int maxdex = -1;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int h[] = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(in.next());
            }
            int ans = 0;

            while (true) {
                if (max2(h) == 0) break;
                int i = 0;
                while (i < n) {
                    if (h[i] == 0) {
                        ++i;
                    } else {
                        ++ans;
                        while (i < n && h[i] > 0) {
                            --h[i];
                            ++i;
                        }
                    }
                }
            }

            // 出力
            out.println(ans);

        }

        public static int max2(int[] a) {
            int M = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (M < a[i]) {
                    M = a[i];
                    maxdex = i;
                }
            }
            return M;
        }

    }
}

