import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ICoins solver = new ICoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class ICoins {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            double[] p = new double[N];
            for (int c = 0; c < N; c++) {
                p[c] = in.nextDouble();
            }
            double[] pNumHeads = new double[N + 1];
            pNumHeads[0] = 1;
            for (int c = 0; c < N; c++) {
                for (int h = N; h > 0; h--) {
                    pNumHeads[h] = p[c] * pNumHeads[h - 1] + (1 - p[c]) * pNumHeads[h];
                }
                pNumHeads[0] = (1 - p[c]) * pNumHeads[0];
            }
            double res = 0;
            for (int i = (N + 1) / 2; i <= N; i++) {
                res += pNumHeads[i];
            }
            out.println(res);
        }

    }
}

