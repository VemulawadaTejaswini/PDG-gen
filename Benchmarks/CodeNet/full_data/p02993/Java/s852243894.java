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
        ASecurity solver = new ASecurity();
        solver.solve(1, in, out);
        out.close();
    }

    static class ASecurity {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String S = in.next();
            boolean ok = false;
            if (S.charAt(0) == S.charAt(1) && S.charAt(1) == S.charAt(2) && S.charAt(2) == S.charAt(3)) {
                ok = true;

            } else if (S.charAt(0) == S.charAt(1) && S.charAt(1) == S.charAt(2) || S.charAt(1) == S.charAt(2) && S.charAt(2) == S.charAt(3)) {
                ok = true;

            } else if (S.charAt(0) == S.charAt(1) || S.charAt(1) == S.charAt(2) || S.charAt(2) == S.charAt(3)) {
                ok = true;

            }
            out.println(ok ? "Bad" : "Good");

        }

    }
}

