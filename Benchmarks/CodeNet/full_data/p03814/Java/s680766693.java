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
            int apos = 0;
            int zpos = 0;

            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'A') {
                    apos = i;
                    break;
                }
            }

            for (int i = S.length() - 1; i > 1; i--) {
                if (S.charAt(i) == 'Z') {
                    zpos = i + 1;
                    break;
                }
            }

            ans = zpos - apos;

            // 出力
            out.println(ans);

        }

    }
}

