import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC104_2 solver = new ABC104_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC104_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String SS = in.next();

            for (int i = 0; i < SS.length() - 1; i++) {
                if (i == 0) {
                    if (SS.charAt(i) != 'A') {
                        out.println("WA");
                        return;
                    }
                } else if (i == 2) {
                    if (SS.charAt(i) != 'C') {
                        out.println("WA");
                        return;
                    }
                } else if (Character.isUpperCase(SS.charAt(i)) == true) {
                    out.println("WA");
                    return;
                }
            }
            out.println("AC");
        }

    }
}

