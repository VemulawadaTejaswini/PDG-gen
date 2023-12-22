import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        BTaxRate solver = new BTaxRate();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTaxRate {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            double price = n / 1.08;
            int p = (int) Math.ceil(price);
            if (p * 1.08 - n >= 1) {
                out.println(":(");
                return;
            }
            out.println(p);
        }

    }
}

