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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int h = Integer.parseInt(in.next());
            int w = Integer.parseInt(in.next());
            int a[] = new int[n];
            int b[] = new int[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                b[i] = Integer.parseInt(in.next());
                if (a[i] >= h && b[i] >= w) ans++;
            }
            out.println(ans);

        }

    }
}

