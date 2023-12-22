import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B105 solver = new B105();
        solver.solve(1, in, out);
        out.close();
    }

    static class B105 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int res = 0;
            for (int i = 1; i <= n; i++) {
                if (yakusu(i) == 8 && i % 2 == 1) res++;
            }
            out.println(res);
        }

        int yakusu(int x) {
            int res = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) res++;
            }
            return res;
        }

    }
}

