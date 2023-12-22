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
        BAcCepted solver = new BAcCepted();
        solver.solve(1, in, out);
        out.close();
    }

    static class BAcCepted {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            if (s.charAt(0) != 'A' || Character.isUpperCase(s.charAt(1)) || Character.isUpperCase(s.charAt(s.length() - 1))) {
                out.println("WA");
                return;
            }
            int count = 0;
            for (int i = 2; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'C') {
                    count++;
                } else if (Character.isUpperCase(s.charAt(i))) {
                    out.println("WA");
                    return;
                }
            }
            out.println(count == 1 ? "AC" : "WA");
        }

    }
}

