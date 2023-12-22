import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
        DXorSum2 solver = new DXorSum2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXorSum2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int count = n;
            outer:
            for (int l = 0; l < n; l++) {
                int b = a[l];
                for (int j = l + 1; j < n; j++) {
                    if ((b & a[j]) == 0) {
                        b = b | a[j];
                        count++;
                    } else {
                        continue outer;
                    }
                }
            }
            System.out.println(count);
        }

    }
}

