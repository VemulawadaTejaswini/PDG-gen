import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        BPostalCode solver = new BPostalCode();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPostalCode {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt();
            String s = in.next();
            for (int i = 0; i < s.length(); i++) {
                if (i == a) {
                    if (s.charAt(i) != '-') {
                        out.println("No");
                        return;
                    }
                } else {
                    if (!Character.isDigit(s.charAt(i))) {
                        out.println("No");
                        return;
                    }
                }
            }
            out.println("Yes");
        }

    }
}

