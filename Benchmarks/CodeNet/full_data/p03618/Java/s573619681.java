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
        BReverseandCompare solver = new BReverseandCompare();
        solver.solve(1, in, out);
        out.close();
    }

    static class BReverseandCompare {
        static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            long len = s.length();
            long res = len * (len - 1) / 2;
            for (int i = 0; i < 26; i++) {
                long cnt = 0;
                for (int j = 0; j < len; j++) {
                    if (s.charAt(j) == alphabet[i]) {
                        cnt++;
                    }
                }
                res -= cnt * (cnt - 1) / 2;
            }
            out.println(res + 1);
        }

    }
}

