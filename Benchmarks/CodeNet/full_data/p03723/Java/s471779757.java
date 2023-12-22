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
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int c = Integer.parseInt(in.next());
            int ans = 0;

            if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 && a == b && b == c && a == c) {
                out.println(-1);
                return;
            }

            while (true) {
                if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) break;
                int take_a = a / 2;
                int take_b = b / 2;
                int take_c = c / 2;

                a = take_a + take_c;
                b = take_b + take_a;
                c = take_c + take_b;
                ans++;

            }

            // 出力
            out.println(ans);

        }

    }
}

