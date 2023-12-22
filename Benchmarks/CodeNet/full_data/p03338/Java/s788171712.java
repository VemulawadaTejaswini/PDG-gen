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
            int N = Integer.parseInt(in.next());
            String S = in.next();
            int ans = 0;

            for (int i = 1; i <= N - 1; i++) {
                String X = S.substring(0, i);
                String Y = S.substring(i);
                int cnt = 0;
                for (int j = 0; j < 26; j++) {
                    String tmp = String.valueOf((char) ('a' + j));
                    if (X.contains(tmp) && Y.contains(tmp)) cnt++;
                    ans = Math.max(ans, cnt);
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

