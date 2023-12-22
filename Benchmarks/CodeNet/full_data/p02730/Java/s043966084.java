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
        BStringPalindrome solver = new BStringPalindrome();
        solver.solve(1, in, out);
        out.close();
    }

    static class BStringPalindrome {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String t = s.substring(0, s.length() / 2);
            String u = s.substring(s.length() / 2 + 1);

            if (isKaibun(s) && isKaibun(t) && isKaibun(u)) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

        boolean isKaibun(String s) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

    }
}

