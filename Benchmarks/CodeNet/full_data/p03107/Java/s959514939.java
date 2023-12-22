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
            String S = in.next();
            int ans = 0;
            int red = 0;
            int blue = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '0') {
                    red++;
                } else {
                    blue++;
                }
            }

            ans = 2 * Math.min(red, blue);

            // 出力
            out.println(ans);

        }

    }
}

