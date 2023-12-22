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
        A_FallingAsleep solver = new A_FallingAsleep();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_FallingAsleep {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            int N = Integer.parseInt(in.next());
            String s[] = new String[N];
            int t[] = new int[N];
            for (int i = 0; i < N; i++) {
                s[i] = in.next();
                t[i] = Integer.parseInt(in.next());
            }
            String X = in.next();
            int ans = 0;
            int pt = 0;
            int t2[] = new int[N];
            for (int i = 0; i < N; i++) {
                ans += t[i];
                t2[i] = ans;
                if (X.equals(s[i])) {
                    pt = i;
                }
            }

            ans = ans - t2[pt];
            // 出力
            out.println(ans);

        }

    }
}

