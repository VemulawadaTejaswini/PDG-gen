import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC090A solver = new ABC090A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC090A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            for (int i = 0; i < 3; i++) {
                String s = in.next();
                out.print(s.charAt(i));
            }
        }

    }
}

