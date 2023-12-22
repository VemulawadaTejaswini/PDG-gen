import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();

            int initSum = 0;
            int res = 0;
            int currSum = 0;
            for (int nb = 1; nb <= n; nb++) {
                initSum += a[nb - 1];
                initSum %= k;

                currSum = initSum;
                for (int start = 0; start + nb - 1 < n; start++) {
                    if (start > 0) {
                        currSum -= a[start - 1];
                        currSum += a[start + nb - 1];
                        currSum = Math.floorMod(currSum, k);
                    }
                    //System.err.println("currSum = " + currSum + " ; nb = " + nb );
                    if (currSum == nb)
                        res++;
                }
            }
            out.println(res);
        }

    }
}

