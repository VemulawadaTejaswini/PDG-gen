import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        AMaximizeTheFormula solver = new AMaximizeTheFormula();
        solver.solve(1, in, out);
        out.close();
    }

    static class AMaximizeTheFormula {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] ns = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
            Arrays.sort(ns);
            out.println(10 * ns[2] + ns[1] + ns[0]);
        }

    }
}

