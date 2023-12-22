import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BComparingStrings solver = new BComparingStrings();
        solver.solve(1, in, out);
        out.close();
    }

    static class BComparingStrings {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();

            StringBuilder ar = new StringBuilder();
            StringBuilder br = new StringBuilder();

            for (int i = 0; i < b; i++) {
                ar.append(a);
            }

            for (int j = 0; j < a; j++) {
                br.append(b);
            }

            int ans = ar.toString().compareTo(br.toString());

            if (ans > 0) out.println(br);
            else out.println(ar);
        }

    }
}

