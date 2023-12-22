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
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABBQEasy solver = new ABBQEasy();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABBQEasy {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] l = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                l[i] = in.nextInt();
            }
            Arrays.sort(l);
            int ans = 0;
            for (int i = 0; i < 2 * n; i += 2) {
                ans += l[i];
            }
            out.println(ans);
        }

    }
}

