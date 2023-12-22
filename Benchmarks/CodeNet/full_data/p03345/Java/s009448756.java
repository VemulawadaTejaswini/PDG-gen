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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());
            long c = Long.parseLong(in.next());
            long k = Long.parseLong(in.next());
            long ans = 0;

            long tmpa = 0;
            long tmpb = 0;
            long tmpc = 0;

            if (a == b && b == c && c == a) {

            } else {
                for (int i = 0; i < k; i++) {
                    tmpa = b + c;
                    tmpb = a + c;
                    tmpc = a + b;
                    a = tmpa;
                    b = tmpb;
                    c = tmpc;
                }
            }
            // 出力
            ans = a - b;
            if (Math.abs(ans) >= 1_000_000_000_000_000_000L) out.println("Unfair");
            else out.println(ans);

        }

    }
}

