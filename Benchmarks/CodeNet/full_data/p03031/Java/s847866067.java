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
            int m = Integer.parseInt(in.next());
            int s[] = new int[m];
            for (int i = 0; i < m; i++) {
                int k = Integer.parseInt(in.next());

                for (int j = 0; j < k; j++) {
                    s[i] |= (1 << (Integer.parseInt(in.next()) - 1));
                }
            }
            int[] p = new int[m];
            for (int i = 0; i < m; i++) {
                p[i] = Integer.parseInt(in.next());
            }

            int ans = 0;
            for (int i = 0; i < (1 << n); i++) {
                int tot = 0;
                for (int j = 0; j < m; j++) {
                    int and = i & s[j];

                    int t = 0;
                    while (and > 0) {
                        and &= (and - 1);
                        t++;
                    }

                    if (t % 2 == p[j]) {
                        tot++;
                    }
                }

                if (tot == m) {
                    ans++;
                }
            }

            out.println(ans);

        }

    }
}

