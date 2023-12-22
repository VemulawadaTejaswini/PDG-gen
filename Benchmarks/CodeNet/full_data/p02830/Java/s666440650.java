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
            // 整数の入力
            int n = Integer.parseInt(in.next());
            String s = in.next();
            String t = in.next();
            String ans = "";

            for (int i = 0; i < n; i++) {
                ans = ans + s.charAt(i) + t.charAt(i);
            }
            // 出力
            out.println(ans);

        }

    }
}

