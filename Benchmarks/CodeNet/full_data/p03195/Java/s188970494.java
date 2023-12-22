import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CADDi_D solver = new CADDi_D();
        solver.solve(1, in, out);
        out.close();
    }

    static class CADDi_D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long a[] = new long[n];
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (in.nextLong() % 2 == 1) {
                    flag = true;
                }
            }

            out.print(flag ? "first" : "second");


        }

    }
}

