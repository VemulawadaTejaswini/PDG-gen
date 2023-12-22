import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EMitsui solver = new EMitsui();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMitsui {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int MOD = (int) 1e9 + 7;
            int n = in.nextInt();
            int[] ar = new int[n];
            int res = 1;
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
            }
            // max -> n-1なのでそれでいい
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                if (ar[i] == 0) {
                    res = (res * (3 - num[0])) % MOD;
                } else {
                    res = (res * (num[ar[i] - 1] - num[ar[i]])) % MOD;
                }
                num[ar[i]]++;
            }
            out.println(res);
        }

    }
}

