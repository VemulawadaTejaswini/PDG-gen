import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CRally solver = new CRally();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRally {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int stamina = Integer.MAX_VALUE;

            for (int i = 1; i <= 100; i++) {
                int st = 0;
                for (int j = 0; j < n; j++) {
                    st += Math.pow(i - arr[j], 2);
                }
                stamina = Math.min(st, stamina);
            }

            out.println(stamina);
        }

    }
}

