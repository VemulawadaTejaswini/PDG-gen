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
        ABC138_a solver = new ABC138_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC138_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            String s = in.next();
            if (a >= 3200) {
                out.println(s);
            } else {
                out.println("red");
            }
        }

    }
}

