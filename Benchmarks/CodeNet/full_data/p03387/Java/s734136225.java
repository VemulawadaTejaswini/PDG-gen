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
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int c = Integer.parseInt(in.next());
            int ans = 0;
            int mx = Math.max(a, Math.max(b, c));
            int sum = a + b + c;

            if ((3 * mx - sum) % 2 == 0) {
                ans = (3 * mx - sum) / 2;

            } else {
                ans = (3 * (mx + 1) - sum) / 2;

            }

            // 出力
            out.println(ans);

        }

    }
}

