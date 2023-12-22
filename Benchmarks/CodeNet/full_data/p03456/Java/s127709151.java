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
        B121 solver = new B121();
        solver.solve(1, in, out);
        out.close();
    }

    static class B121 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int m = Integer.parseInt(in.next() + in.next());
            for (int i = 1; i < 10000; i++) {
                if (m == i * i) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");
        }

    }
}

