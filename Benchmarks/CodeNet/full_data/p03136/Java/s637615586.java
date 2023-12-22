import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            Integer l[] = new Integer[n];
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                l[i] = Integer.parseInt(in.next());
                tmp += l[i];
            }

            Arrays.sort(l, Comparator.reverseOrder());

            if (tmp - l[0] > l[0]) {
                out.println("Yes");
            } else {
                out.println("No");

            }

        }

    }
}

