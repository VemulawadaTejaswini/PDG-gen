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
            long n = Long.parseLong(in.next());
            long ans = -1;
            long tmp = -1;

            for (int i = 0; i < 5; i++) {
                long x = Long.parseLong(in.next());
                if (n % x == 0) {
                    tmp = n / x;
                } else {
                    tmp = n / x + 1;
                }
                ans = Math.max(ans, tmp);
            }

            // 出力
            out.println(ans + 4);

        }

    }
}

