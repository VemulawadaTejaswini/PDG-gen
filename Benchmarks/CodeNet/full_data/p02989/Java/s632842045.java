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
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CDivideTheProblems solver = new CDivideTheProblems();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDivideTheProblems {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] d = new int[n];
            for (int i = 0; i < n; i++) d[i] = in.nextInt();
            Arrays.sort(d);
            out.println(d[n / 2] - d[n / 2 - 1]);
        }

    }
}

