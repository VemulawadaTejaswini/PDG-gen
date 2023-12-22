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
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CStringTransformation solver = new CStringTransformation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStringTransformation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] index = new int[26];
            Arrays.fill(index, -1);
            String s = in.next(), t = in.next();
            for (int i = 0; i < s.length(); i++) {
                int c = t.charAt(i) - 'a';
                if (index[c] >= 0 && s.charAt(index[c]) != s.charAt(i)) {
                    out.println("No");
                    return;
                }
                index[c] = i;
            }
            out.println("Yes");
        }

    }
}

