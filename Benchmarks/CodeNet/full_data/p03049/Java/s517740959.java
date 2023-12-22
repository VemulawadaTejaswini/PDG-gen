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
        CABSubstrings solver = new CABSubstrings();
        solver.solve(1, in, out);
        out.close();
    }

    static class CABSubstrings {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int cntAB = 0;
            int finA = 0;
            int staB = 0;
            int both = 0;
            for (int i = 0; i < n; i++) {
                String s = in.next();
                if (s.startsWith("B") && s.endsWith("A")) both++;
                else if (s.startsWith("B")) staB++;
                else if (s.endsWith("A")) finA++;
                cntAB += f(s);
            }
            out.println(staB + finA > 0 ? cntAB + Math.min(staB, finA) + both : cntAB + both - 1);
        }

        int f(String s) {
            // "AB"を数える
            int res = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') res++;
            }
            return res;
        }

    }
}

