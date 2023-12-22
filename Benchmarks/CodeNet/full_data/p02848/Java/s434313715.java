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
        BROTN solver = new BROTN();
        solver.solve(1, in, out);
        out.close();
    }

    static class BROTN {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int shift = in.nextInt();
            String s = in.next();
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                int tmp = ((s.charAt(i) - 'A') + shift) % 26;
                char newC = (char) ('A' + tmp);
                res.append(newC);
            }
            out.println(res);
        }

    }
}

