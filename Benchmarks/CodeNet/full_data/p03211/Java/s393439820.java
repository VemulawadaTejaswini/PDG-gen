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
            String S = in.next();
            final int like = 753;
            int ans = Integer.MAX_VALUE;

            for (int i = 0; i <= S.length() - 3; i++) {
                int tmp = Integer.parseInt(S.substring(i, i + 3));
                tmp = Math.abs(like - tmp);
                ans = Math.min(ans, tmp);
            }

            // 出力
            out.println(ans);

        }

    }
}

