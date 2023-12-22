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
        FMitsui solver = new FMitsui();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMitsui {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long t1 = in.nextLong();
            long t2 = in.nextLong();
            long a1 = in.nextLong();
            long a2 = in.nextLong();
            long b1 = in.nextLong();
            long b2 = in.nextLong();
            long suma1 = a1 * t1;
            long suma2 = a2 * t2;
            long sumb1 = b1 * t1;
            long sumb2 = b2 * t2;
            long asum = suma1 + suma2;
            long bsum = sumb1 + sumb2;
            if (asum > bsum) {
                if (suma1 > sumb1) {
                    out.println("0");
                } else {
                    long dif = asum - bsum;
                    long tmpdif = sumb1 - suma1;
                    out.println(tmpdif / dif * 2 + 1);
                }
            }
            if (asum < bsum) {
                if (suma1 < sumb1) {
                    out.println("0");
                } else {
                    // a1 > b1 && a2 < b2
                    long diff = bsum - asum;
                    long tmpdiff = suma1 - sumb1;
                    out.println(tmpdiff / diff * 2 + 1);
                }
            }
            if (asum == bsum) {
                out.println("infinity");
            }
        }

    }
}

