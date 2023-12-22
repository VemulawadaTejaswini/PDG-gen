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
        CAlchemist solver = new CAlchemist();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAlchemist {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            double[] v = new double[n];
            for (int i = 0; i < n; i++) v[i] = in.nextDouble();
            Arrays.sort(v);
            double sum = (v[0] + v[1]) / 2;
            for (int i = 2; i < n; i++) {
                sum = (sum + v[i]) / 2;
            }
            out.println(sum);
        }

    }
}

