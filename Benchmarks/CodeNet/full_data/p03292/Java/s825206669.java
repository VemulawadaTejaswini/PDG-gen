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
        ATaskSchedulingProblem solver = new ATaskSchedulingProblem();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATaskSchedulingProblem {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a1 = in.nextInt(), a2 = in.nextInt(), a3 = in.nextInt();
            int max = Math.max(a1, Math.max(a2, a3));
            int min = Math.min(a1, Math.min(a2, a3));
            out.println(max - min);
        }

    }
}

