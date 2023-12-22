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
        BDigits solver = new BDigits();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDigits {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong(), k = in.nextLong(), ans = 0;
            while (n > 0) {
                n /= k;
                ans++;
            }
            out.println(ans);
        }

    }
}

