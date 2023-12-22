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
            int ans = 0;

            int len = S.length();

            for (int i = len - 2; i > 0; i -= 2) {
                String tmp = S.substring(0, len - i);
                if (tmp.length() % 2 != 0) continue;
                String tmphalf = tmp.substring(0, tmp.length() / 2);
                if ((tmphalf + tmphalf).equals(tmp)) {
                    ans = tmp.length();
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

