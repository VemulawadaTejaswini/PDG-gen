import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CAttention solver = new CAttention();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAttention {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int acchi = 0;
            int kocchi = 0;
            int res = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == 'W') {
                    kocchi++;
                } else {
                    acchi++;
                }
            }
            res = acchi;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == 'W') {
                    kocchi--;
                } else {
                    acchi--;
                }
                if (s.charAt(i - 1) == 'W') {
                    acchi++;
                } else {
                    kocchi++;
                }
                res = Math.min(res, acchi);
            }
            out.println(res);
        }

    }
}

