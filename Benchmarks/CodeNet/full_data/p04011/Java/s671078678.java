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
            int n = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next());
            int y = Integer.parseInt(in.next());
            long ans = 0;

            if (n > k) {
                ans = (n - k) * y;
                ans += k * x;
            } else {
                ans += n * x;
            }

            // 出力
            out.println(ans);

        }

    }
}

