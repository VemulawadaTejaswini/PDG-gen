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
            int n = Integer.parseInt(in.next());
            String S = in.next();
            int e = 0;
            int w = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'E') e++;
                else w++;
            }

            int ans = S.length();
            int ce = 0;
            int cw = 0;
            for (int i = 0; i < S.length(); i++) {
                int right_e = e - ce;
                if (S.charAt(i) == 'E') --right_e;
                ans = Math.min(ans, cw + right_e);
                if (S.charAt(i) == 'E') ++ce;
                else ++cw;
            }

            // 出力
            out.println(ans);

        }

    }
}

