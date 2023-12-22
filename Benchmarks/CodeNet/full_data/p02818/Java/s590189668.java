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
            long A = Long.parseLong(in.next());
            long B = Long.parseLong(in.next());
            long K = Long.parseLong(in.next());
            String ans = "";

            if (A >= K) {
                ans = String.valueOf(A - K) + " " + String.valueOf(B);
            } else if (A < K && K <= A + B) {
                ans = String.valueOf(0) + " " + String.valueOf(B - (K - A));
            } else {
                ans = String.valueOf(0) + " " + String.valueOf(0);
            }

            out.println(ans);
            return;
        }

    }
}

