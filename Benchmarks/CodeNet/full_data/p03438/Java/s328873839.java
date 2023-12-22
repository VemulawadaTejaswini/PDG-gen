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
        APC001B solver = new APC001B();
        solver.solve(1, in, out);
        out.close();
    }

    static class APC001B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long aSum = 0;
            long bSum = 0;
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                aSum += a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                bSum += b[i];
            }

            long aReq = 0;
            long bReq = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) bReq += a[i] - b[i];
                if (a[i] < b[i]) aReq += (b[i] - a[i]) / 2;
            }

            long count = bSum - aSum;
            if (count > aReq && count > bReq) out.println("Yes");
            else out.println("No");
        }

    }
}

