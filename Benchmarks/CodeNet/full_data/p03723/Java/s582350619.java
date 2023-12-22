import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ACookieExchanges solver = new ACookieExchanges();
        solver.solve(1, in, out);
        out.close();
    }

    static class ACookieExchanges {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            if (a == b && b == c) {
                out.println(-1);
                return;
            }
            for (int i = 1; ; i++) {
                int na = (b + c) / 2, nb = (c + a) / 2, nc = (a + b) / 2;
                if (na % 2 == 1 || nb % 2 == 1) {
                    out.println(i);
                    return;
                }
                a = na;
                b = nb;
                c = nc;
            }
        }

    }
}

