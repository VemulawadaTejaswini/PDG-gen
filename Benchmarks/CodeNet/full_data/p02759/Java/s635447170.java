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
        ADuplexPrinting solver = new ADuplexPrinting();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADuplexPrinting {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            out.println((n + 1) / 2);
        }

    }
}

