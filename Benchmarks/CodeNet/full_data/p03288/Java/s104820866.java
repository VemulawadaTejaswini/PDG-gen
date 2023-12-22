import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC104_A solver = new ABC104_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC104_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            if (n < 1200) {
                out.print("ABC");
            } else if (n < 2800) {
                out.print("ARC");
            } else {
                out.print("AGC");
            }
        }

    }
}

