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
        BPalindromePhobia solver = new BPalindromePhobia();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPalindromePhobia {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            String s = in.next();
            int a = 0;
            int b = 0;
            int c = 0;
            int l = s.length();
            for (int i = 0; i < l; i++) {
                if (s.charAt(i) == 'a') {
                    a++;
                } else if (s.charAt(i) == 'b') {
                    b++;
                } else {
                    c++;
                }
            }
            l /= 3;
            if ((a == l || a == l + 1) &&
                    (b == l || b == l + 1) &&
                    (c == l || c == l + 1)) {
                out.println("YES");
            } else {
                out.println("NO");
            }

        }

    }
}

