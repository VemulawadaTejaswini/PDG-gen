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
            int n = Integer.parseInt(in.next());
            int lr[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                lr[i][0] = Integer.parseInt(in.next());
                lr[i][1] = Integer.parseInt(in.next());
            }
            long ans = 0;

            for (int i = 0; i < n; i++) {
                ans += lr[i][1] - lr[i][0] + 1;
            }

            // 出力
            out.println(ans);

        }

    }
}

