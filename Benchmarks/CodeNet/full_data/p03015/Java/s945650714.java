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
        ESumEqualsXor solver = new ESumEqualsXor();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESumEqualsXor {
        public static int MOD = 1_000_000_007;
        public long[] tmp = new long[100002];

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            tmp[0] = 1;
            for (int i = 1; i < tmp.length; i++) {
                tmp[i] = 3 * tmp[i - 1];
                tmp[i] %= MOD;
            }
            String l = in.next();
            long res = solveMe(l);
            out.println(res);


        /*for (int i=0; i<=100; i++) {
            out.println("i= " + Integer.toBinaryString(i) + " ; s = " + solveMe("" + Integer.toBinaryString(i)));
            out.println(solveMeSimple(i));
        }*/
        }

        private long solveMe(String l) {
            int pos = l.length() - 1;
            for (int i = 0; i < l.length(); i++)
                if (l.charAt(i) == '1') {
                    pos = i;
                    break;
                }
            return solveMeRec(l, pos);
        }

        private long solveMeRec(String l, int pos) {
            if (l.length() - 1 == pos)
                return l.charAt(pos) == '0' ? 1 : 3;
            long res = tmp[l.length() - pos - 1];

            int pos2 = l.length() - 1;
            for (int i = pos + 1; i < l.length(); i++)
                if (l.charAt(i) == '1') {
                    pos2 = i;
                    break;
                }
            long res2 = solveMeRec(l, pos2);
            res2 *= (l.charAt(pos) == '0' ? 1 : 2);
            res2 %= MOD;
            res += res2;
            res %= MOD;
            return res;

        }

    }
}

