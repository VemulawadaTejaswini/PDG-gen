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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力

            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int ans = 0;

            // 累積和
            Integer s[] = new Integer[1000];
            s[0] = 1;
            for (int i = 2; i < 1000; ++i) {
                s[i - 1] = s[i - 2] + i;
            }

            for (int i = 1; i < 1000; i++) {
                if ((s[i] - s[i - 1]) == (b - a)) {
                    ans = s[i] - b;
                    break;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

