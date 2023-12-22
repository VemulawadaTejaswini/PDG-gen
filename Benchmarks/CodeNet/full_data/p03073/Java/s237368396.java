import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CColoringColorfully solver = new CColoringColorfully();
        solver.solve(1, in, out);
        out.close();
    }

    static class CColoringColorfully {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int nbChanges = solve1(s);
            out.println(nbChanges);
        }

        private int solve1(String s) {
            return Math.min(solve1(s, s.length() - 1, s.charAt(s.length() - 1) == '0'),
                    solve1(s, s.length() - 1, s.charAt(s.length() - 1) == '1'))
                    ;
        }

        private int solve1(String s, int pos, boolean endWith0) {
            if (pos == 0) {
                return s.charAt(0) == '0' == endWith0 ? 0 : 1;
            }

            int nbChanges1 = solve1(s, pos - 1, !endWith0);
            if ((s.charAt(pos) == '0') != endWith0)
                nbChanges1++;

            return nbChanges1;
        }

    }
}

