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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int a[][] = new int[2][n];
            for (int i = 0; i < n; i++) {
                a[0][i] = Integer.parseInt(in.next());
            }
            for (int i = 0; i < n; i++) {
                a[1][i] = Integer.parseInt(in.next());
            }
            int ans = 0;
            int sum = 0;
            int ptrx = n - 1;
            int ptry = -1;

            for (int i = 0; i < 2; ) {
                sum = 0;
                for (int j = i; j <= ptrx; j++) {
                    sum += a[0][j];
                }
                if (ptrx >= 0) {
                    for (int j = ptrx; j < n; j++) {
                        sum += a[1][j];
                    }
                }
                ans = Math.max(ans, sum);
                ptrx--;
                if (ptrx < 0) {
                    i++;
                    ptrx = n - 1;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

