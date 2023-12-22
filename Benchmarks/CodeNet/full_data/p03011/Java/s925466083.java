import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ABC129_a solver = new ABC129_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC129_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int va[] = new int[3];

            for (int i = 0; i < 3; i++) {
                va[i] = in.nextInt();
            }
            Arrays.sort(va);
            out.println(va[0] + va[1]);

        }

    }
}

