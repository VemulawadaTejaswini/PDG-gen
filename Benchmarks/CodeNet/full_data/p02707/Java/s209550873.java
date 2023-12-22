import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CManagement solver = new CManagement();
        solver.solve(1, in, out);
        out.close();
    }

    static class CManagement {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] sub = new int[n];
            for (int i = 0; i < n - 1; i++) sub[in.nextInt() - 1]++;
            for (int s : sub) out.println(s);
        }

    }
}

