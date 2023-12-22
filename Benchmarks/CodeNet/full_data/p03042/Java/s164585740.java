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

            int s_a = Integer.parseInt(S.substring(0, 2));
            int s_b = Integer.parseInt(S.substring(2, 4));
            if (s_a >= 1 && s_a <= 12) {
                if (s_b >= 1 && s_b <= 12) {
                    out.println("AMBIGUOUS");
                } else {
                    out.println("MMYY");
                }
            } else {
                if (s_b >= 1 && s_b <= 12) {
                    out.println("YYMM");
                } else {
                    out.println("NA");
                }
            }
            // 出力

        }

    }
}

