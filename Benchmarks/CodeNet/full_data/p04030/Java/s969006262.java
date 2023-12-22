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
            String s = in.next();
            String ans = "";

            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if (tmp == '0' || tmp == '1') {
                    ans += s.charAt(i);
                } else {
                    if (ans.length() > 0) ans = ans.substring(0, ans.length() - 1);
                }
            }

            out.println(ans);

        }

    }
}

