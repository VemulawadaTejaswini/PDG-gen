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
        BCardGameForTwo solver = new BCardGameForTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCardGameForTwo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            Arrays.sort(a);
            int alice = 0;
            int bob = 0;
            for (int i = n - 1; i >= 0; i--) {
                if ((n - 1 - i) % 2 == 0) alice += a[i];
                else bob += a[i];
            }
            out.println(alice - bob);
        }

    }
}

