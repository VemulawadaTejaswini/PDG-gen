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
            int n = Integer.parseInt(in.next());
            int w[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                w[i] = Integer.parseInt(in.next());
                sum += w[i];
            }

            int b = sum;
            int b_pre = 0;
            for (int i = 0; i < n; i++) {
                b_pre += w[i];
                b = Math.min(b, Math.abs(b_pre - (sum - b_pre)));
            }
            out.println(b);
        }

    }
}

