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
            int a[] = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            int ans = 0;
            int odd = 0;
            int even = 0;

            for (int i = 0; i < 3; i++) {
                if (a[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if (even == 2) {
                ans++;
                for (int i = 0; i < 3; i++) {
                    if (a[i] % 2 == 0) a[i]++;
                }
            } else if (odd == 2) {
                ans++;
                for (int i = 0; i < 3; i++) {
                    if (a[i] % 2 == 1) a[i]++;
                }

            }
            int mx = Math.max(a[0], Math.max(a[1], a[2]));
            for (int i = 0; i < 3; i++) {
                ans += (mx - a[i]) / 2;
            }
            // 出力
            out.println(ans);

        }

    }
}

