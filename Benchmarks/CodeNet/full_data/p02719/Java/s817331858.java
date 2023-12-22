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
        CReplacingInteger solver = new CReplacingInteger();
        solver.solve(1, in, out);
        out.close();
    }

    static class CReplacingInteger {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = Long.parseLong(in.next());
            long k = Long.parseLong(in.next());

            n = n % k;

            long m;
            boolean flg = true;

            while (flg) {
                m = Math.abs(n - k);
                if (m < n) {
                    n = m;
                } else {
                    flg = false;
                }
            }
            out.println(n);
        }

    }
}

