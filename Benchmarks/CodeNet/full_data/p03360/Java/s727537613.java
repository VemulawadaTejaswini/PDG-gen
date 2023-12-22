import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC096B solver = new ABC096B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC096B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int K = in.nextInt();
            int m = Math.max(A, Math.max(B, C));
            int n = A + B + C - m;
            for (int i = 0; i < K; i++) {
                m = m * 2;
            }
            out.println(m + n);
        }

    }
}

