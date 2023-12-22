import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Xinyi Tao
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B0Or1SwapABC135 solver = new B0Or1SwapABC135();
        solver.solve(1, in, out);
        out.close();
    }

    static class B0Or1SwapABC135 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int c = 0;
            for (int i = 1; i <= n; i++) {
                if (in.nextInt() == i) c++;
            }
            out.println(c == n || c + 2 == n ? "YES" : "NO");

        }

    }
}

