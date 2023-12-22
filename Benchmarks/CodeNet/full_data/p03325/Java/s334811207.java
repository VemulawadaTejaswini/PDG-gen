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
        C3Or2 solver = new C3Or2();
        solver.solve(1, in, out);
        out.close();
    }

    static class C3Or2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int res = solve(a);
            out.println(res);
        }

        private int solve(int[] a) {
            int res = 0;
            for (int val : a) {
                while (val % 2 == 0) {
                    val /= 2;
                    res++;
                }
            }
            return res;
        }

    }
}

