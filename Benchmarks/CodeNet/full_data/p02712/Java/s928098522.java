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
        BFizzBuzzSum solver = new BFizzBuzzSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class BFizzBuzzSum {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long sum = 0;
            for (int i = 1; i <= n; i++) if (i % 3 != 0 && i % 5 != 0) sum += i;
            out.println(sum);
        }

    }
}

