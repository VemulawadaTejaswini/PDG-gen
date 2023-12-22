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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        Scanner in;
        PrintWriter out;

        void solve1(int L, String sl, int R, String sr) {
            int M = (L + R) / 2;
            out.println(M);
            out.flush();
            String sm = in.next();
            if (sm.equals("Vacant")) {
                return;
            }
            if (sl.equals(sm) ^ (M - L - 1) % 2 == 1) {
                solve1(L, sl, M, sm);
            } else {
                solve1(M, sm, R, sr);
            }
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = in.nextInt();
            out.println(0);
            out.flush();
            String s0 = in.next();
            if (s0.equals("Vacant")) {
                return;
            }
            out.println(n / 2);
            out.flush();
            String s1 = in.next();
            if (s1.equals("Vacant")) {
                return;
            }
            int len01 = n / 2 - 1;
            if (s0.equals(s1) ^ len01 % 2 == 1) {
                solve1(0, s0, n / 2, s1);
            } else {
                solve1(n / 2, s1, n, s0);
            }
        }

    }
}

