import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        CGreenBin solver = new CGreenBin();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGreenBin {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                char[] c = in.next().toCharArray();
                Arrays.sort(c);
                s[i] = new String(c);
            }
            Arrays.sort(s);
            long res = 0;
            long cnt = 0;
            for (int i = 1; i < n; i++)
                res += s[i].equals(s[i - 1]) ? ++cnt : (cnt = 0);

            out.println(res);

        }

    }
}

